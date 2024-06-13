Feature: Login page validation   
 
   @tag1 
  Scenario Outline: verify the login with valid credentials
     Given open website 
     And click register link
     When enter first name
     And enter last name
     And Enter address
     And Enter City
     And Enter State
     And Enter zip code
     And Enter phone no
     And Enter SSN 
     And Enter username
     And Enter password
     And Enter confirm
     And click register
     Then sucessfully message 