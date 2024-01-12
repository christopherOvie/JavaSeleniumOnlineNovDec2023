package javaPackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure {
WebDriver driver;
	//IIteseResult will provide us the test case execution status and name of the test case
	
	public void captureScreenshot(ITestResult result) {
		if(ITestResult.FAILURE ==result.getStatus()) {
			//create reference of TakesScreenshot Iterface  and do typecasting
			TakesScreenshot ts = (TakesScreenshot) driver;    //typecasting of two interface
			//gescreeshotas to capture the screenshot in file format
			//getscreenshotas is a method of TakesScreenshot interface return type File
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//copy the file from source to destination
			File destFolder = new File("./screenshot/"+result.getName()+".jpg");
			//FileUtils.copyFile(sourceFile, destFolder);
			//FileUtils.copyFile(sourceFile, destFolder);
			//System.out.println(result.getName()+"method() screenshot captured");
		}
	}
}
