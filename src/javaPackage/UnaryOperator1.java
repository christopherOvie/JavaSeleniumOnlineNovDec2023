package javaPackage;

public class UnaryOperator1 {

	public static void main(String[] args) {
		int a=10;//defin local variabl
		int b =10;
		
		System.out.println(a++);//10,11  print 11 buyt backgroiund12
		
		System.out.println(a++  +  ++a);//11,12  +  13,13       11+13=24

		System.out.println(b++  +  ++b); //10,11  + 12.12  //22
		
		System.out.println(b++  +  ++b);//12.13 +14,14 //26
		
		System.out.println(b);  //14
		
		System.out.println(a);  //13
		
		System.out.println(a++  +  b++);  //13,14  +  14,15  //27
		
		
	
		
		
		

	}

}
