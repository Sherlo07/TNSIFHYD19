package com.day2.afternoon;

class Car{
	void start() {
		System.out.println("Car has started ");
	}
}
class Kia extends Car{
	void run() {
		System.out.println("Kia ");
	}
}
class Swift extends Kia{
	void show() {
		System.out.println("Swift");
	}
}
class Skoda extends Car{
	void display() {
		System.out.println("Skoda");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Skoda s=new Skoda();
    s.display();
    
    s.start();
	}

}
