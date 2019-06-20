$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/src/test/resources/com/features/Portfolio.feature");
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
});