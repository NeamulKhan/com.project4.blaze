package com.project4.blaze.PageAction;

import com.project4.blaze.PageLocator.Project4ContactPageLocator;
import com.project4.blaze.PageLocator.Project4HomePageLocator;

import utility.BaseClass_Project4;

public class Project4ContasctPageAction extends BaseClass_Project4 {
	
	Project4ContactPageLocator project4ContactPageLocator = new Project4ContactPageLocator();
	
	public void enterContactDetails(String x, String y, String z) throws Exception{
		
		project4ContactPageLocator.contactEmail.sendKeys(x);	
		project4ContactPageLocator.contactName.sendKeys(y);
		project4ContactPageLocator.message.sendKeys(z);
		
		Thread.sleep(3000);
		
		project4ContactPageLocator.sendMsgButton.click();
				
	}
	
	public void verifyMsgReceived() throws Exception {
		
		Thread.sleep(5000);
		
	String msg = driver.switchTo().alert().getText();
	
	System.out.print(msg);
	
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();
		
	}

}
