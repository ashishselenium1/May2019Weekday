#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Testing Login

  @RediffLogin
  Scenario: Logging into rediff.com
    Given I open chrome
    When I go to loginURL
    Then username_text_field_id should be present
    And I type ashishthakur1983 in username_text_field_id
    And I click on username_submit_button_css
    And I type pass@1234 in password_text_field_xpath
    And I click on password_submit_button_xpath
    Then Login should be successful
