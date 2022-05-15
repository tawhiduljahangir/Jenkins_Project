package zoopla.uk.elementspage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.basepage.Base_Page;
import zoopla.uk.genericlivery.Utility;

public class ZooplaUK_LogingPage extends Base_Page {

	public ZooplaUK_LogingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "(//a[@data-testid='header-profile-sign-in'])[1]")
	@CacheLookup
	private WebElement clickOnSignBTN;

	public WebElement getclickOnSignBTN() {
		return clickOnSignBTN;
	}
	@FindBy (xpath = "//input[@type='email']")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getenterUserName() {
		return enterUserName;
	}	
	@FindBy (xpath = "//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getenterPassword() {
		return enterPassword;
	}
	
	@FindBy (xpath = "//button[@data-testid='signin-button']")
	@CacheLookup
	private WebElement clickOnLoginBTN;

	public WebElement getclickOnLoginBTN() {
		return clickOnLoginBTN;
	}
	@FindBy (xpath = "(//*[text()='For sale'])[1]")
	@CacheLookup
	private WebElement hoverOverForSale;

	public WebElement gethoverOverForSale() {
		return hoverOverForSale;
	}
	@FindBy (xpath = "//*[text()='UK property for sale']")
	@CacheLookup
	private WebElement clikForSaleUk;

	public WebElement getclikForSaleUk() {
		return clikForSaleUk;
	}
	@FindBy (id = "search-input-location")
	@CacheLookup
	private WebElement searchProperties;
	public WebElement getsearchProperties() {
		return searchProperties;
	}	
		
	public void getLoginAplication() {
		logger.info(">>>>>>>>>>>User click on signBTN<<<<<<<<<<<");
		Utility.getHighLightes(clickOnSignBTN);
		clickOnSignBTN.click(); 
		
		Utility.getHighLightes(enterUserName);
		logger.info(">>>>>>>>>>>User enter the usrName<<<<<<<<<<<");
		enterUserName.sendKeys(prop.getProperty("userName"));
		
		Utility.getHighLightes(enterPassword);
		logger.info(">>>>>>>>>>>User enter the password<<<<<<<<<<<");
		enterPassword.sendKeys(prop.getProperty("textPassword"));
		
		Utility.getHighLightes(clickOnLoginBTN);
		logger.info(">>>>>>>>>>>User click on loginBTN<<<<<<<<<<<");
		clickOnLoginBTN.click();
		
	}
	
	
	
}
