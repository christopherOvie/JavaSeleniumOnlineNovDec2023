package javaPackage;

public class Inheritance7 extends Inheritance6{

	
	public void eat() {
		System.out.println("i am eating");
	}
	
	public static void main(String[] args) {
		Inheritance7 i7= new Inheritance7();
		i7.read();
		i7.write();
		i7.eat();
		
//		i am reading
//		i am writing
//		i am eating
	}
}
