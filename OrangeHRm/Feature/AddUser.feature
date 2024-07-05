Feature: Add User
  @AddUser1
  Scenario: New user should be save/add 
    Given open to URL
    When Enter valid Email 
    And Enter valid Password
    And Click on login button
    And Click Admin option on dashboard
    And Click Add button
    #And Select User role
    #And Select Status
    And Enter new password 
    And Enter confirm password 
    And Enter UserName
    And Enter Employee Name
    And Click Save button
    Then New user should be save/add
    
    @AddUser2
     Scenario: New user should be save/add 
    Given open to URL
    When Enter valid Email 
    And Enter valid Password
    And Click on login button
    And Click Admin option on dashboard
    And Click Add button
    And Click Cancel button
    Then New user should not be save/add