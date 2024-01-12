package javaPackage;

public class Encapsulation2 extends Encapsulation1{
	//final method cannot be overidden
	final void d() {
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		Encapsulation2 e2= new Encapsulation2();
		//System.out.println(e2.name);
		e2.setName("selenium");
		System.out.println(e2.getName());
		
	}
}
