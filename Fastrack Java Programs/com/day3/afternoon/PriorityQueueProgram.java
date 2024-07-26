package com.day3.afternoon;
import java.util.*;
public class PriorityQueueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring Priority queue
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		//adding the elements
		p.add(10);
		p.add(20);
		p.add(30);
		System.out.println(p);
		
		//Use iterator 
		Iterator<Integer> ir=p.iterator();
		while(ir.hasNext()) {
			System.out.print(ir.next()+" ");
		}
		//using poll it means removing the 1st element FIFO
		p.poll();
		System.out.println(p);
		//Using peek it means we can print the top element
		
		System.out.println(p.peek());

	}

}
