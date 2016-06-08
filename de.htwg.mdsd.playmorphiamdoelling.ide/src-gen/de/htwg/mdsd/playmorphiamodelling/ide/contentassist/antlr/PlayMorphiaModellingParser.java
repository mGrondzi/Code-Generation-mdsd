/*
 * generated by Xtext 2.10.0
 */
package de.htwg.mdsd.playmorphiamodelling.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.htwg.mdsd.playmorphiamodelling.ide.contentassist.antlr.internal.InternalPlayMorphiaModellingParser;
import de.htwg.mdsd.playmorphiamodelling.services.PlayMorphiaModellingGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class PlayMorphiaModellingParser extends AbstractContentAssistParser {

	@Inject
	private PlayMorphiaModellingGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPlayMorphiaModellingParser createParser() {
		InternalPlayMorphiaModellingParser result = new InternalPlayMorphiaModellingParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
					put(grammarAccess.getMorphiaModelAccess().getGroup(), "rule__MorphiaModel__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
					put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
					put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3(), "rule__PackageDeclaration__ElementsAssignment_3");
					put(grammarAccess.getMorphiaModelAccess().getNameAssignment_1(), "rule__MorphiaModel__NameAssignment_1");
					put(grammarAccess.getMorphiaModelAccess().getImportsAssignment_3(), "rule__MorphiaModel__ImportsAssignment_3");
					put(grammarAccess.getMorphiaModelAccess().getAttributesAssignment_4(), "rule__MorphiaModel__AttributesAssignment_4");
					put(grammarAccess.getAttributeAccess().getManyAssignment_0(), "rule__Attribute__ManyAssignment_0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalPlayMorphiaModellingParser typedParser = (InternalPlayMorphiaModellingParser) parser;
			typedParser.entryRuleDomainmodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PlayMorphiaModellingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PlayMorphiaModellingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}