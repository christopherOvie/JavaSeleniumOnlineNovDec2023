package javaPackage;

public class SuperAnimal {

	void eat() {
        System.out.println("Animal is eating");
        
        
	}
	
	
	class Dog extends SuperAnimal {
	    void eat() {
	        // Call the eat() method of the superclass
	        super.eat();
	        System.out.println("Dog is eating");
	    }
	}
	
	public static void main(String[] args) {

		SuperAnimal dog = new SuperAnimal();
		dog.eat();

	}

}
