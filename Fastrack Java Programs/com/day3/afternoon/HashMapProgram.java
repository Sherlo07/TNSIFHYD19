package com.day3.afternoon;
import java.util.*;
public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating HashMap and adding elements
		        HashMap<Integer, String> hm = new HashMap<Integer, String>();
		        hm.put(1, "Irfan");
		        hm.put(2, "Mohammad");
		        hm.put(3, "Bro");
		        System.out.println("The Value for 1 is:: " + hm.get(1));
		        
		        // Traversing through the HashMap
		        for (Map.Entry<Integer, String> e : hm.entrySet())
		            System.out.println(e.getKey() + " " + e.getValue());
		    

	}

}
