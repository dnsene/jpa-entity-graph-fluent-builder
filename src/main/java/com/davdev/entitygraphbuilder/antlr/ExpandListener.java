// Generated from Expand.g4 by ANTLR 4.7.1
package com.davdev.entitygraphbuilder.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpandParser}.
 */
public interface ExpandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpandParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ExpandParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpandParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ExpandParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpandParser#nodelist}.
	 * @param ctx the parse tree
	 */
	void enterNodelist(ExpandParser.NodelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpandParser#nodelist}.
	 * @param ctx the parse tree
	 */
	void exitNodelist(ExpandParser.NodelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpandParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(ExpandParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpandParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(ExpandParser.NodeContext ctx);
}