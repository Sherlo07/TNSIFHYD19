package com.day3;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s2=new StringBuilder(" Irfan");
		//append()
		s2.append(" Bhai");
		System.out.println(s2);
		
		//insert()
		s2.insert(0, "Hello");
		System.out.println(s2);
		
		//replace()
		s2.replace(0, 4,"Bro");
		System.out.println(s2);
		
		//delete()
        s2.delete(0, 4);
        System.out.println(s2);
        //it is same as string buffer
        //There is no reverse method in stringbuilder 
        

	}

}
