package com.day2.afternoon;
class Hi{
	Hi() {
		System.out.println("Hi Bro");
	}
}
class Bro extends Hi{
	Bro(){
		super();
	System.out.println("Hii bro from child");
	
	}
}
public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bro c=new Bro();
		

	}

}
