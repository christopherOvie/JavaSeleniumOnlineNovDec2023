package javaPackage;

public class Constructor2 {
	int id;//blobal var
	String name; //global var
	String address;//
	//default constructor
	Constructor2(){
		System.out.println("hello default constructor");
	}

	Constructor2(int a,String b,String c){
		this.id=a;
		this.name=b;
		this.address=c;
		
	}
	//non static method
	public void displayInfo() {
		System.out.println(id +" " + name + " " + " "+ address);
	}
	
	public static void main(String[] args) {
		Constructor2 c2= new Constructor2();
		Constructor2 c3= new Constructor2(2,"peter","london");
		c3.displayInfo();
	}
}
