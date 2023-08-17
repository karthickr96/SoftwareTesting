package stepDefs;
import Actions.PocActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Actions.Actions;
import Actions.formActions;
import Actions.loginActions;
import Actions.swagActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}

