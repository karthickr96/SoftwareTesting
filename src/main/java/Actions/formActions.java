package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Objects.formObject;
public class formActions {
	public static WebDriver driver;
	formObject obj = PageFactory.initElements(driver, formObject.class);
	
	public void ContactInfo(String firstName, String lastName, String phone, String emailaddress) {
		obj.firstName.sendKeys(firstName);
		obj.lastName.sendKeys(lastName);
		obj.phone.sendKeys(phone);
		obj.emailaddress.sendKeys(emailaddress);
	}
	public void enterMail(String address, String cityy, String state, String postalCode) {
		obj.address.sendKeys(address);
		obj.city.sendKeys(cityy);
		obj.state.sendKeys(state);	
		obj.postalCode.sendKeys(postalCode);
		//obj.country.click();
		Select s = new Select(obj.country);
		s.selectByIndex(3);
}
	/*public void dropdown() {
		obj.country.click();
		Select s = new Select(obj.country);
		s.selectByValue("INDIA");
		  
	}*/
	public void userInfo(String username, String password, String confirmPassword ) {
		obj.userName.sendKeys(username);
		obj.password.sendKeys(password);
		obj.confirmpassword.sendKeys(confirmPassword);
	}
}
