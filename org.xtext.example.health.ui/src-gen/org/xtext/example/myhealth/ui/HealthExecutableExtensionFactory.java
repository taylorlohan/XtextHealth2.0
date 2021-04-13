/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.myhealth.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.health.ui.internal.HealthActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HealthExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(HealthActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		HealthActivator activator = HealthActivator.getInstance();
		return activator != null ? activator.getInjector(HealthActivator.ORG_XTEXT_EXAMPLE_MYHEALTH_HEALTH) : null;
	}

}
