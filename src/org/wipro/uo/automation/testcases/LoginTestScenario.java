package org.wipro.uo.automation.testcases;

import org.testng.annotations.Test;
import org.wipro.uo.automation.baseClass.InitiateBrowser;
import org.wipro.uo.automation.pages.LoginPage;

public class LoginTestScenario extends InitiateBrowser
{

	@Test
	public void validateLoginFunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.click_loginbttn();
		
	}
	
}
