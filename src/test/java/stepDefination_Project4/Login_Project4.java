package stepDefination_Project4;

import com.project4.blaze.PageAction.Project4AccountProfilePageAction;
import com.project4.blaze.PageAction.Project4HomePageAction;
import com.project4.blaze.PageAction.Project4LoginPageAction;

import cucumber.api.java.en.Then;
import utility.BaseClass_Project4;
import utility.Utility_Project4;

public class Login_Project4 extends BaseClass_Project4{
	
	Project4HomePageAction project4HomePageAction = new Project4HomePageAction();
	Project4LoginPageAction project4LoginPageAction = new Project4LoginPageAction();
	Project4AccountProfilePageAction project4AccountProfilePageAction = new Project4AccountProfilePageAction();

@Then("^click Log in  link$")
public void click_Log_in_link() throws Throwable {
	
	project4HomePageAction.clickLoginLink();
  
}

@Then("^enter username and password and click Login button$")
public void enter_username_and_password_and_click_Login_button() throws Throwable {
	
	project4LoginPageAction.loginCredentials(project4_prop.getProperty("Username"),project4_prop.getProperty("Password") );
    
}

@Then("^verify user successfully log in with valid credentials$")
public void verify_user_successfully_log_in_with_valid_credentials() throws Throwable {
	
	project4AccountProfilePageAction.verifyLogin();
	
	Utility_Project4.takeMyScreenshot(driver, "Login");
	
    
}


@Then("^user successfully logout from account$")
public void user_successfully_logout_from_account() throws Throwable {
    
	project4LoginPageAction.logout();
	
	
}




}
