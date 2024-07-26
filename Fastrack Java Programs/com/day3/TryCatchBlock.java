package com.day3;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		int a=100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Hi");
		}
		

	}

}
