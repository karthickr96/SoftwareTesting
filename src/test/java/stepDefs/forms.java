package stepDefs;

import Actions.formActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class forms {
	formActions reg = new formActions();
	@Given("user launch the application")
	public void user_launch_the_application() {
		formActions.driver.get("https://demo.guru99.com/test/newtours/register.php");
	}

	
	@And("user enter contact info details")
	public void user_enter_contact_info_details() {
		reg.ContactInfo("karthick", "R", "987654312", "karthi@gmail.com");
	}
	
	@And("user enter mailling information")
	public void user_enter_mailling_information() {
		reg.enterMail("india", "india" , "india","11111");
	}
	
	@And("user enter user information")
	public void user_enter_user_information() {
		reg.userInfo("kartthi","12345","12345");
	}

	@And("user click on submit button")
	public void user_click_on_submit_button() {
		
	}

	@Then("user should be able to register sucessfully")
	public void user_should_be_able_to_register_sucessfully() {

	}

	
}
