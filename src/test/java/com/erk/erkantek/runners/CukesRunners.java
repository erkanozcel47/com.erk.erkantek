package com.erk.erkantek.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@temp",
		features="src/test/resources/FeatureFile",
		glue="com/erk/erkantek/step_definitions"
		
// , dryRun=true
		)
public class CukesRunners {

}
 