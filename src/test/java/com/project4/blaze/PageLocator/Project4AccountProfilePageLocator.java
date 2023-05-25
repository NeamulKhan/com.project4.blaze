package com.project4.blaze.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass_Project4;

public class Project4AccountProfilePageLocator extends BaseClass_Project4 {
	
	public Project4AccountProfilePageLocator() {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy (id="nameofuser")
	
	public WebElement accountProfile;
	

}
