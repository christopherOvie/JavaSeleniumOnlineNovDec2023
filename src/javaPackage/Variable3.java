package javaPackage;

public class Variable3 {

	public static void main(String[] args) {
		String s = "Hello Java";

		int lengthOfString = s.length();

		//System.out.println(lengthOfString);
		
		String b = new String("john");
		b.concat("riu");
		
		System.out.println(b.concat("riu"));
		
		StringBuffer x= new StringBuffer("chris");
		System.out.println(x.append("durga"));
	}

}
