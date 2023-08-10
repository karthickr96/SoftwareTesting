package Actions;

import Objects.PocObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PocActions {
	PocObjects obj;
	Actions actn;
	
	public PocActions (WebDriver driver){
		obj = PageFactory.initElements(driver,PocObjects.class);
		actn = new Actions(driver);
	}
	
	public void link() {
		obj.link.click();
	}
	
	public void fname(String text) {
		obj.fname.sendKeys(text);
	}
	
	public void submitbtn() {
		obj.submitbtn.click();
	}
	
	public void doubleclick() throws InterruptedException {
		
		actn.doubleClick(obj.doubleclick).perform();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
	}
	
	public void radiobtn() {
		obj.radiobtn.click();
	}
	
	public void checkbox() {
		obj.checkbox.click();
	}
	
	public void dropdown() {
		Select s  = new Select (obj.dropdown);
		s.selectByIndex(3);
	}
	
	public void generatealert() {
		obj.generatealert.click();
		///driver.switchTo().alert().accept();
	}
	
	public void confirmalert() throws InterruptedException {
		obj.confirmalert.click();
		//driver.switchTo().alert().accept();
	}
	/*public void dragdrop() {
		WebElement to = driver.findElement(By.xpath("//*[@id='targetDiv']"));
		Actions act = new Actions (driver);
		//act.dragAndDrop(to, to)
	}*/
	
}

