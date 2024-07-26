package com.day3.afternoon;
import java.util.*;
public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList<Integer>();
		System.out.println("The Elements of Linkedlist are");
		//adding the elements
		for(int i=1;i<=5;i++) {
			li.add(i);
		}
		System.out.println(li);
		
		//removing an element
		li.remove(1);
		System.out.println(li);
		
		//get (retrieve)the elements
		
		for(int i=0;i<li.size();i++) {
			System.out.print(li.get(i)+" ");
		}
	}

}
