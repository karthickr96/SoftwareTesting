Feature: To run poc applicatication

  Scenario: Poc all functions
    Given user launchh the application "<url>"
    And user click on the link 
    When user enter in the textBox "<text>"
    Then user click on submit buttonn
    And user click on doubleclick button
    And user click on radio buttons
    And user click on check box
    And user click on dropdown
    Then user select the specfic dropdown
    And user click on generate alert box
    Then user click on generate confirm box 
    And user click on ok


	Examples: 
		|url|text|
    |https://artoftesting.com/samplesiteforselenium|speed|