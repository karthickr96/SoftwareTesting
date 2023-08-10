Feature: To validate registration form

	Scenario: To test registration form
		Given user launch the application
		And user enter contact info details
		And user enter mailling information
		And user enter user information
		And user click on submit button
		Then user should be able to register sucessfully
