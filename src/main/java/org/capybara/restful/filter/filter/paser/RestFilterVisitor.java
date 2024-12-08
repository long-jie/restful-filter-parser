// Generated from E:/source_code/restful-filter-parser/src/main/antlr/RestFilter.g4 by ANTLR 4.13.2

    package org.capybara.restful.filter.filter.paser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RestFilterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RestFilterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RestFilterParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(RestFilterParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(RestFilterParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(RestFilterParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link RestFilterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpr(RestFilterParser.ParenthesesExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestFilterParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(RestFilterParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestFilterParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RestFilterParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestFilterParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(RestFilterParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestFilterParser#logicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOperator(RestFilterParser.LogicOperatorContext ctx);
}