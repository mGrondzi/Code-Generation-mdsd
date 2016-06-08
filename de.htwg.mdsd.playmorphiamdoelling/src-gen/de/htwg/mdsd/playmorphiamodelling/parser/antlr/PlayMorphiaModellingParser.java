/*
 * generated by Xtext 2.10.0
 */
package de.htwg.mdsd.playmorphiamodelling.parser.antlr;

import com.google.inject.Inject;
import de.htwg.mdsd.playmorphiamodelling.parser.antlr.internal.InternalPlayMorphiaModellingParser;
import de.htwg.mdsd.playmorphiamodelling.services.PlayMorphiaModellingGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PlayMorphiaModellingParser extends AbstractAntlrParser {

	@Inject
	private PlayMorphiaModellingGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPlayMorphiaModellingParser createParser(XtextTokenStream stream) {
		return new InternalPlayMorphiaModellingParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public PlayMorphiaModellingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PlayMorphiaModellingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
