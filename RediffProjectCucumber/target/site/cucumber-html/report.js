$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/features/Portfolio.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Portfolio"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to loginURL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Login inside application",
  "rows": [
    {
      "cells": [
        "ashishthakur1983",
        "pass@1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AppSteps.login(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating a Portfolio",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Portfolio"
    },
    {
      "name": "@CreatePortFolio"
    }
  ]
});
formatter.step({
  "name": "I click createPortFolio_id and wait for portfolioName_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.clickAndWait(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clear portfolioName_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.clear(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type Port1234511 in portfolioName_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.type(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on portFolioSubmit_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to loginURL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Login inside application",
  "rows": [
    {
      "cells": [
        "ashishthakur1983",
        "pass@1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AppSteps.login(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deleting a Portfolio",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Portfolio"
    },
    {
      "name": "@DeletePortFolio"
    }
  ]
});
formatter.step({
  "name": "I wait for page to load",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.waitForPageToLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Port1234511 from portfolioSelection_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.select(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for page to load",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.waitForPageToLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on deletePortfolio_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept alert",
  "keyword": "When "
});
formatter.match({
  "location": "GenericSteps.iAcceptAlert()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/com/features/login.feature");
formatter.feature({
  "name": "Testing Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Logging into rediff.com",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@RediffLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to loginURL",
  "keyword": "When "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "username_text_field_id should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidationSteps.verifyElementPresence(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type ashishthakur1983 in username_text_field_id",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.type(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on username_submit_button_css",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type pass@1234 in password_text_field_xpath",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.type(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on password_submit_button_xpath",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "AppSteps.loginSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});