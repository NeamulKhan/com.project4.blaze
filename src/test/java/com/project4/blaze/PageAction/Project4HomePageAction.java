package com.project4.blaze.PageAction;

import org.openqa.selenium.JavascriptExecutor;

import com.project4.blaze.PageLocator.Project4HomePageLocator;
import com.project4.blaze.PageLocator.Project4SignupPageLocator;

import utility.BaseClass_Project4;

public class Project4HomePageAction extends BaseClass_Project4 {
	
	Project4HomePageLocator project4HomePageLocator = new Project4HomePageLocator();
	
	
	
	
	public void clickSignupLink() {
		
		project4HomePageLocator.signupLink.click();
		
	}
	
	public void clickLoginLink() {
		
		project4HomePageLocator.loginLink.click();
	}
	
	public void clickSonyViaoi5() throws Exception {
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		Thread.sleep(5000);
		
		project4HomePageLocator.sonyvaioi5.click();
	}

}
