package org.wipro.uo.automation.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator
{

	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
	//	Object data[] = {"user1","pass1"};   //1-D array
		Object data[][] = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};   //2-D array
		return data;
	}
	
}
