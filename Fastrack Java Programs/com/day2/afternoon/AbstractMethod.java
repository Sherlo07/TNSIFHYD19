package com.day2.afternoon;
abstract class Area{
	abstract void shape();
}
class rectangle extends Area{
	void shape() {
		System.out.println("Hey from Rectangle");
	}
	
}

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        rectangle obj=new rectangle();
        obj.shape();
        }

}
