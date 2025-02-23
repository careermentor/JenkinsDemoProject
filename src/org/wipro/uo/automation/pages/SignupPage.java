package org.wipro.uo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.uo.automation.utilitiesClass.ReadPropFiles;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void click_createnewaccountbttn() throws Exception
	{
		
		driver.findElement(By.xpath(ReadPropFiles.readelement("fb_signup_createnewaccount_xpath"))).click();
		
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		
		driver.findElement(By.name(ReadPropFiles.readelement("fb_signup_firstname_name"))).sendKeys(fname);
		
	}
	
	
	
	public void click_signupbttn() throws Exception
	{
		
		driver.findElement(By.name(ReadPropFiles.readelement("fb_signup_sugnupBttn_name"))).click();
		
	}
	
}
