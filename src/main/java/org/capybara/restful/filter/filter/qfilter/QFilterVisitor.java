package org.capybara.restful.filter.filter.qfilter;

import org.capybara.restful.filter.filter.paser.RestFilterBaseVisitor;
import org.capybara.restful.filter.filter.paser.RestFilterParser;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 生成QFilter的访问器
 *
 * @author long jie
 * @since 2024/12/8 20:53
 */
public class QFilterVisitor extends RestFilterBaseVisitor<QFilter> {

    private static final Map<String, QFilter.Operator> operatorMap;
    private static final String LOGIC_OP_AND = "AND";
    private static final String LOGIC_OP_OR = "OR";

    static {
        operatorMap = new HashMap<>();
        operatorMap.put("EQ", QFilter.Operator.equals);
        operatorMap.put("NQ", QFilter.Operator.not_equals);
        operatorMap.put("GT", QFilter.Operator.greater_than);
        operatorMap.put("GTE", QFilter.Operator.greater_than_or_equals);
        operatorMap.put("LT", QFilter.Operator.less_than);
        operatorMap.put("LTE", QFilter.Operator.less_than_or_equals);
        operatorMap.put("CS", QFilter.Operator.like);
        operatorMap.put("BG", QFilter.Operator.left_like);
        operatorMap.put("IN", QFilter.Operator.in);
        operatorMap.put("NI", QFilter.Operator.not_in);
    }


    @Override
    public QFilter visitLogicExpr(RestFilterParser.LogicExprContext ctx) {
        String logicOp = ctx.logicOperator().getText();
        QFilter qFilter = null;
        switch (logicOp) {
            case LOGIC_OP_AND -> qFilter = visit(ctx.expr(0)).and(visit(ctx.expr(1)));
            case LOGIC_OP_OR -> qFilter = visit(ctx.expr(0)).or(visit(ctx.expr(1)));
        }
        return qFilter;
    }

    @Override
    public QFilter visitBinaryExpr(RestFilterParser.BinaryExprContext ctx) {
        String field = ctx.field().getText();
        String operatorKey = ctx.operator().getText();
        QFilter.Operator operator = operatorMap.get(operatorKey.toUpperCase());
        Object value = getValue(field, operatorKey, operator, ctx.value());
        return new QFilter(field, operator, value);
    }

    private Object getValue(String field, String operatorKey, QFilter.Operator operator, RestFilterParser.ValueContext value) {
        if (value.value().size() > 1) {
            if (operator != QFilter.Operator.in && operator != QFilter.Operator.not_in) {
                throw new IllegalArgumentException(String.format("%s操作符只能接收一个参数", operatorKey));
            } else {
                return getFieldValues(value.value());
            }
        } else {
            return getFieldValue(value);
        }
    }

    private List<Object> getFieldValues(List<RestFilterParser.ValueContext> values) {
        return values.stream().map(this::getFieldValue).collect(Collectors.toList());
    }

    private Object getFieldValue(RestFilterParser.ValueContext value) {
//        return value.getText();
        if (Objects.nonNull(value.NUMBER())) {
            // 处理数字
            return new BigDecimal(value.NUMBER().getText());
        } else if (Objects.nonNull(value.STRING())) {
            return stripQuotes(value.STRING().getText());
        } else if (Objects.nonNull(value.NULL())) {
            return null;
        } else if (Objects.nonNull(value.BOOLEAN())) {
            return Boolean.valueOf(value.BOOLEAN().getText());
        } else if (value.value().size() == 1) {
            return getFieldValue(value.value(0));
        } else {
            return null;
        }
    }

    private static String stripQuotes(String fieldValue) {
        return fieldValue.substring(1, fieldValue.length() - 1);
    }

    @Override
    public QFilter visitParenthesesExpr(RestFilterParser.ParenthesesExprContext ctx) {
        return visit(ctx.expr());
    }

}
