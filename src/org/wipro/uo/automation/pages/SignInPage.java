package org.wipro.uo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.uo.automation.utilitiesClass.ReadPropFiles;

public class SignInPage 
{

	WebDriver driver;
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void click_menu() throws Exception
	{
		
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("UO_Homepage_menu_css"))).click();
		
	}
	
	public void click_signlink() throws Exception
	{
		
		driver.findElement(By.xpath(ReadPropFiles.readelement("UO_Menu_signlink_xpath"))).click();
		
	}
	

	public void enter_username(String uname) throws Exception
	{
		
		driver.findElement(By.id(ReadPropFiles.readelement("UO_Signin_username_id"))).sendKeys(uname);
		
	}
	
	public void enter_password(String pass) throws Exception
	{
		
		driver.findElement(By.id(ReadPropFiles.readelement("UO_Signin_password_id"))).sendKeys(pass);
		
	}
	
	public void click_signinbttn() throws Exception
	{
		
		driver.findElement(By.name(ReadPropFiles.readelement("UO_Signin_Signinbttn_name"))).click();
		
	}
	
}
