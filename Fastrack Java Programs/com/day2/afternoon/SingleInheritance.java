package com.day2.afternoon;
class Animal{
	void eat() {
		System.out.println("Animal is Eating ");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is Barking ");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog b=new Dog();
		b.bark();
		b.eat();
	

	}

}
