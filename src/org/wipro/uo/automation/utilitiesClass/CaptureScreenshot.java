package org.wipro.uo.automation.utilitiesClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
	

	public static void saveresult(WebDriver driver, String fname) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //take the screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Results/" + fname + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
