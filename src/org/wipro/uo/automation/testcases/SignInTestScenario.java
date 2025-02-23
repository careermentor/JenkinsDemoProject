package org.wipro.uo.automation.testcases;

import org.testng.annotations.Test;
import org.wipro.uo.automation.baseClass.InitiateBrowser;
import org.wipro.uo.automation.pages.LoginPage;
import org.wipro.uo.automation.pages.SignInPage;

public class SignInTestScenario extends InitiateBrowser
{

	@Test
	public void validatesigninFunc() throws Exception
	{
		SignInPage sign = new SignInPage(driver);
		
		sign.click_menu();
		sign.click_signlink();
		sign.enter_username("user1");
		sign.enter_password("pass1");
		sign.click_signinbttn();
		
	}
	
}
