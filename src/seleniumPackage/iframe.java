package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

				//Initiating your chromedriver
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//open browser with desried URL
				driver.get("https://paytm.com/");
				Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Sign In']")).click();
			Thread.sleep(2000);		

			int allFrames= driver.findElements(By.tagName("iframe")).size();
			System.out.println(allFrames);
			//driver.findElement(By.cssSelector("[alt='close Modal']")).click();
			for(int i =0;i<allFrames;i++) {
				driver.switchTo().frame(i);
				driver.switchTo().frame(i);
				String text="Open Paytm App";
				Thread.sleep(2000);
				String abc = driver.findElement(By.xpath("//span[text()='Open Paytm App']")).getText();
				if(abc.equalsIgnoreCase(text)) {
					System.out.println("element found");
				}
				else {
				System.out.println("element not found");
				}
			}
	}

}
