package javaPackage;

public class MethodeOverride2 extends MethodeOverride1{
	
	public void eat() {
		System.out.println("you am eating");
	}

public static void main(String[] args) {
	MethodeOverride2 mo2 = new MethodeOverride2();
	mo2.eat();  //you am eating
}
}
