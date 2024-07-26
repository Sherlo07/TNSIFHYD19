package com.day3.afternoon;

import java.util.*;

public class VectorListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		System.out.println("The Elements of Vector are ");
		//adding the elements
		for(int i=1;i<=5;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		//removing an element
		v.remove(1);
		System.out.println(v);
		
		//get (retrieve)the elements
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}

	}

}
