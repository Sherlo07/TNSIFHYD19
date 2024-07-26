package com.day2.afternoon;
class Parent1{
	void display() {
		System.out.println("Hey this is the 1st Parent ");
	}
}
class Parent2 extends Parent1{
	void show() {
		System.out.println("Hey this is the 2nd parent ");
	}
}
class Child extends Parent2{
	void show1(){
		System.out.println("Hey this is child");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
		c.show();
		c.show1();

	}

}
