// Generated from Simple.g4 by ANTLR 4.4
package org.poc.leng.newleng;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, AND=3, OR=4, EQUAL=5, NQUAL=6, GT=7, ASSIGN=8, LPAR=9, 
		RPAR=10, LBRACE=11, RBRACE=12, BEGIN_RW=13, END_RW=14, IF_RW=15, ELIF_RW=16, 
		ELSE_RW=17, ENDIF_RW=18, READ_RW=19, WRITE_RW=20, INTEGER_RW=21, STRING_RW=22, 
		REAL_RW=23, BOOLEAN_RW=24, NUMBER=25, FLOAT=26, BOOLEAN=27, STRING=28, 
		ID=29, COMMENT=30, WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'and'", "'or'", "'='", "'<>'", "'>'", "'<-'", 
		"'('", "')'", "'{'", "'}'", "'inicio'", "'fin'", "'si'", "'sino_si'", 
		"'sino'", "'fin_si'", "'leer'", "'escribir'", "'entero'", "'cadena'", 
		"'real'", "'logico'", "NUMBER", "FLOAT", "BOOLEAN", "STRING", "ID", "COMMENT", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_start_block = 2, RULE_end_block = 3, 
		RULE_operation = 4, RULE_if_block = 5, RULE_condition_block = 6, RULE_else_block = 7, 
		RULE_block = 8, RULE_assign = 9, RULE_variable_type = 10, RULE_declaration = 11, 
		RULE_read_block = 12, RULE_write_block = 13;
	public static final String[] ruleNames = {
		"program", "stat", "start_block", "end_block", "operation", "if_block", 
		"condition_block", "else_block", "block", "assign", "variable_type", "declaration", 
		"read_block", "write_block"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public Start_blockContext start_block() {
			return getRuleContext(Start_blockContext.class,0);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); start_block();
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29); stat();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << INTEGER_RW) | (1L << STRING_RW) | (1L << REAL_RW) | (1L << BOOLEAN_RW) | (1L << ID))) != 0) );
			setState(34); end_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Write_blockContext write_block() {
			return getRuleContext(Write_blockContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Read_blockContext read_block() {
			return getRuleContext(Read_blockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); operation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39); if_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40); read_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41); write_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN_RW() { return getToken(SimpleParser.BEGIN_RW, 0); }
		public Start_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStart_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_blockContext start_block() throws RecognitionException {
		Start_blockContext _localctx = new Start_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(BEGIN_RW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_blockContext extends ParserRuleContext {
		public TerminalNode END_RW() { return getToken(SimpleParser.END_RW, 0); }
		public End_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterEnd_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitEnd_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitEnd_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_blockContext end_block() throws RecognitionException {
		End_blockContext _localctx = new End_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_end_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(END_RW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompContext extends OperationContext {
		public TerminalNode EQUAL() { return getToken(SimpleParser.EQUAL, 0); }
		public TerminalNode NQUAL() { return getToken(SimpleParser.NQUAL, 0); }
		public TerminalNode GT() { return getToken(SimpleParser.GT, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public CompContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends OperationContext {
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public ParensContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends OperationContext {
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
		public OrContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends OperationContext {
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public AndContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends OperationContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public IdContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends OperationContext {
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SimpleParser.PLUS, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public PlusContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(49); match(ID);
				}
				break;
			case LPAR:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50); match(LPAR);
				setState(51); operation(0);
				setState(52); match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(56);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(57); match(PLUS);
						setState(58); operation(8);
						}
						break;
					case 2:
						{
						_localctx = new CompContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(59);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(60);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(61); operation(7);
						}
						break;
					case 3:
						{
						_localctx = new AndContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63); match(AND);
						setState(64); operation(6);
						}
						break;
					case 4:
						{
						_localctx = new OrContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66); match(OR);
						setState(67); operation(5);
						}
						break;
					case 5:
						{
						_localctx = new CompContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69); match(GT);
						setState(70); operation(4);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode ENDIF_RW() { return getToken(SimpleParser.ENDIF_RW, 0); }
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public TerminalNode IF_RW() { return getToken(SimpleParser.IF_RW, 0); }
		public List<TerminalNode> ELIF_RW() { return getTokens(SimpleParser.ELIF_RW); }
		public TerminalNode ELIF_RW(int i) {
			return getToken(SimpleParser.ELIF_RW, i);
		}
		public TerminalNode ELSE_RW() { return getToken(SimpleParser.ELSE_RW, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(IF_RW);
			setState(77); condition_block();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF_RW) {
				{
				{
				setState(78); match(ELIF_RW);
				setState(79); condition_block();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_la = _input.LA(1);
			if (_la==ELSE_RW) {
				{
				setState(85); match(ELSE_RW);
				setState(86); else_block();
				}
			}

			setState(89); match(ENDIF_RW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode RBRACE() { return getToken(SimpleParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleParser.LBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition_block);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(LPAR);
				setState(92); operation(0);
				setState(93); match(RPAR);
				setState(94); match(LBRACE);
				setState(95); block();
				setState(96); match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(LPAR);
				setState(99); operation(0);
				setState(100); match(RPAR);
				setState(101); stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode RBRACE() { return getToken(SimpleParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleParser.LBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_block);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(LBRACE);
				setState(106); block();
				setState(107); match(RBRACE);
				}
				break;
			case LPAR:
			case IF_RW:
			case READ_RW:
			case WRITE_RW:
			case INTEGER_RW:
			case STRING_RW:
			case REAL_RW:
			case BOOLEAN_RW:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << INTEGER_RW) | (1L << STRING_RW) | (1L << REAL_RW) | (1L << BOOLEAN_RW) | (1L << ID))) != 0)) {
				{
				{
				setState(112); stat();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleParser.FLOAT, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(ID);
			setState(119); match(ASSIGN);
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(120); operation(0);
				}
				break;
			case 2:
				{
				setState(121); match(ID);
				}
				break;
			case 3:
				{
				setState(122); match(NUMBER);
				}
				break;
			case 4:
				{
				setState(123); match(FLOAT);
				}
				break;
			case 5:
				{
				setState(124); match(STRING);
				}
				break;
			case 6:
				{
				setState(125); match(BOOLEAN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_typeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_RW() { return getToken(SimpleParser.BOOLEAN_RW, 0); }
		public TerminalNode INTEGER_RW() { return getToken(SimpleParser.INTEGER_RW, 0); }
		public TerminalNode STRING_RW() { return getToken(SimpleParser.STRING_RW, 0); }
		public TerminalNode REAL_RW() { return getToken(SimpleParser.REAL_RW, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVariable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitVariable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_RW) | (1L << STRING_RW) | (1L << REAL_RW) | (1L << BOOLEAN_RW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); variable_type();
				setState(131); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); variable_type();
				setState(134); assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_blockContext extends ParserRuleContext {
		public Read_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_block; }
	 
		public Read_blockContext() { }
		public void copyFrom(Read_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadContext extends Read_blockContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode READ_RW() { return getToken(SimpleParser.READ_RW, 0); }
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public ReadContext(Read_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_blockContext read_block() throws RecognitionException {
		Read_blockContext _localctx = new Read_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_read_block);
		try {
			_localctx = new ReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(READ_RW);
			setState(139); match(LPAR);
			setState(140); match(ID);
			setState(141); match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_blockContext extends ParserRuleContext {
		public Write_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_block; }
	 
		public Write_blockContext() { }
		public void copyFrom(Write_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends Write_blockContext {
		public TerminalNode WRITE_RW() { return getToken(SimpleParser.WRITE_RW, 0); }
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public PrintContext(Write_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_blockContext write_block() throws RecognitionException {
		Write_blockContext _localctx = new Write_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_write_block);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(WRITE_RW);
			setState(144); match(LPAR);
			setState(145); match(STRING);
			setState(146); match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\69\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\3\7\3\7\7\7S\n\7\f\7\16\7V"+
		"\13\7\3\7\3\7\5\7Z\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\7\nt\n\n\f\n\16\nw"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\2\3\n\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\4\3\2\7\b\3\2\27\32\u009f\2\36\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\60\3\2"+
		"\2\2\n8\3\2\2\2\fN\3\2\2\2\16i\3\2\2\2\20p\3\2\2\2\22u\3\2\2\2\24x\3\2"+
		"\2\2\26\u0082\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2\2\2\34\u0091\3\2\2"+
		"\2\36 \5\6\4\2\37!\5\4\3\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2"+
		"\2#$\3\2\2\2$%\5\b\5\2%\3\3\2\2\2&-\5\30\r\2\'-\5\24\13\2(-\5\n\6\2)-"+
		"\5\f\7\2*-\5\32\16\2+-\5\34\17\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2"+
		"\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7\17\2\2/\7\3\2\2\2\60\61\7\20\2"+
		"\2\61\t\3\2\2\2\62\63\b\6\1\2\639\7\37\2\2\64\65\7\13\2\2\65\66\5\n\6"+
		"\2\66\67\7\f\2\2\679\3\2\2\28\62\3\2\2\28\64\3\2\2\29K\3\2\2\2:;\f\t\2"+
		"\2;<\7\3\2\2<J\5\n\6\n=>\f\b\2\2>?\t\2\2\2?J\5\n\6\t@A\f\7\2\2AB\7\5\2"+
		"\2BJ\5\n\6\bCD\f\6\2\2DE\7\6\2\2EJ\5\n\6\7FG\f\5\2\2GH\7\t\2\2HJ\5\n\6"+
		"\6I:\3\2\2\2I=\3\2\2\2I@\3\2\2\2IC\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2L\13\3\2\2\2MK\3\2\2\2NO\7\21\2\2OT\5\16\b\2PQ\7\22\2\2QS"+
		"\5\16\b\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UY\3\2\2\2VT\3\2\2\2"+
		"WX\7\23\2\2XZ\5\20\t\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\24\2\2\\\r\3"+
		"\2\2\2]^\7\13\2\2^_\5\n\6\2_`\7\f\2\2`a\7\r\2\2ab\5\22\n\2bc\7\16\2\2"+
		"cj\3\2\2\2de\7\13\2\2ef\5\n\6\2fg\7\f\2\2gh\5\4\3\2hj\3\2\2\2i]\3\2\2"+
		"\2id\3\2\2\2j\17\3\2\2\2kl\7\r\2\2lm\5\22\n\2mn\7\16\2\2nq\3\2\2\2oq\5"+
		"\4\3\2pk\3\2\2\2po\3\2\2\2q\21\3\2\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2u"+
		"s\3\2\2\2uv\3\2\2\2v\23\3\2\2\2wu\3\2\2\2xy\7\37\2\2y\u0080\7\n\2\2z\u0081"+
		"\5\n\6\2{\u0081\7\37\2\2|\u0081\7\33\2\2}\u0081\7\34\2\2~\u0081\7\36\2"+
		"\2\177\u0081\7\35\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080"+
		"}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\25\3\2\2\2\u0082\u0083"+
		"\t\3\2\2\u0083\27\3\2\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7\37\2\2\u0086"+
		"\u008b\3\2\2\2\u0087\u0088\5\26\f\2\u0088\u0089\5\24\13\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\31\3\2\2\2\u008c"+
		"\u008d\7\25\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7\37\2\2\u008f\u0090"+
		"\7\f\2\2\u0090\33\3\2\2\2\u0091\u0092\7\26\2\2\u0092\u0093\7\13\2\2\u0093"+
		"\u0094\7\36\2\2\u0094\u0095\7\f\2\2\u0095\35\3\2\2\2\16\",8IKTYipu\u0080"+
		"\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}