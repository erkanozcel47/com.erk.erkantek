package com.erk.erkantek.step_definitions;

import java.util.concurrent.TimeUnit;


import com.erk.erkantek.utilities.ConfigurationReader;
import com.erk.erkantek.utilities.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	@Before
	public void setUp() {
		Driver.getDriver().get(ConfigurationReader.getProperty("urltoolsQA"));
		Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown() {
		Driver.closeDriver();
		
	}
	
	
	
}
