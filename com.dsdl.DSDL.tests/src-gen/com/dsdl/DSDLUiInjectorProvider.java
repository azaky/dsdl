/*
 * generated by Xtext
 */
package com.dsdl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DSDLUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return com.dsdl.ui.internal.DSDLActivator.getInstance().getInjector("com.dsdl.DSDL");
	}
	
}
