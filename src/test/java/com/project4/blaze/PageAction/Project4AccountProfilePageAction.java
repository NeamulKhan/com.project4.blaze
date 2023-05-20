package com.project4.blaze.PageAction;

import org.testng.Assert;

import com.project4.blaze.PageLocator.Project4AccountProfilePageLocator;

import utility.BaseClass_Project4;

public class Project4AccountProfilePageAction extends BaseClass_Project4 {
	
	Project4AccountProfilePageLocator project4AccountProfilePageLocator = new Project4AccountProfilePageLocator();
	
	public void verifyLogin() throws Exception {
		
		Thread.sleep(5000);
		
		boolean verifylogin = project4AccountProfilePageLocator.accountProfile.isDisplayed();
		
		Assert.assertTrue(verifylogin);
		
		
		
	}
}
