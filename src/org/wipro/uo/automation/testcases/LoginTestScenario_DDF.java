package org.wipro.uo.automation.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.uo.automation.baseClass.InitiateBrowser;
import org.wipro.uo.automation.dataGenerator.TestDataGenerator;
import org.wipro.uo.automation.pages.LoginPage;

public class LoginTestScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="staticdata",dataProviderClass=TestDataGenerator.class)
	public void validateLoginFunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
}
