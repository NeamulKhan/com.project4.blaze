package com.project4.blaze.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass_Project4;

public class Project4SignupPageLocator extends BaseClass_Project4 {
	
	
	public Project4SignupPageLocator() {
		
		
		PageFactory.initElements( driver, this);
		
	}
	
	@FindBy (id="sign-username")
	
	public WebElement username;
	
	@FindBy (id="sign-password")
	
	public WebElement password;
	
	
	@FindBy (xpath ="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	
	public WebElement signupButton;
	
	

}
