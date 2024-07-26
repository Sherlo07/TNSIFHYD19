package com.day2;
class E {
	static void display() {
		System.out.println("From Parent Class");
	}
}
class F extends E{
	static void display() {
		System.out.println("From Child");
	}
}
public class Main2StaticOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F.display();

	}

}
