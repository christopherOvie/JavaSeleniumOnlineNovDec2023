package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG7 {
	WebDriver driver;
	

	@BeforeClass
	public void setEnv() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	}
	
	@DataProvider
	public Object[][] dataSet() throws IOException, InterruptedException {
		

		
		File src3= new File("C:\\Users\\GOD\\eclipse-workspace\\Online_Training_2023\\Repository\\testdata.properties");
		FileInputStream fis3= new FileInputStream(src3);
		Properties pro3= new Properties();
		pro3.load(fis3);
		
		Object[][] arr = new Object[2][2];
		arr[0][0]=pro3.getProperty("testData1");
		arr[0][1]=pro3.getProperty("testData2");
		
		//arr[1][0]=pro3.getProperty("testData3");
		arr[1][0]= "testData2";
		arr[1][1]= "testData2";
		
		arr[2][0]= "testData3";
		arr[2][1]= "testData3";
		
		return arr;		
		
	}
	@Test(dataProvider="dataSet")
public void enterData(String username,String password) throws InterruptedException {
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
}




}
