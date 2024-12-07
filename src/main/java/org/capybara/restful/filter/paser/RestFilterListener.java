// Generated from E:/source_code/restful-filter-parser/src/main/antlr/RestFilter.g4 by ANTLR 4.13.2

    package org.capybara.restful.filter.paser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RestFilterParser}.
 */
public interface RestFilterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RestFilterParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(RestFilterParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestFilterParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(RestFilterParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(RestFilterParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(RestFilterParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOrExpr(RestFilterParser.AndOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOrExpr(RestFilterParser.AndOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpr(RestFilterParser.ParenthesesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpr(RestFilterParser.ParenthesesExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestFilterParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(RestFilterParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestFilterParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(RestFilterParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestFilterParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RestFilterParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestFilterParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RestFilterParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestFilterParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(RestFilterParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestFilterParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(RestFilterParser.OperatorContext ctx);
}