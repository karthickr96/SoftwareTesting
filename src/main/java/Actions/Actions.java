package Actions;
import org.openqa.selenium.Keys;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Objects.Objects;
public class Actions {
	public static WebDriver driver;
	Objects obj = PageFactory.initElements(driver, Objects.class);
	public void enterText(String s) {
		obj.searchBar.sendKeys(s);
	}
	public void clickEnter() throws InterruptedException {
		Thread.sleep(3000);
		obj.searchBar.sendKeys(Keys.ENTER);
	}
}
