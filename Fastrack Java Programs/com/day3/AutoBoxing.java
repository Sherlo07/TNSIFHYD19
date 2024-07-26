package com.day3;
/* Autoboxing means converting Primitive datatypes to objects with using some syntax like
               //converts into wrapper objects
			    Integer aObj = Integer.valueOf(a);
			    It is syntax converting a int to Integer Object  (aObj is an object) */

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    int a = 5;
			    double b = 5.65;

			    //converts into wrapper objects
			    Integer aObj = Integer.valueOf(a);
			    Double bObj = Double.valueOf(b);
       //Here we are checking it is object or not by using instanceof;
			    if(aObj instanceof Integer) {
			      System.out.println("An object of Integer is created.");
			    }

			    if(bObj instanceof Double) {
			      System.out.println("An object of Double is created.");
			    }
			  }
			
	}


