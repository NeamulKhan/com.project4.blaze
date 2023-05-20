package com.project4.blaze.PageAction;

import com.project4.blaze.PageLocator.Project4LoginPageLocator;

import utility.BaseClass_Project4;

public class Project4LoginPageAction extends BaseClass_Project4 {
	
	Project4LoginPageLocator project4LoginPageLocator = new Project4LoginPageLocator();
	
	public void loginCredentials(String x, String y) {
		
		project4LoginPageLocator.username.sendKeys(x);
		
		project4LoginPageLocator.password.sendKeys(y);
		
		project4LoginPageLocator.loginButton.click();
		
	}
	
	public void logout() throws Exception {
		
		Thread.sleep(5000);
		
		project4LoginPageLocator.logoutLink.click();
	}

}
