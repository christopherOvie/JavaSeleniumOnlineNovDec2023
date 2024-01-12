package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");

				//Initiating your chromedriver
				WebDriver driver=new ChromeDriver();
				
				//open browser with desried URL
				driver.get("https://money.rediff.com/gainers");
				driver.findElement(By.xpath("//p[contains(text(),'Consent')]")).click();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//create  list --all companies
				List <WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
				System.out.println("total companies are "+ allCompanies.size());
				
				//create  list --all companies price
				List <WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
				System.out.println("total current price count are "+ currentPrice.size());
				
				
				String expectedCompanyName= "Cybertech System";
				for(int i =0;i<allCompanies.size();i++) {
					if(allCompanies.get(i).getText().equalsIgnoreCase(expectedCompanyName)) {
						//System.out.println(allCompanies.get(i).getText());
						
						System.out.println(allCompanies.get(i).getText() + " == "+ currentPrice.get(i).getText());
						allCompanies.get(i).click();
						break;
					}
				}
				
				


	}

}
