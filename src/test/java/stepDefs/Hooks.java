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
		//Actions.driver = new ChromeDriver();
		//Actions.driver.manage().window().maximize();
		//formActions.driver = new ChromeDriver();
		//formActions.driver.manage().window().maximize();
		//PocActions.driver = new ChromeDriver();
		//PocActions.driver.manage().window().maximize();
		//loginActions.driver = new ChromeDriver();
		//loginActions.driver.manage().window().maximize();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}

