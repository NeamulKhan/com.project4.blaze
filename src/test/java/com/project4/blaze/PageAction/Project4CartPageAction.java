package com.project4.blaze.PageAction;

import org.testng.Assert;

import com.project4.blaze.PageLocator.Project4CartPageLocator;

import utility.BaseClass_Project4;

public class Project4CartPageAction extends BaseClass_Project4 {
	
	Project4CartPageLocator project4CartPageLocator = new Project4CartPageLocator();
	
	public void verifyItemAdded() {
		
		boolean verifyItem = project4CartPageLocator.verifyItemAdded.isDisplayed();
		
		Assert.assertTrue(verifyItem);
		
	}
	
	

}
