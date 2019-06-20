package com.qtpselenium.rediff.stepdef;

import java.util.List;

import com.qtpselenium.rediff.webconnector.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AppSteps {
	
	WebConnector con;
	public AppSteps(WebConnector con) {
		System.out.println("--------------AppSteps Init------------------");
		//System.out.println(con.x);
		this.con=con;
	}

    @Then("^Login should be successful$")
    public void loginSuccess() {
    	System.out.println("Login should be success");
    	
    }
    

	@And("^I Login inside application$")
	public void login(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		con.login(data.get(0),data.get(1));
		
	}
}
