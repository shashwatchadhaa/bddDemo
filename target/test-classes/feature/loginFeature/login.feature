Feature: As a user I should be able to login to GPS.
	 
	 Scenario Outline: Login with correct credentials
	 Given User is present on login page.
	 When User enters "<username>" as username.
	 And User enters "<password>" as password.
	 And Press login button.
	 Then He should be successfully logged into GPS. 
	 
	 Examples:
	 |username|password|
	 |shashwatc|lenovoLAP2016#|

	
	Scenario: Login with incorrect credentials
	Given User is present on login page.
	 When User enters "user" as username.
	 And User enters "pass" as password.
	 And Press login button.
	 Then Invalid credential message should come.
	 But User should not be logged in.