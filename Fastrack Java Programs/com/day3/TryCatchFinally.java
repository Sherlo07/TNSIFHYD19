package com.day3;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 int a=100/0;
     }
     catch(ArithmeticException e) {
    	 System.out.println(e);
     }
     finally {
    	 System.out.println("Hi This is an exception problem");
     }
	}

}
