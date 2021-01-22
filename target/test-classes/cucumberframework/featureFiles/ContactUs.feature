Feature: Submit user information via contact us form 

Scenario: Submit valid data via contact us form 
	Given I access webdriveruniversity.com 
	When I click on the contact us button 
	And I enter a valid first name 
	And I enter a valid last name
	And I enter a valid email address
	And I enter comments
			| Hello World    | Au revoir |
			| Hasta la Vista | Bye Bye Bye |
	When I click on the submit button 
	Then The information should be successfully submitted via contact us form

