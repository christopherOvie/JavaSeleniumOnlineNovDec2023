package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		
		//open browser with desried URL
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("button[title='Allow all cookies']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		//ist way
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='1']")).click();  //fem
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='2']")).click();  //ma
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='-1']")).click();  //cus
//second way
		
		Thread.sleep(2000);
		List <WebElement> radio= driver.findElements(By.cssSelector("input[type='radio']"));
		System.out.println("total radio buttons : "+ radio.size());
		
		System.out.println(radio.get(0).isSelected());//false
		
		System.out.println(radio.get(1).isEnabled()); //true
		
		System.out.println(radio.get(1).isDisplayed());  //true
		Thread.sleep(2000);
		
		radio.get(0).click();
		Thread.sleep(2000);
		System.out.println(radio.get(1).isSelected());//false
		
		
		//third way
		Thread.sleep(2000);
		List <WebElement> radioText= driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("total radio buttons : "+ radioText.size());
		
		String expectedResult="Male";
		
		for(int i =0; i<radioText.size();i++) {
			
			if(radioText.get(i).getText().equalsIgnoreCase(expectedResult)) {
				radioText.get(i).click();
				
				System.out.println(expectedResult + "clicked");
				break;
			}
			
		}
		driver.close();

	}

}
