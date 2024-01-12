package javaPackage;

public class TypecastingNarrowing {

	public static void main(String[] args) {
		//convert d to int
		double b = 5.9;
		
		int a = (int) b; //manual casting double to int
		System.out.println(b);//5.9
		System.out.println(a); //5
		
		//sTRING TO INTEGER Conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);  //10
		System.out.println("xxxxx");
		//Integer to String converstion
		int z = 5;
		String t = String.valueOf(z);
		System.out.println(t.length());
		System.out.println(t);
		

	}

}
