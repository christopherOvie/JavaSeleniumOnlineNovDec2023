package javaPackage;

public class EH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a =5/0;
		}
catch(ArithmeticException a) {
	a.printStackTrace();
	System.out.println(a);
}catch(NullPointerException n) {
	System.out.println(n);
}
	}

}
