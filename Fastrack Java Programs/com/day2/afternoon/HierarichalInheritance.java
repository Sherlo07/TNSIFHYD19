package com.day2.afternoon;
class panda{
	void eat() {
		System.out.println("Eatingggg");
	}
}
class dog2 extends panda{
	void bark() {
		System.out.println("Barking");
	}
}
class Lion extends panda{
	void roar() {
		System.out.println("Roars");
	}
}
public class HierarichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion s=new Lion();
		s.roar();
		//s.bark(); error because can't access
		s.eat();

	}

}
