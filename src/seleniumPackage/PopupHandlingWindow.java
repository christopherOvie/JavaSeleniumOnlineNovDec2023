package seleniumPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
driver.findElement(By.id("windowButton")).click();

//get the total of open windows
Set<String> allWindowID=driver.getWindowHandles();
System.out.println(allWindowID);
Iterator<String>abc=allWindowID.iterator();
String win1=abc.next();
String win2=abc.next();
//go to parent window

driver.switchTo().window(win1);
System.out.println("parent window id is "+win1);
System.out.println(driver.getTitle());
//print current url of child

Thread.sleep(3000);
driver.switchTo().window(win2);
System.out.println(driver.findElement(By.id("sampleHeading")).getText());
System.out.println(driver.getCurrentUrl());
driver.quit();

	}

	

}
