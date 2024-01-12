package javaPackage;

public class Static3 {

	int roll; //declare global variable

	String name; //declare global variable

	static String college="it college"; //satatic varible

	//Constructor

	Static3(int r,String n){

	this.roll=r;

	this.name=n;

	}

	// Static3(){

	// this.roll=r;

	// this.name=n;

	// }

	public void getResult() {

	System.out.println(roll + " " + name + " " + college);

	}


}
