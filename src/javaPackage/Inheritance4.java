package javaPackage;

public class Inheritance4 extends Inheritance3{

	
	public void multiply(int x,int y) {
		z=x*y;
		System.out.println("product is "+z);
	}
	public static void main(String[] args) {
		
int x =20, y=10;

Inheritance4 i4= new Inheritance4();
//System.out.println(i4.z);
i4.add(x, y);
i4.subtract(15, y);//5
i4.multiply(x, y); //200

	}

}
