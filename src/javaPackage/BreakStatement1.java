package javaPackage;

public class BreakStatement1 {

	public static void main(String[] args) {
		//outer loop
		for(int i =1;i<3;i++) {
			
	        //inner loop
			
			for(int j =1;j<3;j++) {
				
				if(i==2 && j==2) {
					break;
				}
				System.out.println(i + " " + j);
				
			}
			System.out.println("control come out of inner loop");
		}
		System.out.println("control come out of outer loop");
	}

}
