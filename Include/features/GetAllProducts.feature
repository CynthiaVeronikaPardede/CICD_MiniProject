@allproduct
Feature: Get All ProductBackground: 

  @allproduct1 @positive
  Scenario Outline: Get All Product - Products Positive
  	Given Get all call to URL Get All Product
    Then I received valid HTTP response code 200
    
  @allproduct2 @negative
  Scenario Outline: Get All Product with Method Put - Products Negative
  	Given Get all call to URL Get All Product with Method Put
    Then I received valid HTTP response code 405

