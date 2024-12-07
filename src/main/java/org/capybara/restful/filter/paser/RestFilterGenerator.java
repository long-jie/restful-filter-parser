package org.capybara.restful.filter.paser;

import org.capybara.restful.filter.RestFilter;

/**
 * @author long jie
 * @since 2024/12/7 17:43
 */
public class RestFilterGenerator extends RestFilterBaseVisitor<RestFilter> {

    @Override
    public RestFilter visitBinaryExpr(RestFilterParser.BinaryExprContext ctx) {
        return new RestFilter(ctx.field().getText(), ctx.op.getText(), ctx.value().getText());
    }

    @Override
    public RestFilter visitAndOrExpr(RestFilterParser.AndOrExprContext ctx) {
        if (ctx.op.getText().equalsIgnoreCase("and")) {
            return visit(ctx.expr(0)).and(visit(ctx.expr(1)));
        } else if (ctx.op.getText().equalsIgnoreCase("or")) {
            return visit(ctx.expr(0)).or(visit(ctx.expr(1)));
        }
        throw new IllegalStateException("Invalid op: " + ctx.op.getText());
    }

    @Override
    public RestFilter visitParenthesesExpr(RestFilterParser.ParenthesesExprContext ctx) {
        return visit(ctx.expr());
    }

}
