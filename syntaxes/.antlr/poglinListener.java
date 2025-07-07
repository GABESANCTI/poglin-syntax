// Generated from d:/FACULDADE/Compiladores/FINAL/poglin syntax highlight/sintaxe/poglin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link poglinParser}.
 */
public interface poglinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link poglinParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(poglinParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(poglinParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(poglinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(poglinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(poglinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(poglinParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(poglinParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(poglinParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(poglinParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(poglinParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(poglinParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(poglinParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(poglinParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(poglinParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(poglinParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(poglinParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(poglinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(poglinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(poglinParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(poglinParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(poglinParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(poglinParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link poglinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(poglinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link poglinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(poglinParser.TypeContext ctx);
}