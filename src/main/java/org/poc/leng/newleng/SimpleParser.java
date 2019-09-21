// Generated from Simple.g4 by ANTLR 4.6
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, AND=5, OR=6, EQUAL=7, NQUAL=8, 
		GT=9, LT=10, ASSIGN=11, LPAR=12, RPAR=13, LBRACE=14, RBRACE=15, INIT=16, 
		END=17, IF=18, ELIF=19, ELSE=20, ENDIF=21, WHILE=22, READ=23, WRITE=24, 
		INT_V=25, STRING_V=26, FLOAT_V=27, BOOLEAN_V=28, NUMBER=29, FLOAT=30, 
		BOOLEAN=31, STRING=32, VARID=33, COMMENT=34, WS=35;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_start_block = 2, RULE_end_block = 3, 
		RULE_operation = 4, RULE_condOperation = 5, RULE_if_block = 6, RULE_while_block = 7, 
		RULE_condition_block = 8, RULE_else_block = 9, RULE_block = 10, RULE_assign = 11, 
		RULE_var_type = 12, RULE_declaration = 13, RULE_read_block = 14, RULE_write_block = 15;
	public static final String[] ruleNames = {
		"program", "stat", "start_block", "end_block", "operation", "condOperation", 
		"if_block", "while_block", "condition_block", "else_block", "block", "assign", 
		"var_type", "declaration", "read_block", "write_block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "' && '", "' || '", "'='", "'<>'", "'>'", 
		"'<'", "'<-'", "'('", "')'", "'{'", "'}'", "'init'", "'end'", "'if'", 
		"'elif'", "'else'", "'fi'", "'while'", "'read'", "'write'", "'int'", "'string'", 
		"'float'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "AND", "OR", "EQUAL", "NQUAL", 
		"GT", "LT", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "INIT", "END", 
		"IF", "ELIF", "ELSE", "ENDIF", "WHILE", "READ", "WRITE", "INT_V", "STRING_V", 
		"FLOAT_V", "BOOLEAN_V", "NUMBER", "FLOAT", "BOOLEAN", "STRING", "VARID", 
		"COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		public Start_blockContext start_block() {
			return getRuleContext(Start_blockContext.class,0);
		}
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
			setState(32);
			start_block();
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				stat();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << INT_V) | (1L << STRING_V) | (1L << FLOAT_V) | (1L << BOOLEAN_V) | (1L << NUMBER) | (1L << VARID))) != 0) );
			setState(38);
			end_block();
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Read_blockContext read_block() {
			return getRuleContext(Read_blockContext.class,0);
		}
		public Write_blockContext write_block() {
			return getRuleContext(Write_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				operation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				if_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				read_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				write_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				while_block();
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
		public TerminalNode INIT() { return getToken(SimpleParser.INIT, 0); }
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
			setState(49);
			match(INIT);
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
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
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
			setState(51);
			match(END);
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
	public static class MinusContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SimpleParser.MINUS, 0); }
		public MinusContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SimpleParser.EQUAL, 0); }
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
	public static class NumContext extends OperationContext {
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public NumContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(SimpleParser.DIVIDE, 0); }
		public DivideContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends OperationContext {
		public TerminalNode VARID() { return getToken(SimpleParser.VARID, 0); }
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
	public static class MultiplyContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(SimpleParser.MULTIPLY, 0); }
		public MultiplyContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SimpleParser.PLUS, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(VARID);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(NUMBER);
				}
				break;
			case LPAR:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(LPAR);
				setState(57);
				operation(0);
				setState(58);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(62);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(63);
						match(PLUS);
						setState(64);
						operation(9);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						match(MINUS);
						setState(67);
						operation(8);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						match(MULTIPLY);
						setState(70);
						operation(7);
						}
						break;
					case 4:
						{
						_localctx = new DivideContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						match(DIVIDE);
						setState(73);
						operation(6);
						}
						break;
					case 5:
						{
						_localctx = new CompContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(74);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(75);
						match(EQUAL);
						setState(76);
						operation(5);
						}
						break;
					}
					} 
				}
				setState(81);
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

	public static class CondOperationContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SimpleParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SimpleParser.EQUAL, i);
		}
		public TerminalNode NQUAL() { return getToken(SimpleParser.NQUAL, 0); }
		public TerminalNode GT() { return getToken(SimpleParser.GT, 0); }
		public TerminalNode LT() { return getToken(SimpleParser.LT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public List<CondOperationContext> condOperation() {
			return getRuleContexts(CondOperationContext.class);
		}
		public CondOperationContext condOperation(int i) {
			return getRuleContext(CondOperationContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
		public CondOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCondOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCondOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCondOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondOperationContext condOperation() throws RecognitionException {
		return condOperation(0);
	}

	private CondOperationContext condOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondOperationContext _localctx = new CondOperationContext(_ctx, _parentState);
		CondOperationContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_condOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(83);
				operation(0);
				setState(84);
				match(EQUAL);
				setState(85);
				match(EQUAL);
				setState(86);
				operation(0);
				}
				break;
			case 2:
				{
				setState(88);
				operation(0);
				setState(89);
				match(NQUAL);
				setState(90);
				operation(0);
				}
				break;
			case 3:
				{
				setState(92);
				operation(0);
				setState(93);
				match(GT);
				setState(94);
				match(EQUAL);
				setState(95);
				operation(0);
				}
				break;
			case 4:
				{
				setState(97);
				operation(0);
				setState(98);
				match(LT);
				setState(99);
				match(EQUAL);
				setState(100);
				operation(0);
				}
				break;
			case 5:
				{
				setState(102);
				operation(0);
				setState(103);
				match(GT);
				setState(104);
				operation(0);
				}
				break;
			case 6:
				{
				setState(106);
				operation(0);
				setState(107);
				match(LT);
				setState(108);
				operation(0);
				}
				break;
			case 7:
				{
				setState(110);
				match(LPAR);
				setState(111);
				condOperation(0);
				setState(112);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CondOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condOperation);
						setState(116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(117);
						match(AND);
						setState(118);
						condOperation(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condOperation);
						setState(119);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(120);
						match(OR);
						setState(121);
						condOperation(3);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(SimpleParser.ENDIF, 0); }
		public List<TerminalNode> ELIF() { return getTokens(SimpleParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(SimpleParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
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
		enterRule(_localctx, 12, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IF);
			setState(128);
			condition_block();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(129);
				match(ELIF);
				setState(130);
				condition_block();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(136);
				match(ELSE);
				setState(137);
				else_block();
				}
			}

			setState(140);
			match(ENDIF);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimpleParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhile_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHILE);
			setState(143);
			condition_block();
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
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public CondOperationContext condOperation() {
			return getRuleContext(CondOperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SimpleParser.RBRACE, 0); }
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
		enterRule(_localctx, 16, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LPAR);
			setState(146);
			condOperation(0);
			setState(147);
			match(RPAR);
			setState(148);
			match(LBRACE);
			setState(149);
			block();
			setState(150);
			match(RBRACE);
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
		public TerminalNode LBRACE() { return getToken(SimpleParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SimpleParser.RBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
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
		enterRule(_localctx, 18, RULE_else_block);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(LBRACE);
				setState(153);
				block();
				setState(154);
				match(RBRACE);
				}
				break;
			case LPAR:
			case IF:
			case WHILE:
			case READ:
			case WRITE:
			case INT_V:
			case STRING_V:
			case FLOAT_V:
			case BOOLEAN_V:
			case NUMBER:
			case VARID:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				stat();
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << INT_V) | (1L << STRING_V) | (1L << FLOAT_V) | (1L << BOOLEAN_V) | (1L << NUMBER) | (1L << VARID))) != 0)) {
				{
				{
				setState(159);
				stat();
				}
				}
				setState(164);
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
		public List<TerminalNode> VARID() { return getTokens(SimpleParser.VARID); }
		public TerminalNode VARID(int i) {
			return getToken(SimpleParser.VARID, i);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(VARID);
			setState(166);
			match(ASSIGN);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(167);
				operation(0);
				}
				break;
			case 2:
				{
				setState(168);
				match(VARID);
				}
				break;
			case 3:
				{
				setState(169);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(170);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(171);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(172);
				match(BOOLEAN);
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INT_V() { return getToken(SimpleParser.INT_V, 0); }
		public TerminalNode FLOAT_V() { return getToken(SimpleParser.FLOAT_V, 0); }
		public TerminalNode STRING_V() { return getToken(SimpleParser.STRING_V, 0); }
		public TerminalNode BOOLEAN_V() { return getToken(SimpleParser.BOOLEAN_V, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_V) | (1L << STRING_V) | (1L << FLOAT_V) | (1L << BOOLEAN_V))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode VARID() { return getToken(SimpleParser.VARID, 0); }
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				var_type();
				setState(178);
				match(VARID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				var_type();
				setState(181);
				assign();
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
		public TerminalNode READ() { return getToken(SimpleParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public TerminalNode VARID() { return getToken(SimpleParser.VARID, 0); }
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
		enterRule(_localctx, 28, RULE_read_block);
		try {
			_localctx = new ReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(READ);
			setState(186);
			match(LPAR);
			setState(187);
			match(VARID);
			setState(188);
			match(RPAR);
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
	public static class WriteContext extends Write_blockContext {
		public TerminalNode WRITE() { return getToken(SimpleParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public TerminalNode STRING() { return getToken(SimpleParser.STRING, 0); }
		public List<TerminalNode> VARID() { return getTokens(SimpleParser.VARID); }
		public TerminalNode VARID(int i) {
			return getToken(SimpleParser.VARID, i);
		}
		public WriteContext(Write_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_blockContext write_block() throws RecognitionException {
		Write_blockContext _localctx = new Write_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_write_block);
		int _la;
		try {
			_localctx = new WriteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(WRITE);
			setState(191);
			match(LPAR);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(192);
				match(STRING);
				}
				break;
			case VARID:
				{
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					match(VARID);
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VARID );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
			match(RPAR);
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
		case 4:
			return operation_sempred((OperationContext)_localctx, predIndex);
		case 5:
			return condOperation_sempred((CondOperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean condOperation_sempred(CondOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\6"+
		"\2%\n\2\r\2\16\2&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\b\3\b\3\b\3\b\7\b\u0086"+
		"\n\b\f\b\16\b\u0089\13\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\f"+
		"\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00b0\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ba\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\6\21\u00c5\n\21\r\21\16\21\u00c6"+
		"\5\21\u00c9\n\21\3\21\3\21\3\21\2\4\n\f\22\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \2\3\3\2\33\36\u00de\2\"\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2"+
		"\2\b\65\3\2\2\2\n>\3\2\2\2\ft\3\2\2\2\16\u0081\3\2\2\2\20\u0090\3\2\2"+
		"\2\22\u0093\3\2\2\2\24\u009f\3\2\2\2\26\u00a4\3\2\2\2\30\u00a7\3\2\2\2"+
		"\32\u00b1\3\2\2\2\34\u00b9\3\2\2\2\36\u00bb\3\2\2\2 \u00c0\3\2\2\2\"$"+
		"\5\6\4\2#%\5\4\3\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2"+
		"()\5\b\5\2)\3\3\2\2\2*\62\5\34\17\2+\62\5\30\r\2,\62\5\n\6\2-\62\5\16"+
		"\b\2.\62\5\36\20\2/\62\5 \21\2\60\62\5\20\t\2\61*\3\2\2\2\61+\3\2\2\2"+
		"\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3"+
		"\2\2\2\63\64\7\22\2\2\64\7\3\2\2\2\65\66\7\23\2\2\66\t\3\2\2\2\678\b\6"+
		"\1\28?\7#\2\29?\7\37\2\2:;\7\16\2\2;<\5\n\6\2<=\7\17\2\2=?\3\2\2\2>\67"+
		"\3\2\2\2>9\3\2\2\2>:\3\2\2\2?Q\3\2\2\2@A\f\n\2\2AB\7\3\2\2BP\5\n\6\13"+
		"CD\f\t\2\2DE\7\4\2\2EP\5\n\6\nFG\f\b\2\2GH\7\5\2\2HP\5\n\6\tIJ\f\7\2\2"+
		"JK\7\6\2\2KP\5\n\6\bLM\f\6\2\2MN\7\t\2\2NP\5\n\6\7O@\3\2\2\2OC\3\2\2\2"+
		"OF\3\2\2\2OI\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2"+
		"\2SQ\3\2\2\2TU\b\7\1\2UV\5\n\6\2VW\7\t\2\2WX\7\t\2\2XY\5\n\6\2Yu\3\2\2"+
		"\2Z[\5\n\6\2[\\\7\n\2\2\\]\5\n\6\2]u\3\2\2\2^_\5\n\6\2_`\7\13\2\2`a\7"+
		"\t\2\2ab\5\n\6\2bu\3\2\2\2cd\5\n\6\2de\7\f\2\2ef\7\t\2\2fg\5\n\6\2gu\3"+
		"\2\2\2hi\5\n\6\2ij\7\13\2\2jk\5\n\6\2ku\3\2\2\2lm\5\n\6\2mn\7\f\2\2no"+
		"\5\n\6\2ou\3\2\2\2pq\7\16\2\2qr\5\f\7\2rs\7\17\2\2su\3\2\2\2tT\3\2\2\2"+
		"tZ\3\2\2\2t^\3\2\2\2tc\3\2\2\2th\3\2\2\2tl\3\2\2\2tp\3\2\2\2u~\3\2\2\2"+
		"vw\f\5\2\2wx\7\7\2\2x}\5\f\7\6yz\f\4\2\2z{\7\b\2\2{}\5\f\7\5|v\3\2\2\2"+
		"|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080~"+
		"\3\2\2\2\u0081\u0082\7\24\2\2\u0082\u0087\5\22\n\2\u0083\u0084\7\25\2"+
		"\2\u0084\u0086\5\22\n\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008b\7\26\2\2\u008b\u008d\5\24\13\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\27\2\2\u008f\17\3\2\2"+
		"\2\u0090\u0091\7\30\2\2\u0091\u0092\5\22\n\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\7\16\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7\17\2\2\u0096\u0097\7\20\2"+
		"\2\u0097\u0098\5\26\f\2\u0098\u0099\7\21\2\2\u0099\23\3\2\2\2\u009a\u009b"+
		"\7\20\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\21\2\2\u009d\u00a0\3\2\2"+
		"\2\u009e\u00a0\5\4\3\2\u009f\u009a\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\25"+
		"\3\2\2\2\u00a1\u00a3\5\4\3\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00a8\7#\2\2\u00a8\u00af\7\r\2\2\u00a9\u00b0\5\n\6\2\u00aa\u00b0"+
		"\7#\2\2\u00ab\u00b0\7\37\2\2\u00ac\u00b0\7 \2\2\u00ad\u00b0\7\"\2\2\u00ae"+
		"\u00b0\7!\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2"+
		"\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\31\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\5\32\16\2"+
		"\u00b4\u00b5\7#\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8"+
		"\5\30\r\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2"+
		"\u00ba\35\3\2\2\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00be"+
		"\7#\2\2\u00be\u00bf\7\17\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\7\32\2\2\u00c1"+
		"\u00c8\7\16\2\2\u00c2\u00c9\7\"\2\2\u00c3\u00c5\7#\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7\17\2\2\u00cb!\3\2\2\2\22&\61>OQt|~\u0087\u008c\u009f"+
		"\u00a4\u00af\u00b9\u00c6\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}