package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		
		//open browser with desried URL
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("button[title='Allow all cookies']")).click();
		
		//enter username
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	
	//fetch attribute value
	System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
	//get height of input box
	
	System.out.println(driver.findElement(By.id("email")).getSize().getHeight());//52
	
	System.out.println(driver.findElement(By.id("email")).getSize().getWidth());//364  get width
	
	//use explicit wait to check if password is  visible
	
	WebDriverWait wt = new WebDriverWait(driver,30);
	wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
	
	



		//driver.close();

	}

}
