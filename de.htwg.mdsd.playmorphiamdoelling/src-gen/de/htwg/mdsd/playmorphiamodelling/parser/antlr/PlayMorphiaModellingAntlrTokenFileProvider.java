/*
 * generated by Xtext 2.10.0
 */
package de.htwg.mdsd.playmorphiamodelling.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PlayMorphiaModellingAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/htwg/mdsd/playmorphiamodelling/parser/antlr/internal/InternalPlayMorphiaModelling.tokens");
	}
}