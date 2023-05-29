package com.project4.blaze.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass_Project4;

public class Project4ContactPageLocator extends BaseClass_Project4 {
	
	public Project4ContactPageLocator () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id ="recipient-email")
	
	public WebElement contactEmail;
	
	@FindBy (id="recipient-name")
	
	public WebElement contactName;
	
	@FindBy (id="message-text")
	
	public WebElement message;
	
	@FindBy (xpath ="//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
	
	public WebElement sendMsgButton;
	

}
