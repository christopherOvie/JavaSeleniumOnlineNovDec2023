package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	@Test(priority = -10)
public void a() {
System.out.println("a method");
}
	@Test(enabled = true)
public void b() {
	System.out.println("b method");
}

	@Test(priority =0)
public void c() {
System.out.println("c method");

}
//invocation count
	@Test(invocationCount = 5)
public void d() {
System.out.println("d        method");   
}@Test(enabled = false)
	public void e() {
		System.out.println("e        method");
	}
//conditional skipping
@Test
	public void f() {
		System.out.println("fethod");
		throw new SkipException("this is skipped");
	}
@Test(enabled = false)
public void g() {
	System.out.println("g       method");
}
}
