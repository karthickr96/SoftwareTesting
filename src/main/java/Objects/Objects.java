package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Objects {
	@FindBy(xpath="//textarea[@name='q']")
	public WebElement searchBar;
}
