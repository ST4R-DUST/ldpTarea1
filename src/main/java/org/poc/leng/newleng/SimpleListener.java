// Generated from Simple.g4 by ANTLR 4.4
package org.poc.leng.newleng;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(@NotNull SimpleParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(@NotNull SimpleParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull SimpleParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull SimpleParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull SimpleParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull SimpleParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull SimpleParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull SimpleParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull SimpleParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull SimpleParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull SimpleParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link SimpleParser#read_block}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull SimpleParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(@NotNull SimpleParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(@NotNull SimpleParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull SimpleParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull SimpleParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 */
	void enterEnd_block(@NotNull SimpleParser.End_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#end_block}.
	 * @param ctx the parse tree
	 */
	void exitEnd_block(@NotNull SimpleParser.End_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull SimpleParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull SimpleParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 */
	void enterStart_block(@NotNull SimpleParser.Start_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start_block}.
	 * @param ctx the parse tree
	 */
	void exitStart_block(@NotNull SimpleParser.Start_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull SimpleParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull SimpleParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(@NotNull SimpleParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(@NotNull SimpleParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull SimpleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link SimpleParser#write_block}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull SimpleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull SimpleParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull SimpleParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull SimpleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull SimpleParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull SimpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull SimpleParser.AssignContext ctx);
}