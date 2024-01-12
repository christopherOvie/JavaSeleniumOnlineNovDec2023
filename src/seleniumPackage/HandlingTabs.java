package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		
		//open browser with desried URL
		  //Navigating to airbnb
		 driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
        driver.manage().window().maximize();
//        
//driver.findElement(By.cssSelector("[class*='u12b-opt-in__button  is-blue']")).click();
////considering that there is only one tab opened in that point.
//String oldTab = driver.getWindowHandle();
//driver.findElement(By.linkText("Twitter Advertising Blog")).click();
	}

}
