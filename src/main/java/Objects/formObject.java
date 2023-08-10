package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class formObject {
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@name='phone']")
	public WebElement phone;
	
	@FindBy(xpath = "//input[@name='userName']")
	public WebElement userName;
	
	@FindBy(id="userName")
	public WebElement emailaddress;
	
	@FindBy(xpath = "//input[@name='address1']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	public WebElement state;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	public WebElement postalCode;
	
	@FindBy(xpath = "//select[@name='country']")
	public WebElement country;
	
	@FindBy(xpath ="//input[@id='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;

	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement confirmpassword;


	
	

}
