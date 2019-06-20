$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/src/test/resources/com/features/login.feature");
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