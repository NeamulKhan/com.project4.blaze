package testRunner_project4;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.BaseClass_Project4;


@CucumberOptions(features = {"src/test/resource/FeatureFolder_Project4"},
plugin = {"json:target/cucumber.json"},
<<<<<<< HEAD
glue ="stepDefination_Project4", tags= {"@Order_Conf"}//@Login,@Signup,@Cart
=======
glue ="stepDefination_Project4", tags= {"@Cart"}//@Login,@Signup
>>>>>>> b0e16fe479248c45180d59e15bb5ebdafef1b0b5
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
