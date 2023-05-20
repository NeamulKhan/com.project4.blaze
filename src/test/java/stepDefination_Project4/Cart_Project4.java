package stepDefination_Project4;

import com.project4.blaze.PageAction.Project4CartPageAction;
import com.project4.blaze.PageAction.Project4HomePageAction;
import com.project4.blaze.PageAction.Project4_AddToCartPageAction;

import cucumber.api.java.en.Then;
import utility.BaseClass_Project4;
import utility.Utility_Project4;

public class Cart_Project4 extends BaseClass_Project4 {
	
	Project4HomePageAction project4HomePageAction = new Project4HomePageAction();
	Project4_AddToCartPageAction project4_AddToCartPageAction = new Project4_AddToCartPageAction();
	Project4CartPageAction project4CartPageAction = new Project4CartPageAction();
	
	
	
	@Then("^click sony vaio i(\\d+)$")
	public void click_sony_vaio_i(int arg1) throws Throwable {
		
		project4HomePageAction.clickSonyViaoi5();
		
	    
	}

	@Then("^click add to cart button$")
	public void click_add_to_cart_button() throws Throwable {
	   
		project4_AddToCartPageAction.clickAddToCartButton();
		
		
	}
	
	@Then("^click cart link$")
	public void click_cart_link() throws Throwable {
	   
		project4_AddToCartPageAction.clickCartLink();	
		
		
	}

	@Then("^verify item added in the cart$")
	public void verify_item_added_in_the_cart() throws Throwable {
	   
		
		project4CartPageAction.verifyItemAdded();
		
		Utility_Project4.takeMyScreenshot(driver, "Cart Page");
		
	}


}
