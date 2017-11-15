// Generated from Template.g4 by ANTLR 4.5.1
package com.diguits.templateengine.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, ENTER=2, TAB=3, RETURN=4, ATSCAPE=5, OPENIC=6, OPENTF=7, CLOSETF=8, 
		OPENTI=9, CLOSETI=10, OPENEV=11, CLOSEEV=12, OPENCS=13, CLOSECS=14, ANYCHAR=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "ENTER", "TAB", "RETURN", "ATSCAPE", "OPENIC", "OPENTF", "CLOSETF", 
		"OPENTI", "CLOSETI", "OPENEV", "CLOSEEV", "OPENCS", "CLOSECS", "ANYCHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'\n'", "'\t'", "'\r'", "'(@)'", "'@:'", "'@#'", "'#@'", 
		"'@['", "']@'", "'@('", "')@'", "'@{'", "'}@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "ENTER", "TAB", "RETURN", "ATSCAPE", "OPENIC", "OPENTF", 
		"CLOSETF", "OPENTI", "CLOSETI", "OPENEV", "CLOSEEV", "OPENCS", "CLOSECS", 
		"ANYCHAR"
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


	public TemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Template.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21J\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21\3\2\2I\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2"+
		"\2\r-\3\2\2\2\17\60\3\2\2\2\21\63\3\2\2\2\23\66\3\2\2\2\259\3\2\2\2\27"+
		"<\3\2\2\2\31?\3\2\2\2\33B\3\2\2\2\35E\3\2\2\2\37H\3\2\2\2!\"\7\"\2\2\""+
		"\4\3\2\2\2#$\7\f\2\2$\6\3\2\2\2%&\7\13\2\2&\b\3\2\2\2\'(\7\17\2\2(\n\3"+
		"\2\2\2)*\7*\2\2*+\7B\2\2+,\7+\2\2,\f\3\2\2\2-.\7B\2\2./\7<\2\2/\16\3\2"+
		"\2\2\60\61\7B\2\2\61\62\7%\2\2\62\20\3\2\2\2\63\64\7%\2\2\64\65\7B\2\2"+
		"\65\22\3\2\2\2\66\67\7B\2\2\678\7]\2\28\24\3\2\2\29:\7_\2\2:;\7B\2\2;"+
		"\26\3\2\2\2<=\7B\2\2=>\7*\2\2>\30\3\2\2\2?@\7+\2\2@A\7B\2\2A\32\3\2\2"+
		"\2BC\7B\2\2CD\7}\2\2D\34\3\2\2\2EF\7\177\2\2FG\7B\2\2G\36\3\2\2\2HI\13"+
		"\2\2\2I \3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}