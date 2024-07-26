package com.day2.afternoon;
class A{
	final void display() {
		System.out.println("From Parent");
	}
}
/*class B extends A{
	void display() {
		System.out.println("From Child");
	}
} *///Cant override from A
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.display();

	}

}
