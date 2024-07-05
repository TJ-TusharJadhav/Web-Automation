Feature: Add Employee 
  @Addemployee
  Scenario: New user should be save/add 
    Given open to URL
    When Enter valid Email 
    And Enter valid Password
    And Click on login button
    And Click PIM option on dashboard
    And Click Add Employee button
    And Enter First name
    And Enter Middle name
    And Enter last name
    And Click login details
    And Enter username
    And Enter password
    And Enter confirm password_addEmployee 
    And Click save button on add employee form
    Then sucess message should be appear
    And new employee should be added 
    #When Enter Other ID
    #And Enter Driver license numbers
    #And Select license Expiry date
    #And Select nationality
    #And Select marital status
    #And Select DOB
    #And Select gender
    #And click save button on personal details 
    #Then sucess message should be appear 
    #When select blood type 
    #And Enter Test_Field 
    #And click save button on custon field 
    #Then sucess message should be appear
    #When click pluess icon
    #And select attachment 
    #And click upload button
    #And Enter comment 
    #And Click save button on add attachment 
    #Then sucess message should be appear
    #And added attachment should be shown
    #And 
    
       