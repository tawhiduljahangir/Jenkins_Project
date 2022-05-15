package zoopla.uk.hookstest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import zoopla.uk.basepage.Base_Page;

public class Hooks extends Base_Page {
	
	@Before
	public void getSetUp() {
		logger.info(">>>>>>>>>>>Started Automation<<<<<<<<<<<");
		Base_Page.initialization();
	}
	
	@After
	public void getTearDown() {
		logger.info(">>>>>>>>>>>Started Automation<<<<<<<<<<<");
		driver.quit();
	}

}
