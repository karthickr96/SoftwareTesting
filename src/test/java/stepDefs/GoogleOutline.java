package stepDefs;

import Actions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleOutline {
	
	Actions action = new Actions();
	@Given("user open the application with {string}")
	public void user_open_the_application_with(String u) {
		Actions.driver.get(u);
	}

	@When("user enter {string} on search bar")
	public void user_enter_on_search_bar(String s) {
		action.enterText(s);
	}

	@And("user press the search button")
	public void user_press_the_search_button() throws InterruptedException {
		action.clickEnter();
	}

	@Then("user should able to navigate to the searched page for {string}")
	public void user_should_able_to_navigate_to_the_searched_page_for(String string) {
		System.out.println("Title of the page id google");
	}
	
	}
	
	

