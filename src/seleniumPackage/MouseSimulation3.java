package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseSimulation3 {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

				//Initiating your chromedriver
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//open browser with desried URL
				driver.get("https://jqueryui.com/droppable/"); //span[class*='_30XB9F']
				
				Thread.sleep(2000);
				//switch to frame
				driver.switchTo().frame(0);
			System.out.println("switch to frame");
			//draggable webelement
		WebElement drag=	driver.findElement(By.id("draggable"));
		
		//droppable webelement
		WebElement drop=	driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		act.dragAndDropBy(drop, 100, 60);
		
		
	}

}
