package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {
	
	@Test
	public void z() {
	Assert.assertTrue(64>7);	
		System.out.println("z  method");
	}
	
	@Test(dependsOnMethods = "z")
	public void a() {
		System.out.println("a method");
	}

}
