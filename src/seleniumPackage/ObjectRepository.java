package seleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//specify location of property file
		
		File src1= new File("C:\\Users\\GOD\\eclipse-workspace\\Online_Training_2023\\Repository\\config.properties");
		File src2= new File("C:\\Users\\GOD\\eclipse-workspace\\Online_Training_2023\\Repository\\locator.properties");
		File src3= new File("C:\\Users\\GOD\\eclipse-workspace\\Online_Training_2023\\Repository\\testdata.properties");
		
		//create fileinputstram class object to load the file
		
		FileInputStream fis1= new FileInputStream(src1);
		FileInputStream fis2= new FileInputStream(src2);
		FileInputStream fis3= new FileInputStream(src3);
		
		//create property class object to read the dile
		
		Properties pro1= new Properties();
		pro1.load(fis1);
		
		Properties pro2= new Properties();
		pro2.load(fis2);
		
		Properties pro3= new Properties();
		pro3.load(fis3);
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		
		//open browser with desried URL
		//driver.get("https://www.facebook.com/");
		driver.get(pro1.getProperty("URL"));
		driver.findElement(By.cssSelector("button[title='Allow all cookies']")).click();
		//Get Property will accept key and return value of that key
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("testData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("testData2"));
		
		driver.close();
	}

}
