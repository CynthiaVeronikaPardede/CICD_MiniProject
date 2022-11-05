@allcategories
Feature: Get All Categories Feature
	
 @allcategories1 @positive
  Scenario Outline: Get All Categories - Products Positive
  	Given Get all call to URL Get All Categories
    Then I receive valid HTTP response code is 200
    
  @allcategories2 @negative
  Scenario Outline: Get All Product with method PATCH - Products Negative
  	Given Get all call to URL Get All Categories with method PATCH
    Then I received valid HTTP response code is 405

