Feature: GPS login . 

@Regression 
Scenario Outline: Login 2 with correct credentials. 
	Given User is present on login page. 
	When He enters "<username>". 
	And  enters "<password>" . 
	And Press login . 
	Then He should be successfully logged in. 
	
	Examples: 
		|username|password|
		|shashwatc|	lenovoLAP2016#|
		
		
		Scenario: Login 2 with incorrect credentials. 
			Given User is present on login page. 
			When He enters "user". 
			And  enters "pass" . 
			And Press login . 
			Then Invalid credential message should come. 
			But He should not be logged in.