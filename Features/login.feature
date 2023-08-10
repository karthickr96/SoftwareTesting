Feature: To validate Login Application

  Scenario: Login Application
    Given user launch the url
    And user enter username
    And user enter password
    Then user click on login
    And user click on add to cart for first option
    And user get the name of the product
    Then user get the price of the product  
		And user click on cart option 
		Then validate the given product
		And user click on the checkout button
		And user enter the firstname
    And user enter the lastname 
    And user enter the postalcode
    Then user click on continue
    
		
