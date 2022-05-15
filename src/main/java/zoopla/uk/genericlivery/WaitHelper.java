package zoopla.uk.genericlivery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zoopla.uk.basepage.Base_Page;

public class WaitHelper extends Base_Page{

	public static void waitForElement(WebElement elem, int time) {
		WebDriverWait wait = new WebDriverWait (driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
	}
	
	
}
