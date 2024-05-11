#I want to say who is the author
@smoke_scenario
Feature: feature to test login functionality
  Scenario Outline: check login is successfull
    Given User provides username, password
    When user enters
    And click on login
    Then User is able to login

