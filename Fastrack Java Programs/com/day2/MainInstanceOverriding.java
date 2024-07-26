package com.day2;
class A{
	void display() {
		System.out.println("From Parent");
	}
}
class B extends A{
	void display() {
		System.out.println("From Child");
	}
}
public class MainInstanceOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();
		obj.display();

	}

}
