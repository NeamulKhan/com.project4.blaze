package com.project4.blaze.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass_Project4;

public class Project4CartPageLocator extends BaseClass_Project4 {
	
	public Project4CartPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
		@FindBy (xpath="//*[@id=\"tbodyid\"]/tr/td[2]")
		
		public WebElement verifyItemAdded;		
		
		@FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
		
		public WebElement placeOrderButton;			
			
			
	}
	
	


