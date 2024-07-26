package com.day3;
import java.lang.String;
public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer(" Irfan");
		//append()
		s1.append(" Bhai");
		System.out.println(s1);
		
		//insert()
		s1.insert(0, "Hello");
		System.out.println(s1);
		
		//replace()
		s1.replace(0, 4,"Bro");
		System.out.println(s1);
		
		//delete()
        s1.delete(0, 4);
        System.out.println(s1);
        
        //reverse()
      s1.reverse();
      System.out.println(s1);
	}

}
