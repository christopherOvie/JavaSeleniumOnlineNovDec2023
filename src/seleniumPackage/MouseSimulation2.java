package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

				//Initiating your chromedriver
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//open browser with desried URL
				driver.get("https://demoqa.com/browser-windows"); //span[class*='_30XB9F']
			
				
				
				//stepi 1  tab handling
				Thread.sleep(2000);
				driver.findElement(By.id("tabButton")).click();
				//get total number of open tabs/windows
				//Set does not allow duplicate values
				Set<String>allWindows=driver.getWindowHandles();
				System.out.println(allWindows);
				
				
	}

}
