package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("button[title='Allow all cookies']")).click();
		
		String expectedText= "Facebook helps you connect and share with the people in your life.";
		
		String actualText=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
		Assert.assertEquals(actualText,expectedText);
		System.out.println("assertion passed");
		
		//false assertion
		
		Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).isSelected());
		System.out.println("false assertion verified");
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).isDisplayed());
		System.out.println("true assertion verified");
	}

}
