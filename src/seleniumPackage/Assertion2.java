package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	@Test
	public void testcase1() {
	String expectedText="abc";
	String actualText="abc";
	
	int a = 10;
	int b = 20;
	
	Assert.assertEquals(actualText,expectedText);
	Assert.assertNotEquals(a, b);
	Assert.assertFalse(a>b);
	Assert.assertTrue(a<b);
	
	
	}

}
