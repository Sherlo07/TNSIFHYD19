package com.day2.afternoon;
class dog23{
	int a=10;
}
class Buffalo extends dog23{
	void display() {
	System.out.println(super.a);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffalo obj=new Buffalo();
		obj.display(); 

	}

}
