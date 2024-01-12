package javaPackage;

public class RelationalOperational1 {

	public static void main(String[] args) {
		int a =300;  //local variable
		int b =300;//local variable
		
		if(a!=b) {
			System.out.println("a is not equal to b");
		}
		else {
			System.out.println("a is  equal to b");
		}
		
		String p= "HELLO";
		String q="hello";
		
		//string comparing-ist way-case sesitive
		
		if(p ==q) {
			System.out.println("p anf q are equal for first way");
		}
		
		else {
			System.out.println("p anf q are not equal for first way");
		}
		
		if(p.equals(q)) {
			System.out.println("p anf q are equal for second way");
		}
		else {
			System.out.println("p anf q are not equal for second way");
		}
		
		
		if(p.equalsIgnoreCase(q)) {
			System.out.println("p anf q are equal for 3rd way");
		}
		else {
			System.out.println("p anf q are not equal for 3rd way");
		}
		
		
	}
	


}
