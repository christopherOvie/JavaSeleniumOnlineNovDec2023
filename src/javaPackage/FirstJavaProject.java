package javaPackage;

public class FirstJavaProject {
	
	int a =5; //global variable

	static int c =10; //static variable

	//predefined method

	public static void main(String[] args) {

	System.out.println("hello friends");

	System.out.println("43566");

	amethod();

	bmethod();

	FirstJavaProject f= new FirstJavaProject();

	f.cmethod();

	// cmethod();

	}

	//user defined method

	public static void amethod() {



	int a =8; //local variable

	System.out.println("this is a method");

	System.out.println(a);

	System.out.println("zzzzzzzzzz");

	System.out.println(FirstJavaProject.c);



	}



	public static void bmethod() {

	System.out.println("this is b method");

	int d =10; //local variable

	}



	public void cmethod() {

	System.out.println("this is c method");

	int d =10; //local variable

	}



}
