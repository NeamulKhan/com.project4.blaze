package testRunner_project4;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.BaseClass_Project4;


@CucumberOptions(features = {"src/test/resource/FeatureFolder_Project4"},
plugin = {"json:target/cucumber.json"},
glue ="stepDefination_Project4" //tags= {"@OrderConf"}//@BlazeLogin,@BlazeAboutUs,@BlazeCart,@OrderConf
)

public class TestRunner_project4 extends AbstractTestNGCucumberTests{
	
	
	@BeforeTest
	
	public void blazesetup() throws Exception {
		
		BaseClass_Project4 test = new BaseClass_Project4();
		
		
		test.blazebrowserinit();
	}
	
	@AfterTest
	
	public void blazeClosureURL() {
	
		BaseClass_Project4 test = new BaseClass_Project4();
		
		//test.driver.quit();
	}


}
