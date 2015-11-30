/*
 * generated by Xtext
 */
package com.dsdl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.dsdl.services.DSDLGrammarAccess;

public class DSDLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DSDLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.dsdl.parser.antlr.internal.InternalDSDLParser createParser(XtextTokenStream stream) {
		return new com.dsdl.parser.antlr.internal.InternalDSDLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Database";
	}
	
	public DSDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DSDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}