package com.day3.afternoon;

import java.util.*;
public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println("The Elements are");
		//adding the elements
		for(int i=1;i<=5;i++) {
			a.add(i);
		}
		System.out.println(a);
		
		//removing an element
		a.remove(1);
		System.out.println(a);
		
		//get (retrieve)the elements
		
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		
		
		
	}

}
