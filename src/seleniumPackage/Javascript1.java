package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

				//Initiating your chromedriver
				WebDriver driver=new ChromeDriver();
				
				//open browser with desried URL
				driver.get("https://www.facebook.com/");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector("button[title='Allow all cookies']")).click();
				
				//javascript executor
				JavascriptExecutor  jse = (JavascriptExecutor)driver;  //JavascriptExecutor is interface you cast it put into parenthesis
				//locate any elememnt
				jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
				jse.executeScript("document.getElementById('pass').value='abc@'");
				
				//scrolldown   using javascropt executor
				
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0,500)");
				//ip
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0, -500)");
	}

}
