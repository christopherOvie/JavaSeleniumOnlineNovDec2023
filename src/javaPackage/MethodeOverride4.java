package javaPackage;

public class MethodeOverride4 extends MethodeOverride3{
	public void run() {
		System.out.println("you are running");
	}
	
	public static void main(String[] args) {
		MethodeOverride4 m4 = new MethodeOverride4();
		m4.run();
		MethodeOverride3 m3 = new MethodeOverride3();
		m3.run();
	}
}
