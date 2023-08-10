package stepDefs;
import Actions.PocActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Poc {
	
	PocActions poc = new PocActions(Hooks.driver);
	
	/*@Given("user launch the application with")
	public void user_launch_the_application_with() throws InterruptedException {
		Thread.sleep(3000);
		PocActions.driver.get("https://artoftesting.com/samplesiteforselenium");
		
	}*/

	@Given("user launchh the application {string}")
	public void user_launchh_the_application(String string) {
		Hooks.driver.get(string);
	}

	@And("user click on the link")
	public void user_click_on_the_link() {
		poc.link();
	}
	
	@When("user enter in the textBox {string}")
	public void user_enter_in_the_text_box(String string) {
		poc.fname(string);
	}
	
	@Then("user click on submit buttonn")
	public void user_click_on_submit_button() {
		poc.submitbtn();
	}

	@And("user click on doubleclick button")
	public void user_click_on_doubleclick_button() throws InterruptedException  {
		poc.doubleclick();
	}

	@And("user click on radio buttons")
	public void user_click_on_radio_buttons() {
		poc.radiobtn();
	}

	@And("user click on check box")
	public void user_click_on_check_box() {
		poc.checkbox();
	}

	@And("user click on dropdown")
	public void user_click_on_dropdown() {
		poc.dropdown();
	}

	@And("user select the specfic dropdown")
	public void user_select_the_specfic_dropdown() {

	}

	@Then("user click on generate alert box")
	public void user_click_on_generate_alert_box() {
		poc.generatealert();
	}

	@And("user click on generate confirm box")
	public void user_click_on_generate_confirm_box() throws InterruptedException {
		poc.confirmalert();
	}

	@Then("user click on ok")
	public void user_click_on_ok() {
		
	}


}
