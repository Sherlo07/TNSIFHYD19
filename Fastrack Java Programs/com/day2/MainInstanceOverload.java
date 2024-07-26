package com.day2;
class C{
	int display(int a) {
		return a ;
	}
	
}
class D extends C{
	float display(float a) {
		return 9.0f;
	}
}
public class MainInstanceOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new D();
		System.out.println(obj.display(20));

	}

}
