package javaPackage;

public class Static6 {

int x =10;

static int y=6; //static variable

//non static method


public void a() {
	int z=10; //local variable
	System.out.println(z);
}

static int b=16;  //static variable



public static void b() {
	int a =5;  //local variable
	System.out.println(a);	
}


public static void main(String[] args) {
	Static6 s6 =new Static6();
	s6.a();
	System.out.println(y);
}
}
