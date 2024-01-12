package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {
		int age=24;//local var
				
		int  weight = 50;
		
		//if block
		
		if(age > 18) {
		         if(weight>50) {
		    	                  System.out.println("eligible");
		                       }
		                   else {
		    	                    System.out.println("not eligible");
		                         }
		            }
		else {
		        System.out.println("age is not greater than 18");    	
		            }

	}

}
