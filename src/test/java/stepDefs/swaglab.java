package stepDefs;

import Actions.swagActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class swaglab {
	String productname;
	String productprice;
	
	swagActions swagac = new swagActions(Hooks.driver);
	@Given("user lauch the url {string}")
	public void user_lauch_the_url(String string) {
		Hooks.driver.get(string);
	}

	@When("user enter the valid username {string}")
	public void user_enter_the_valid_username(String string) {
		swagac.username(string);

	}

	@And("user enter the vaild password {string}")
	public void user_enter_the_vaild_password(String string) {
		swagac.password(string);
	}
	
	@And("user click on login button")
	public void user_click_on_login_button(){
		swagac.submit();
	}

	@Then("user able to login application")
	public void user_able_to_login_application() {
		System.out.println(Hooks.driver.getTitle());
		Assert.assertEquals("Swag Labs", Hooks.driver.getTitle());
	}
	
	@And("user get name and price of first availaible item")
	public void user_get_name_and_price_of_first_availaible_item() {
		productname = swagac.getproductname();
		productprice = swagac.getActualProductPrice();
	}

	@And("user click on add to cart btn")
	public void user_click_on_add_to_cart_btn() {
		swagac.clickAddToCart();

	}

	@And("user navigate to cart")
	public void user_navigate_to_cart() {
		swagac.cartlogo();
	}

	@And("user continue to checkout teh item")
	public void user_continue_to_checkout_teh_item() {
		
	}

	@And("user fill the details for delivery")
	public void user_fill_the_details_for_delivery() throws InterruptedException {
		Thread.sleep(3000);
		swagac.checkout();
	}
	


	@Then("user verfiy the confirmation message")
	public void user_verfiy_the_confirmation_message() {
		Assert.assertEquals(productname, swagac.getActualProductName());
		Assert.assertEquals(productprice, swagac.getActualProductPrice());
		Assert.assertEquals("Thank you for your order!", swagac.verifyConfirmationMessage());
	}

	@Given("user launch the url {string}")
	public void user_launch_the_url(String string) {
		Hooks.driver.get(string);
	}

	@When("user enter the Invalid username {string}")
	public void user_enter_the_invalid_username(String string) {
		swagac.username(string);
	}

	@And("user enter the Invalid password {string}")
	public void user_enter_the_invalid_password(String string) {
		swagac.password(string);
	}

	@Then("user should not allow to login and throw Error")
	public void user_should_not_allow_to_login_and_throw_error() {
		System.out.println(Hooks.driver.getTitle());
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", swagac.error());
	}
}
