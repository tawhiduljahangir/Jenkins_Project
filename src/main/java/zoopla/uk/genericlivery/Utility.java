package zoopla.uk.genericlivery;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import io.cucumber.java.Scenario;
import zoopla.uk.basepage.Base_Page;

public class Utility extends Base_Page{
	static String projectPath = "user.dir";
public static	Actions Action = new Actions(driver);

	public static void getAssertions(String actual, String ele) {
	Assert.assertEquals(actual, ele);	    
	}
	
	public static void getActionClick(WebElement elem) {
		 Action.click(elem).build().perform();
	}
	
	public static void gerHoverOver(WebElement elem) {	
		 Action.moveToElement(elem).perform();
	}
	public static void getHighLightes(WebElement ele) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;    	
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", ele); 
	}
	public static String getScreenshot(WebDriver driver, Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		String dateName = new SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty(projectPath) + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		try { 
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			logger.log(Level.WARN, "Interrup ted!", e);
			Thread.currentThread().interrupt();
		}
		return destination;
	}

	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}

}
