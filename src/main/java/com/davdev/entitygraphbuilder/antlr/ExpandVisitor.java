// Generated from Expand.g4 by ANTLR 4.7.1
package com.davdev.entitygraphbuilder.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpandParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ExpandParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpandParser#nodelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodelist(ExpandParser.NodelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpandParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(ExpandParser.NodeContext ctx);
}