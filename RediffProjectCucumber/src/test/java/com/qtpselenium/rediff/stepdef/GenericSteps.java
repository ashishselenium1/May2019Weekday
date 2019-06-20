package com.qtpselenium.rediff.stepdef;
// central functions
// add screenshots in reports
// Scenario based report
import com.qtpselenium.rediff.webconnector.WebConnector;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GenericSteps {

	WebConnector con;
	
	public GenericSteps(WebConnector con) {
		System.out.println("--------------GenericSteps Init------------------");
		//System.out.println(con.x);
		this.con=con;
	}
	
	@Before
	public void before(Scenario s) {
		System.out.println("------@Before--------"+s.getName()+"--------------");
		// init the reports for that scenario
		con.initReports(s.getName());
	}
	
	@After
	public void after(Scenario s) {
		System.out.println("------@After--------"+s.getName()+"--------------");
		con.quit();

	}
	
	@Given("^I open ([^\"]*)$")
	public void openBrowser(String browser) {
		con.log("I open "+ browser);
		con.openBrowser(browser);
	}
	
	@When("^I go to ([^\"]*)$")
	public void navigate(String url) {
		con.log("go to "+url);
		con.navigate(url);
	}
	
	@And("^I type ([^\"]*) in ([^\"]*)$")
	public void type(String data, String locator) {
		con.log("Type "+ data +" in "+ locator);
		con.type(data, locator);
	}
	
    @And("^I click on ([^\"]*)$")
    public void click(String locator) {
    	con.log("Clicking on "+ locator);
    	con.click(locator);
    }
    
	@And("^I click (.*) and wait for (.*)$")
	public void clickAndWait(String src,String target) {
		con.log("Clicking on "+ src);
		con.clickAndWait(src, target, 20);	
	}
	@And("^I clear (.*)$")
	public void clear(String locatorKey) {
		con.log("Clearing in "+locatorKey);
		con.clear(locatorKey);
	}
	

	@And("^I wait for page to load$")
	public void waitForPageToLoad() {
		con.waitForPageToLoad();
	}
	
	@And("I select (.*) from (.*)")
	public void select(String data,String locatorKey) {
		con.log("Selecting from "+ locatorKey);
		con.select(locatorKey,data);
	}
	

	@When("^I accept alert$")
	public void iAcceptAlert() {
		con.acceptAlertIfPresent();
	}

}
