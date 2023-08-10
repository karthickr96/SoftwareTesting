package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Objects.loginObjects;

public class loginActions {
	public static WebDriver driver;
	loginObjects obj = PageFactory.initElements(driver, loginObjects.class);
	
	public void username() {
		obj.userName.sendKeys("standard_user");
	}
	public void password() {
		obj.password.sendKeys("secret_sauce");
	}
	public void button() {
		obj.button.click();
	}
	
	public void addcart() {
		obj.addcart.click();
	}
	public void productname() {
		obj.productname.getText();
	}
	public String productprice() {
		String s = obj.productprice.getText();
		return s;
		
	}
	
	public void addtocart() {
		obj.addtocart.click();;
	}
	
	public void cartbutton() {
		obj.cartbutton.click();
	}
	
	
}
