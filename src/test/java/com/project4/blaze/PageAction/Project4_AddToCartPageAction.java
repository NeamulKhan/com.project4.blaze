package com.project4.blaze.PageAction;

import com.project4.blaze.PageLocator.Project4HomePageLocator;
import com.project4.blaze.PageLocator.Project4_AddToCartPageLocator;

import utility.BaseClass_Project4;

public class Project4_AddToCartPageAction extends BaseClass_Project4 {
	
	Project4_AddToCartPageLocator project4_AddToCartPageLocator = new Project4_AddToCartPageLocator();
	
	public void clickAddToCartButton() throws Exception {
		
		project4_AddToCartPageLocator.addtocartButton.click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		
	}
	
	public void clickCartLink() throws Exception {
		
		Thread.sleep(5000);
		
		project4_AddToCartPageLocator.cartLink.click();
		
	}

}
