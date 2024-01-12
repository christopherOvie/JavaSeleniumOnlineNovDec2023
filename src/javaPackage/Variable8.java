package javaPackage;

public class Variable8 {

	
	int b =10;

	static int c=6;



	public static void main(String[] args) {

	int a=8;

	System.out.println(a);

	System.out.println("xxxxxxxxxxxxxxxxx");

	// d();

	//static member calling

	System.out.println(Variable8.c); //or why increase code length

	System.out.println(c);

	System.out.println("yyyyyyyyyyyyyy");

	//for method

	d();

	//non static member calling

	System.out.println("zzzzzzzzzz");

	Variable8 v = new Variable8();

	System.out.println(v.b);

	v.f();

	}

	public static void d() {

	int e=15; //local var

	System.out.println(e);

	}

	public void f() {

	int g =10; //local var

	System.out.println(g);

	}




}
