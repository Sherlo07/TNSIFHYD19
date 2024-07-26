package com.day3.afternoon;
import java.util.*;
public class LinkedHashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Creating LinkedHashSet and adding elements
		        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		        lhs.add("Irfan");
		        lhs.add("Mohammad");
		        lhs.add("Irfan");
		        System.out.println(lhs);
		     // Traversing elements
		        Iterator<String> itr = lhs.iterator();
		        while (itr.hasNext()) {
		            System.out.print(itr.next()+" ");
		        }
		    }
		

		       


	}


