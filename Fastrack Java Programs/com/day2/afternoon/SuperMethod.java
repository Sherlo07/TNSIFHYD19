package com.day2.afternoon;
class Apple{
	void eat() {
		System.out.println("Eating Apple");
	}
}
class Banana extends Apple{
	void eat() {
		super.eat();
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana obj=new Banana();
		obj.eat();

	}

}
