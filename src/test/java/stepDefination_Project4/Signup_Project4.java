package stepDefination_Project4;

import cucumber.api.java.en.Given;
import utility.BaseClass_Project4;

public class Signup_Project4 extends BaseClass_Project4{
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	   
		launchURL(URL);
	}


}
