package seleniumPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
				
				
				int width = 600;
				int height = 400;
				
				//Initiating your chromedriver
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
//				Dimension dimension = new Dimension(width, height);
//				driver.manage().window().setSize(dimension);

				//open browser with desried URL
				//driver.manage().window().setSize();
				driver.get("https://demoqa.com/alerts"); //span[class*='_30XB9F']
				
				
		//		alert handling
				WebDriverWait wait = new WebDriverWait(driver, 30);
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmButton")));
				element.click();
				  

				//verify alert text
			String expectedTest="Do you confirm action?";
		String actualtext=	driver.switchTo().alert().getText();
		System.out.println(actualtext);
		Assert.assertEquals(actualtext, expectedTest);
		//System.out.println("alert text verified");
				
				//Thread.sleep(2000);
				//accept alert
				driver.switchTo().alert().accept();
				System.out.println("alert  accepted");
//				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#confirmButton")).click();
				Thread.sleep(2000);
				driver.switchTo().alert().dismiss();
				
				
				
			
				
				
			
				
	}

}
