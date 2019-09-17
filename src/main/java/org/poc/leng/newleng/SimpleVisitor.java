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
	 * Visit a parse tree produced by {@link SimpleParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SimpleParser.BodyContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(SimpleParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SimpleParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(SimpleParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_block(SimpleParser.Write_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_block(SimpleParser.Read_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(SimpleParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#body_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_block(SimpleParser.Body_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expr_real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_real(SimpleParser.Expr_realContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expr_nat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_nat(SimpleParser.Expr_natContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expr_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_string(SimpleParser.Expr_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SimpleParser.OpContext ctx);
}