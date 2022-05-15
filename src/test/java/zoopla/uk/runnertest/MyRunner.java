package zoopla.uk.runnertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty","json:target/cucumber.json"},
		features = ".//Features/",
		glue = {"zoopla.uk.stepdefinitiontest", "zoopla.uk.hookstest"},
		dryRun = false,
		monochrome = true,
		tags = "@Sanity"
		
		
		
		
		)




public class MyRunner extends AbstractTestNGCucumberTests {

}
