package com.project4.blaze.PageAction;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.project4.blaze.PageLocator.Project4SignupPageLocator;

import utility.BaseClass_Project4;

public class Project4SignupPageAction extends BaseClass_Project4 {
	
	Project4SignupPageLocator project4SignupPageLocator = new Project4SignupPageLocator();
	
	public void enterCredentials(String x, String y) throws Exception {
		
		project4SignupPageLocator.username.sendKeys(x);
		project4SignupPageLocator.password.sendKeys(y);
		project4SignupPageLocator.signupButton.click();
		
		
		
	}
	
	public void verifySignup() throws Exception {
		
		Thread.sleep(5000);
		
	//	boolean verifysignup = project4SignupPageLocator.driver.switchTo().alert().getText();
		
		
		Alert alert = driver.switchTo().alert();
		
		String expectedmsg = "This user already exist.";
		
		String actualmsg = project4SignupPageLocator.driver.switchTo().alert().getText();
		
		Assert.assertEquals(actualmsg, expectedmsg);
		
	}
	
	

}
