package com.day3.afternoon;
import java.util.*;
public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<String> s=new Stack<>();
       s.push("Irfan");
       s.push("Pranay Goud");
       s.push("Sharath");
       System.out.println(s);
       
       //to remove the brackets we use the iterator of stack
       //create a iterator for stack
         Iterator<String> itr=s.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
         //To Pop the element
         s.pop();
         System.out.print(s);
         System.out.println();
         itr=s.iterator();
         while(itr.hasNext()) {
        	 System.out.print(itr.next()+" ");
         }
    		  }

}
