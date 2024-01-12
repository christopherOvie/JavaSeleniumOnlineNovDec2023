package seleniumPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	 @Test
		public void a() {
			System.out.println(" a test method");
		}
	 @BeforeTest
		public void b() {
			System.out.println("hello b test method");
		}
	 @BeforeSuite
		public void c() {
			System.out.println("hello c test method");
		}
	
	 @AfterMethod
		public void d() {
			System.out.println("hello d test method");
		}
	 
	 @BeforeClass
		public void e() {
			System.out.println("hello e test method");
		}
	 @AfterTest
		public void f() {
			System.out.println("hello f test method");
		}
	 
	 @AfterClass
		public void g() {
			System.out.println("hello g test method");
		}
	 @BeforeMethod
		public void h() {
			System.out.println("hello h test method");
		}
	 @AfterSuite
		public void i() {
			System.out.println("hello i test method");
		}
	 @Test
		public void j() {
			System.out.println("hello j test method");
		}
	 
}
