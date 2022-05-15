package zoopla.uk.stepdefinitiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import zoopla.uk.basepage.Base_Page;
import zoopla.uk.elementspage.ZooplaUK_LogingPage;
import zoopla.uk.genericlivery.Utility;
import zoopla.uk.genericlivery.WaitHelper;

public class LoginStepDefTest extends Base_Page {
	ZooplaUK_LogingPage pf;
	
	@Given("Users is able to verify login infomation successfully")
	public void users_is_able_to_verify_login_infomation_successfully() {
	  
		pf = new ZooplaUK_LogingPage();
	    pf.getLoginAplication();
	    Utility.getAssertions(prop.getProperty("actualText"), driver.getTitle());
	 
	    
	}
	@When("Users can hover over the page on the For Sale module and click on the UK Property For Sale")
	public void users_can_hover_over_the_page_on_the_for_sale_module_and_click_on_the_uk_property_for_sale() throws InterruptedException {
		WaitHelper.waitForElement(pf.gethoverOverForSale(), 30);
		logger.info(">>>>>>>>>>>User able to mouse hovr on for sale button<<<<<<<<<<<");
		Utility.getHighLightes(pf.gethoverOverForSale());
		  Utility.gerHoverOver(pf.gethoverOverForSale());
	   
		  WaitHelper.waitForElement(pf.getclikForSaleUk(), 30);
		  logger.info(">>>>>>>>>>>User able to click on UK Properties for sale button<<<<<<<<<<<");
		  Utility.getHighLightes(pf.getclikForSaleUk());
		  Utility.getActionClick(pf.getclikForSaleUk());
	}
	@When("Users is able to enter location- {string}- in the text box & hit enter button")
	public void users_is_able_to_enter_location_in_the_text_box_hit_enter_button(String location) {
		WaitHelper.waitForElement(pf.getsearchProperties(), 30); 
		logger.info(">>>>>>>>>>>User able to enter the location<<<<<<<<<<<");
		 Utility.getHighLightes(pf.getsearchProperties());
		pf.getsearchProperties().sendKeys(prop.getProperty("location"));
		
		pf.getsearchProperties().sendKeys(Keys.ENTER);
		Utility.captureScreenshot(driver, "EnterTheLocation");
	}
	@When("Users is able to print all value\\/price of the properties in the console")
	public void users_is_able_to_print_all_value_price_of_the_properties_in_the_console() {
	    
	
	}
	@When("click on the third property from the properties list")
	public void click_on_the_third_property_from_the_properties_list() {
	    
	    
	}
	@When("Users is able to print out the selected property details")
	public void users_is_able_to_print_out_the_selected_property_details() {
	    
	    
	}
	@Then("Users can Verify the price of the selected property")
	public void users_can_verify_the_price_of_the_selected_property() {
	    
	    
	}
	@Then("User is able to logout the application")
	public void user_is_able_to_logout_the_application() {
	    
	    
	}


}
