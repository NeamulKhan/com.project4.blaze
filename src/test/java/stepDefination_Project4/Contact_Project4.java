package stepDefination_Project4;

import com.project4.blaze.PageAction.Project4HomePageAction;

import cucumber.api.java.en.Then;
import utility.BaseClass_Project4;

public class Contact_Project4 extends BaseClass_Project4{
	
	Project4HomePageAction project4HomePageAction = new Project4HomePageAction();
	
	@Then("^click contact link$")
	public void click_contact_link() throws Throwable {
		
		project4HomePageAction.clickContactLink();
		
	   
	}

	@Then("^enter email,name, message and click send message button$")
	public void enter_email_name_message_and_click_send_message_button() throws Throwable {
	   
	}

	@Then("^verify received msg and click ok button$")
	public void verify_received_msg_and_click_ok_button() throws Throwable {
	   
	}



}
