package javaPackage;

public class Statics7 {

	
	String a ;//global variable
	
	int b;  //global variable
	
	static int c =14;  //static member....member created at class level with static keyword
	//
	
	public static void a() {
		System.out.println("hello static");
	}
	public static void main(String[] args) {
		Statics7 s7 = new Statics7();
		
		s7.a="selenium";
		s7.b=8;
		c=9;
		System.out.println(s7.a + " " +s7.b + " " + c);
		
		int j=5;
		
		j=j;
		System.out.println(j);

	}

}
