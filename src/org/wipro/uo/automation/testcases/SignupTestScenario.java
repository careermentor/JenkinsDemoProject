package org.wipro.uo.automation.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.uo.automation.baseClass.InitiateBrowser;
import org.wipro.uo.automation.pages.SignupPage;

public class SignupTestScenario extends InitiateBrowser
{

	@Test
	public void validateSignupFunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		
		driver.findElement(By.name("lastname")).sendKeys("Java");
		
		
		
		sign.click_signupbttn();
	}
	
}
