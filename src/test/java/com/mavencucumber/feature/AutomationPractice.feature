Feature: AutomationPractice End To End Test Case


Scenario: Verify the Customer or User is able to LogIn the Application

Given User Launch the Application
When User Click on Signin button in the header
When User enter emailId in SignIn page
And User enter Password in SignIn page
And User click SignIn button in SigIn page
Then User verify the username displayed in the header


Scenario: Verify the user is able to select the product based on Product List

When User enters the product in the Search Box
And User click on the search button
Then User verify the product displayed in the given page


Scenario: Verify the user is able to place the order
When User select the desired dress 
And User customise the product with more option
And User changes the quantity of the product
And User changes the color of the product
And user placed the order 
Then User verify the order has been placed

Scenario: Verify the User is able to proceed with order
When User click to proceed the order
And User click proceed to checkout in summary page
And User enter the comments for the order
And User click on proceed to checkout for shipping 
And User agrees to the terms and condition given
And User proceed to payment option
And User select the pay by check option for payment
And User click to confirm the order
Then User verify the order has been completed

Scenario: Verify the user to logout the application
When User click on signout option after completing the order
Then User verify the logout session
 


