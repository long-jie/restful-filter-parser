package org.capybara.restful.filter.filter.qfilter;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * example:
 * <code>
 * (fieldName operator fieldValue) and (fieldName operator fieldValue)
 * </code>
 *
 * @author long jie
 * @since 2024/12/7 15:29
 */
@Getter
@Setter
public class QFilter {

    protected String fieldName;
    protected Operator operator;
    protected Object fieldValue;

    public QFilter(String fieldName, Operator operator, Object fieldValue) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.fieldValue = fieldValue;
    }

    public QFilter or(QFilter filter) {
        return new QFilterLogic(fieldName, operator, fieldValue, this, "OR", filter);
    }

    public QFilter and(QFilter filter) {
        return new QFilterLogic(fieldName, operator, fieldValue, this, "AND", filter);
    }

    public static QFilter like(String fieldName, Object fieldValue) {
        return new QFilter(fieldName, Operator.like, "%" + fieldValue + "%");
    }

    public static QFilter leftLike(String fieldName, Object fieldValue) {
        return new QFilter(fieldName, Operator.left_like, fieldValue + "%");
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", fieldName, operator.getOp(), fieldValue);
    }

    public String toParameterizedFilter() {
        if (fieldValue instanceof List<?> list) {
            return String.format("%s %s (%s)", fieldName, operator.getOp(), generatePlaceholders(list.size()));
        } else {
            return String.format("%s %s ?", fieldName, operator.getOp());
        }
    }

    private static String generatePlaceholders(int size) {
        StringBuilder placeholders = new StringBuilder();
        for (int i = 0; i < size; i++) {
            placeholders.append("?");
            if (i < size - 1) {
                placeholders.append(", ");
            }
        }
        return placeholders.toString();
    }

    public List<Object> getParameterizedParams() {
        List<Object> params = new ArrayList<>();
        if (fieldValue instanceof List<?> list) {
            params.addAll(list);
        } else {
            params.add(fieldValue);
        }
        return params;
    }

    @Getter
    private static class QFilterLogic extends QFilter {

        private final QFilter left;
        private final String logicOperator;
        private final QFilter right;

        public QFilterLogic(String fieldName, Operator operator, Object fieldValue, QFilter left, String logicOperator, QFilter right) {
            super(fieldName, operator, fieldValue);
            this.left = left;
            this.logicOperator = logicOperator;
            this.right = right;
        }

        @Override
        public String toString() {
            return String.format("(%s %s %s)", left.toString(), logicOperator, right.toString()); // 中序遍历
        }

        @Override
        public String toParameterizedFilter() {
            return String.format("(%s %s %s)", left.toParameterizedFilter(), logicOperator, right.toParameterizedFilter()); // 中序遍历
        }

        @Override
        public List<Object> getParameterizedParams() {
            List<Object> params = new ArrayList<>();
            params.addAll(left.getParameterizedParams());
            params.addAll(right.getParameterizedParams());
            return params;
        }
    }

    @Getter
    public enum Operator {

        equals("="),
        not_equals("<>"),
        greater_than(">"),
        greater_than_or_equals(">="),
        less_than("<"),
        less_than_or_equals("<="),
        like("like"),
        left_like("like"),
        in("in"),
        not_in("not in"),
        is_null("is null"),
        is_not_null("is not null"),
        ;
        private final String op;

        Operator(String op) {
            this.op = op;
        }

    }

}
