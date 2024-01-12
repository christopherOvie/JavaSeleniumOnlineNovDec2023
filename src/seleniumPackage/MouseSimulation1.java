package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

				//Initiating your chromedriver
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//open browser with desried URL
				driver.get("https://www.flipkart.com/"); //span[class*='_30XB9F']
				
				driver.findElement(By.cssSelector("div[class*='JFPqaw'] span[role='button']")).click();
				Thread.sleep(2000);
				//create electronics
				
				WebElement electro = driver.findElement(By.xpath("//span[text()='Electronics']"));
				
				//mouse simulation using actions class
				Actions act = new Actions(driver);
				Thread.sleep(2000);
				act.moveToElement(electro).build().perform();
				
				//keyboard operations
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
				Thread.sleep(2000);
				act.sendKeys(fashion, Keys.ENTER).build().perform();
				System.out.println("fashion option clicked");
				//driver.close();
				
				//right click on web page
//				Thread.sleep(2000);
//				act.contextClick().build().perform();
				
				
	}

}
