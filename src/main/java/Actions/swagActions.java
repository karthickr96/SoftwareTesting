package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Objects.swagObjects;

public class swagActions {
	swagObjects swagobj;
	Actions act;
	
	public swagActions(WebDriver driver) {
		swagobj = PageFactory.initElements(driver, swagObjects.class);
		act = new Actions(driver);
	}
	public void username(String userdata) {
		swagobj.username.sendKeys(userdata);
	}
	public void password(String password) {
		swagobj.password.sendKeys(password);
	}
	public void submit() {
		swagobj.login.click();
	}
	public String error() {
		String msg = swagobj.error.getText();
		return msg;
	}
	public String getproductname() {
		return swagobj.productname.getText();
	}
	public String getProductPrice() {
		return swagobj.productprice.getText();
	}
	
	public void clickAddToCart() {
		swagobj.addtocart.click();
	}
	
	public void cartlogo() {
		swagobj.cartlogo.click();
	}
	
	
	public void checkout() {
		swagobj.checkout.click();
		swagobj.firstName.sendKeys("karthick");
		swagobj.lastName.sendKeys("R");
		swagobj.postalCode.sendKeys("1111");
		swagobj.continueButton.click();;
	}
	
	public String getActualProductName() {
		return swagobj.actualProductName.getText();
	}
	
	public String getActualProductPrice() {
		return swagobj.actualProductPrice.getText();
	}
	
	public String verifyConfirmationMessage() {
		swagobj.finishButton.click();
	return	swagobj.confirmMsg.getText();
	}
	
}
