
Feature: LoginPage
 

  @Login1
  Scenario: valid ID and Password 
    Given open to URL
    When Enter valid Email 
    And Enter valid Password
    And Click on login button
    Then Dasshboard page should be displayed 
    

  @Login2
 Scenario: Invalid ID and Password 
    Given open to URL
    When Enter Invalid Email 
    And Enter Invalid Password
    And Click on login button
    Then Invalid Credentials message should be displayed 
    
    @Login3
 Scenario: Blank ID and Password 
    Given open to URL
    When Click on login button
    Then Required message should be displayed 
