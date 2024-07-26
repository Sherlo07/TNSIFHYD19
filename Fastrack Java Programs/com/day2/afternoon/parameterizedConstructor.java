package com.day2.afternoon;

public class parameterizedConstructor {

	private int a;
	public parameterizedConstructor(int b) {
		// TODO Auto-generated constructor stub
		System.out.println(b);
		this.a=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterizedConstructor obj=new parameterizedConstructor(50);
		

	}

}
