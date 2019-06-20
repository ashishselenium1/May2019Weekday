package com.qtpselenium.rediff.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		strict=true,
		monochrome=true,
		features= {"src/test/resources/"},
		glue = {"com.qtpselenium.rediff.stepdef"},
		plugin= {
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"}
		//tags= {"@DeletePortFolio"}
)

public class MyRunner {
	
}
