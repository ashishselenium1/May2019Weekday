package com.qtpselenium.rediff.stepdef;

import com.qtpselenium.rediff.webconnector.WebConnector;

import cucumber.api.java.en.Then;

public class ValidationSteps {

	WebConnector con;
	
	public ValidationSteps(WebConnector con) {
		System.out.println("--------------GenericSteps Init------------------");
		//System.out.println(con.x);
		this.con=con;
	}
	
	@Then("([^\"]*) should be present")
	public void verifyElementPresence(String locatorKey) {
		con.log("Checking presence of element "+locatorKey);
		con.isElementPresent(locatorKey);
	}
	// validate titles
	// validate text
	
}
