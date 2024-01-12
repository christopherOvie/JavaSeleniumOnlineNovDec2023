package javaPackage;

public class Abstraction2 extends Abstraction1{

	@Override
	void eat() {
		System.out.println("please eat");
		
	}
public static void main(String[] args) {
	Abstraction2 a2 = new Abstraction2();
	a2.eat();
	a2.a();
	System.out.println(a2.b);
	System.out.println(a2.c);
	System.out.println(Abstraction1.a);
}
}
