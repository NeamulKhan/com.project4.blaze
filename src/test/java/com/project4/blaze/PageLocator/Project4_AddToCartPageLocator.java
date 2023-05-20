package com.project4.blaze.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass_Project4;

public class Project4_AddToCartPageLocator extends BaseClass_Project4 {
	
	
	public Project4_AddToCartPageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy( xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
	
	public WebElement addtocartButton;
	
	
	@FindBy (id="cartur")
	
	public WebElement cartLink;
	
	
}
