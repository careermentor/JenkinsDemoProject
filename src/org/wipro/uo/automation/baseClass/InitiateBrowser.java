package org.wipro.uo.automation.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.uo.automation.utilitiesClass.ReadPropFiles;

public class InitiateBrowser 
{

public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();   //launch the chrome browser
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();   //launch the edge browser
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();   //launch the firefox browser
		}
		
		else
		{
			driver=new ChromeDriver();   //launch the chrome browser
		}
		
		
		driver.get(ReadPropFiles.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
}
