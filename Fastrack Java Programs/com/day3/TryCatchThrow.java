package com.day3;

public class TryCatchThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int a=100;
        	int b=99;
        	if(a>=100) {
        		throw new ArithmeticException("Valid");
        	}
        	
        }
        catch(ArithmeticException e) {
        	System.out.println(e);
        	
        }
	}

}
