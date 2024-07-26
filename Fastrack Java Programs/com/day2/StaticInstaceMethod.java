package com.day2;

public class StaticInstaceMethod {
	static void display(){
	System.out.println("It is Static Method");
	}
	void show() {
		System.out.println("Hey this is instance method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		StaticInstaceMethod instance=new StaticInstaceMethod();
		instance.show();
		

	}

}
