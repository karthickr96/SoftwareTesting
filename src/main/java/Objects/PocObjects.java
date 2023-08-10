package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PocObjects {
	
	@FindBy(xpath="//a[text()='This is a link']")
	public WebElement link;
	
	@FindBy(id="fname")
	public WebElement fname;
	
	@FindBy(id="idOfButton")
	public WebElement submitbtn;
	
	@FindBy(id="dblClkBtn")
	public WebElement doubleclick;
	
	@FindBy(id="male")
	public WebElement radiobtn;
	
	@FindBy(className="Automation")
	public WebElement checkbox;
	
	@FindBy(id="testingDropdown")
	public WebElement dropdown;
	
	
	@FindBy(xpath="//button[text()='Generate Alert Box']")
	public WebElement generatealert;
	
	@FindBy (xpath="//*[text()='Generate Confirm Box']")
	public WebElement confirmalert;
	
	//@FindBy(xpath="//img[@decoding='async']")
	//public WebElement drag;
	
	/*@FindBy(xpath="//*[@id='targetDiv']")
	public WebElement target;*/
	
	
	
}
