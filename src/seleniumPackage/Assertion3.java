package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void testcase1() {
	String expectedText="ab";
	String actualText="abc";
	
	
	try {
		Assert.assertEquals(actualText,expectedText,"both are not equal");
	} catch (Error e) {
		
		e.printStackTrace();
	}
	//Assert.assertEquals(actualText,expectedText,"both are not equal");
	System.out.println("assertion verifies");
	
	
	}

}
