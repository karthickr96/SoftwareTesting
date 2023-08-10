package stepDefs;
import Actions.loginActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login {
	loginActions login = new loginActions();
	
	@Given("user launch the url")
	public void user_launch_the_url() {
		loginActions.driver.get("https://www.saucedemo.com/");
	}

	@And("user enter username")
	public void user_enter_username() {
		login.username();
	}

	@And("user enter password")
	public void user_enter_password() {
		login.password();
	}

	@Then("user click on login")
	public void user_click_on_login() {
		login.button();
	}
	
	@Then("user click on add to cart for first option")
	public void user_click_on_add_to_cart_for_first_option() {
		login.addcart();
	}

	@Then("user get the name of the product")
	public void user_get_the_name_of_the_product() {
		login.productname();
	}

	@Then("user get the price of the product")
	public void user_get_the_price_of_the_product() {
		login.productprice();
	}

	@Then("user click on cart option")
	public void user_click_on_cart_option() {
		login.addtocart();
	}

	@Then("validate the given product")
	public void validate_the_given_product() {

	}

	@Then("user click on the checkout button")
	public void user_click_on_the_checkout_button() {

	}

	@Then("user enter the firstname")
	public void user_enter_the_firstname() {

	}

	@Then("user enter the lastname")
	public void user_enter_the_lastname() {

	}

	@Then("user enter the postalcode")
	public void user_enter_the_postalcode() {

	}

	@Then("user click on continue")
	public void user_click_on_continue() {

	}
	
	
	
}
