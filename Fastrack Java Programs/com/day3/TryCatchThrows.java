package com.day3;

public class TryCatchThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(15);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void checkAge(int age) 
		throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}
}

