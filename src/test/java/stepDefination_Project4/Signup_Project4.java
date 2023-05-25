package stepDefination_Project4;

import com.project4.blaze.PageAction.Project4HomePageAction;
import com.project4.blaze.PageAction.Project4SignupPageAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.BaseClass_Project4;
import utility.Utility_Project4;

public class Signup_Project4 extends BaseClass_Project4{
	
	Project4HomePageAction project4HomePageAction = new Project4HomePageAction();
	Project4SignupPageAction project4SignupPageAction = new Project4SignupPageAction();
	
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
		
		launchURL(URL);
	    
	}

	@Then("^click Sign up  link$")
	public void click_Sign_up_link() throws Throwable {
		
		project4HomePageAction.clickSignupLink();	
	   
	}

	@Then("^enter username and password and click Sign up button$")
	public void enter_username_and_password_and_click_Sign_up_button() throws Throwable {
		
		project4SignupPageAction.enterCredentials(project4_prop.getProperty("Username"),project4_prop.getProperty("Password") );
	   
	}

	@Then("^verify user successfully able to sign up$")
	public void verify_user_successfully_able_to_sign_up() throws Throwable {
		
		project4SignupPageAction.verifySignup();
		
		Utility_Project4.takeMyScreenshot(driver, "SignUp");
	   
	}



}
