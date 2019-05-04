@AmazonLoginScenario
Feature: Amazon application login functionality testing 
This feature inclues test cases such as login with Valid UserName and Password, ..... etc
@TC2
Scenario: Login  application with valid username and password 
	Given User should be the Amazon Home Page 
	When User mouse hover to the SignIn button in the Header 
	And User Click on  Signin button in AJAX call
	And User enter the email/mobile number in  emailid feild 
	And User click on the Continue button
	And User enter the password in  password feild 
	And User click the signin button to  the login  application 
	And User wait for the'1' seconds
	Then User validate  username in the Header 
	And User mouse hover to username in the header 
	And User click on signout button
@LoginwithStepdata 	
Scenario: Login the application with valid username and stepdata
Given User should be  in the Amazon Home Page
When User mouse hover to signIn button in the Header
And User Click on SignIn button in the header
And User enter the email/mobile	'9791585555'in the emailfield
And User Click on signin Button
And User enter the password 'parthiv@2012' in the password field
And User Click the signin button to login the application
And Yser wait for the '1' seconds
Then User validate username 'Hello, bindhu'in the header
And User mouse hover to  theusername in the header
And User click on the signout button
