/*
 * generated by Xtext
 */
package com.dsdl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DSDLStandaloneSetup extends DSDLStandaloneSetupGenerated{

	public static void doSetup() {
		new DSDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

