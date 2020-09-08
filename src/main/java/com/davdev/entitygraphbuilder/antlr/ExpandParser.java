// Generated from Expand.g4 by ANTLR 4.7.1
package com.davdev.entitygraphbuilder.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, LPAREN=2, RPAREN=3, VIRG=4, WS=5;
	public static final int
		RULE_file = 0, RULE_nodelist = 1, RULE_node = 2;
	public static final String[] ruleNames = {
		"file", "nodelist", "node"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VARIABLE", "LPAREN", "RPAREN", "VIRG", "WS"
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
	public String getGrammarFileName() { return "Expand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public NodelistContext nodelist() {
			return getRuleContext(NodelistContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpandParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpandListener ) ((ExpandListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpandListener ) ((ExpandListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpandVisitor ) return ((ExpandVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			nodelist();
			setState(7);
			match(EOF);
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

	public static class NodelistContext extends ParserRuleContext {
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(ExpandParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(ExpandParser.VIRG, i);
		}
		public NodelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpandListener ) ((ExpandListener)listener).enterNodelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpandListener ) ((ExpandListener)listener).exitNodelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpandVisitor ) return ((ExpandVisitor<? extends T>)visitor).visitNodelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodelistContext nodelist() throws RecognitionException {
		NodelistContext _localctx = new NodelistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nodelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			node();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(10);
				match(VIRG);
				setState(11);
				node();
				}
				}
				setState(16);
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

	public static class NodeContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ExpandParser.VARIABLE, 0); }
		public TerminalNode LPAREN() { return getToken(ExpandParser.LPAREN, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ExpandParser.RPAREN, 0); }
		public List<TerminalNode> VIRG() { return getTokens(ExpandParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(ExpandParser.VIRG, i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpandListener ) ((ExpandListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpandListener ) ((ExpandListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpandVisitor ) return ((ExpandVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_node);
		int _la;
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(VARIABLE);
				setState(19);
				match(LPAREN);
				setState(20);
				node();
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRG) {
					{
					{
					setState(21);
					match(VIRG);
					setState(22);
					node();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\7\3\17\n\3\f\3\16\3\22\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\4\3\4\5\4!\n\4\3\4\2\2"+
		"\5\2\4\6\2\2\2\"\2\b\3\2\2\2\4\13\3\2\2\2\6 \3\2\2\2\b\t\5\4\3\2\t\n\7"+
		"\2\2\3\n\3\3\2\2\2\13\20\5\6\4\2\f\r\7\6\2\2\r\17\5\6\4\2\16\f\3\2\2\2"+
		"\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\5\3\2\2\2\22\20\3\2\2\2"+
		"\23!\7\3\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\33\5\6\4\2\27\30\7\6\2\2\30"+
		"\32\5\6\4\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\36\3\2\2\2\35\33\3\2\2\2\36\37\7\5\2\2\37!\3\2\2\2 \23\3\2\2\2 \24\3"+
		"\2\2\2!\7\3\2\2\2\5\20\33 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}