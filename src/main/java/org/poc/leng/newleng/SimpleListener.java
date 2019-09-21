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
	 * Enter a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleParser.StatContext ctx);
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
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMinus(SimpleParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMinus(SimpleParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterComp(SimpleParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitComp(SimpleParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterParens(SimpleParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitParens(SimpleParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterNum(SimpleParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitNum(SimpleParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDivide(SimpleParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDivide(SimpleParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterId(SimpleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitId(SimpleParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(SimpleParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(SimpleParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPlus(SimpleParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPlus(SimpleParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condOperation}.
	 * @param ctx the parse tree
	 */
	void enterCondOperation(SimpleParser.CondOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condOperation}.
	 * @param ctx the parse tree
	 */
	void exitCondOperation(SimpleParser.CondOperationContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(SimpleParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(SimpleParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(SimpleParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(SimpleParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 */
	void enterRead(SimpleParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 */
	void exitRead(SimpleParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 */
	void enterWrite(SimpleParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 */
	void exitWrite(SimpleParser.WriteContext ctx);
}