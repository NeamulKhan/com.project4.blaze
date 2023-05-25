package com.project4.blaze.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass_Project4;

public class Project4LoginPageLocator extends BaseClass_Project4 {
	
	public Project4LoginPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id="loginusername")
	
	public WebElement username;
	
	@FindBy (id="loginpassword")
	
	public WebElement password;
	
	@FindBy (xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	
	public WebElement loginButton;
	
	@FindBy (id="logout2")
	
	public WebElement logoutLink;

}
