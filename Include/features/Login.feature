@login
Feature: Login Feature
	
  @login1 @positive
  Scenario Outline: Login - Authentication Positive
  	Given Get all call to URL Login
    Then I receive valid HTTP response code 200
  
  @login1 @negative
  Scenario Outline: Login with Get - Authentication Negative 
  	Given Get all call to URL Login with Method GET
    Then I receive valid HTTP response code 405
