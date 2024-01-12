package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		
		//open browser with desried URL
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("button[title='Allow all cookies']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);
		
		
		
		//ist way
		
	List <WebElement> birthMonth=	driver.findElements(By.xpath("//select[@id='month']/option"));
	System.out.println("total dropdown values is : "+birthMonth.size());
	birthMonth.get(8).click();
	
	Thread.sleep(3000);
	
	birthMonth.get(5).click();
	Thread.sleep(3000);
	//2nd way
	
WebElement	bm=	driver.findElement(By.xpath("//select[@id='month']"));
Select month= new Select(bm);
month.selectByIndex(7);
Thread.sleep(3000);
month.selectByValue("3");
Thread.sleep(3000);
month.selectByVisibleText("Apr");

System.out.println(month.getFirstSelectedOption().getText());
List <WebElement> allMonth= month.getOptions();
for(int i =0;i<allMonth.size();i++) {
	System.out.println(allMonth.get(i).getText());
	if(allMonth.get(i).getText().equalsIgnoreCase("Sep")) {
		allMonth.get(i).click();
		//System.out.println(allMonth.get(i).isDisplayed());
	}
}
//4th way
Thread.sleep(3000);
WebElement	bm1=	driver.findElement(By.xpath("//select[@id='month']"));
bm1.sendKeys("Feb");

Thread.sleep(2000);
System.out.println(month.isMultiple());
Thread.sleep(2000);
month.selectByIndex(7);
Thread.sleep(2000);
month.selectByValue("3");
Thread.sleep(2000);
month.selectByVisibleText("Mar");



Thread.sleep(2000);
//month.deselectByVisibleText("Mar");
month.deselectByIndex(7);
Thread.sleep(2000);
month.deselectByValue("3");
Thread.sleep(2000);
month.deselectByVisibleText("Mar");
//5th way

		//driver.close();

	}

}
