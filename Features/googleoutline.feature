Feature: Google search functionality

  Scenario Outline: To validate google search bar
    Given user open the application with "<url>"
    When user enter "<text>" on search bar
    And user press the search button
    Then user should able to navigate to the searched page for "<ExpectedTitle>"
    

    Examples: 
      |url|text|ExpectedTitle|
      |https://www.google.com/|selenium|selenium - Google Search|

