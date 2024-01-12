package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open browser with desried URL
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//div[contains(text(),'Accept all')])[2]")).click();
	
	
	driver.findElement(By.id("APjFqb")).sendKeys("how good works");
	List<WebElement> allsuggestions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	
	for(int i =0;i<allsuggestions.size();i++) {
		String expectedResult = "what good works";
		if(allsuggestions.get(i).getText().equalsIgnoreCase(expectedResult)) {
			allsuggestions.get(i).click();
			
		break;
			
		}
	}
	
	



		//driver.close();

	}

}
