package javaPackage;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
	HashMap<Integer, String> hm = new HashMap <Integer, String>();
	hm.put(5, "jan");
	hm.put(10, "feb");
	hm.put(6, "mar");
	
	System.out.println(hm.get(1));//jan
	System.out.println(hm.get(2));//feb
	System.out.println(hm.get(3));//mar
	System.out.println(hm);
	}

}
