/*
 * generated by Xtext 2.10.0
 */
package de.htwg.mdsd.playmorphiamdoelling.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import de.htwg.mdsd.playmorphiamodelling.PlayMorphiaModellingRuntimeModule;
import de.htwg.mdsd.playmorphiamodelling.ui.PlayMorphiaModellingUiModule;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PlaymorphiamdoellingActivator extends AbstractUIPlugin {

	public static final String DE_HTWG_MDSD_PLAYMORPHIAMODELLING_PLAYMORPHIAMODELLING = "de.htwg.mdsd.playmorphiamodelling.PlayMorphiaModelling";
	
	private static final Logger logger = Logger.getLogger(PlaymorphiamdoellingActivator.class);
	
	private static PlaymorphiamdoellingActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static PlaymorphiamdoellingActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected Module getRuntimeModule(String grammar) {
		if (DE_HTWG_MDSD_PLAYMORPHIAMODELLING_PLAYMORPHIAMODELLING.equals(grammar)) {
			return new PlayMorphiaModellingRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (DE_HTWG_MDSD_PLAYMORPHIAMODELLING_PLAYMORPHIAMODELLING.equals(grammar)) {
			return new PlayMorphiaModellingUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}
