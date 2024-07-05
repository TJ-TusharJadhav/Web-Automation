Feature: Add Employee Personal Details
  @Add_Employee_Personal_Details
  Scenario: New user should be save/add 
    Given open to URL
    When Enter valid Email 
    And Enter valid Password
    And Click on login button
    And Click PIM option on dashboard
    And Search Employee name 
    And click search button on employee information
    And click edit icon
    And Enter Other ID
    And Enter Driver license numbers
    And Select license Expiry date
    And Select nationality
    And Select marital status
    And Select DOB
    And Select gender
    And click save button on personal details 
    Then sucess message should be appear 
    
    
    
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
    
       