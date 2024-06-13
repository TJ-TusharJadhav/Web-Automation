Feature: Login page validation   
 
   @tag1 
  Scenario Outline: verify the login with valid credentials
     Given open website
     When user enters the email as <email>
     And user enters the password as <password>
     And user click on login button
     Then user name should be displayed
    Examples:
    | email  | password |
    | admin  | abc123   |
    
     
  