package javaPackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {
WebDriver driver;
TakeScreenshotOnFailure t1= new TakeScreenshotOnFailure();
	
//	public void captureScreenshot(ITestResult result) {
//		if(ITestResult.FAILURE ==result.getStatus()) {
//			//create reference of TakesScreenshot Iterface  and do typecasting
//			TakesScreenshot ts = (TakesScreenshot) driver;    //typecasting of two interface
//			//gescreeshotas to capture the screenshot in file format
//			//getscreenshotas is a method of TakesScreenshot interface return type File
//			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//			
//			//copy the file from source to destination
//			File destFolder = new File("./screenshot/"+result.getName()+".jpg");
//			FileUtils.copyFile(sourceFile, destFolder);
//			//FileUtils.copyFile(sourceFile, destFolder);
//			//System.out.println(result.getName()+"method() screenshot captured");
//		}
@Test(groups= {"abc"})
		public void doLogin() {
			System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
			 t1.driver=new ChromeDriver();
			 t1.driver.manage().window().maximize();
			 t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//open browser with desried URL
			t1.driver.get("https://www.facebook.com/");
			t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			t1.driver.findElement(By.id("pass")).sendKeys("abcd");
		}
	public void takeScreenshot(ITestResult result) {
		t1.captureScreenshot(result);
	}
}
