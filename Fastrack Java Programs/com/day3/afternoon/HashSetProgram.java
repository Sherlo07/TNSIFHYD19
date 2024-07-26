package com.day3.afternoon;
import java.lang.*;
import java.util.*;
public class HashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		        // Creating HashSet and adding elements
		        HashSet<String> hs = new HashSet<String>();
		        hs.add("Irfan");
		        hs.add("Mohammad");
		        hs.add("Mohammad");
		        System.out.println(hs);
		     // Traversing elements and removes the duplicates and use iterator for iteration
		        Iterator<String> itr = hs.iterator();
		        while (itr.hasNext()) {
		            System.out.print(itr.next()+" ");
		        }
		    }
		

		  
		        


	}


