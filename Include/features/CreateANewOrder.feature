@createaneworder
Feature: Create a new order feature

  @createaneworder1 @positive
  Scenario Outline: Create a new order feature - Orders Positive
    Given Get all call to URL Create a new order
    Then response url create a new order is 200
    
  @createaneworder1 @negative
  Scenario Outline: Create a new order feature with method get - Orders negative
    Given Get all call to URL Create a new order feature with method get
    Then response url create a new user order with method get is 405