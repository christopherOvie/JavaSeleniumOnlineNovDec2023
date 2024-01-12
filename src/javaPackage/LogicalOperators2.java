package javaPackage;

public class LogicalOperators2 {
static	int a =10;
static	int b =5;
static	int c=20;
	
	public static void main(String[] args) {
		//logical
		
		//check first condition and if false goes with it
		System.out.println(a < b && a < c);  //false
		
		//bitwise
		System.out.println(a < b & a < c);   //check both conditions but t anfd f   =f
	}
}
