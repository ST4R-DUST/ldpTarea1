// Generated from Simple.g4 by ANTLR 4.6
package org.poc.leng.newleng;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SimpleParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SimpleParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 */
	void enterStart_block(SimpleParser.Start_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 */
	void exitStart_block(SimpleParser.Start_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 */
	void enterEnd_block(SimpleParser.End_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 */
	void exitEnd_block(SimpleParser.End_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(SimpleParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(SimpleParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SimpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SimpleParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(SimpleParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(SimpleParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 */
	void enterWrite_block(SimpleParser.Write_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 */
	void exitWrite_block(SimpleParser.Write_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 */
	void enterRead_block(SimpleParser.Read_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 */
	void exitRead_block(SimpleParser.Read_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(SimpleParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(SimpleParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#body_block}.
	 * @param ctx the parse tree
	 */
	void enterBody_block(SimpleParser.Body_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#body_block}.
	 * @param ctx the parse tree
	 */
	void exitBody_block(SimpleParser.Body_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr_real}.
	 * @param ctx the parse tree
	 */
	void enterExpr_real(SimpleParser.Expr_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr_real}.
	 * @param ctx the parse tree
	 */
	void exitExpr_real(SimpleParser.Expr_realContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr_nat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_nat(SimpleParser.Expr_natContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr_nat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_nat(SimpleParser.Expr_natContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr_string}.
	 * @param ctx the parse tree
	 */
	void enterExpr_string(SimpleParser.Expr_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr_string}.
	 * @param ctx the parse tree
	 */
	void exitExpr_string(SimpleParser.Expr_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(SimpleParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(SimpleParser.OpContext ctx);
}