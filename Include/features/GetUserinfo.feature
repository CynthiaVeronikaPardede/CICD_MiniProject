@userinfo
Feature: Get User info

  @userinfo1 @positive
  Scenario Outline: Get User info - Authentication Positive
  	Given Get call to url user info
    Then response url user info is 200
    
  @userinfo2 @negative
  Scenario Outline: Get User Info with POST - Authentication Negative
  	Given Get call to url user info with method POST
    Then response url post userinfo is 405