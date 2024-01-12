package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// creating arraylist
		ArrayList<Object>obj = new ArrayList<Object>();
		//adding objects in arraylist
		obj.add(1);
		obj.add("selenium");
		obj.add(6.9);
		obj.add(4>14);
		obj.add('w');
		System.out.println(obj);
		
		
		//print arraylist second way
		Iterator<Object> abc = obj.iterator();
		while(abc.hasNext()) {  //boolean is the value stored or not
			System.out.println("using while loop use "+abc.next());
		}
		//print arraylist element third way
		for(Object bcd:obj) {
			System.out.println("for each loop "+bcd);
		}

	}

}
