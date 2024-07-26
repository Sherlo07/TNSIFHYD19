package com.day3.afternoon;
import java.util.*;
public class DequeueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dequeue we can add and remove from both sides of the deque
      ArrayDeque<Integer> dq=new ArrayDeque<>();
      dq.add(10);
      dq.add(20);
      dq.add(30);
      dq.add(40);
      System.out.println(dq);
      
      //clear() Method deletes all elements
      dq.clear();
      System.out.println(dq);
      
      //Adding the element at First
      dq.addFirst(123);
      dq.addFirst(345);
      dq.addLast(456);
      System.out.println(dq);
	}

}
