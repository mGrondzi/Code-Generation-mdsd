/*
 * generated by Xtext 2.10.0
 */
package de.htwg.mdsd.playmorphiamodelling.ui.tests;

import com.google.inject.Injector;
import de.htwg.mdsd.playmorphiamdoelling.ui.internal.PlaymorphiamdoellingActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class PlayMorphiaModellingUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PlaymorphiamdoellingActivator.getInstance().getInjector("de.htwg.mdsd.playmorphiamodelling.PlayMorphiaModelling");
	}

}
