package com.day3.afternoon;
interface Shape{
	void circle();
}
public class LamdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=()->{
			System.out.println("Helloo this is a Lamda Expression");
		};
		s.circle();

	}

}
