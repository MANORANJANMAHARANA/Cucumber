#I want to say who is the author
@smoke_scenario
Feature: feature to test login functionality
  Scenario: check login is successfull
    Given User provides username, password
    Then User is able to login

    Scenario: Browser is closed
      Then Browser is closed