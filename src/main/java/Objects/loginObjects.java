package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginObjects {
	@FindBy(id="user-name")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement button;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public WebElement addcart;
	
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	public WebElement productname;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	public WebElement productprice;
	
	@FindBy(id="react-burger-menu-btn")
	public WebElement addtocart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public WebElement cartbutton;
	
	
	
	
	
	
}
