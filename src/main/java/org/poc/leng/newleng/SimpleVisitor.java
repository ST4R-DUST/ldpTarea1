// Generated from Simple.g4 by ANTLR 4.6
package org.poc.leng.newleng;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SimpleParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_block(SimpleParser.Start_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_block(SimpleParser.End_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(SimpleParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(SimpleParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(SimpleParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(SimpleParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SimpleParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(SimpleParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(SimpleParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(SimpleParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(SimpleParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SimpleParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(SimpleParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(SimpleParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(SimpleParser.WriteContext ctx);
}