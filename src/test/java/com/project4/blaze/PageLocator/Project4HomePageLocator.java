package com.project4.blaze.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass_Project4;

public class Project4HomePageLocator extends BaseClass_Project4{
	
	
	public Project4HomePageLocator() {
		
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy (id="signin2")
	
	public WebElement signupLink;
	
	@FindBy (id="login2")
	
	public WebElement loginLink;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a")
	
	public WebElement sonyvaioi5;
	
	@FindBy (xpath="//*[@id=\"navbarExample\"]/ul/li[2]/a")
	
	public WebElement contactLink;
	
	
}
