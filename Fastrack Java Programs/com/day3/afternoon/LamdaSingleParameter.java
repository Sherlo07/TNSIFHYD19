package com.day3.afternoon;
interface Irfan{
	public String  Bro(String name);
}
public class LamdaSingleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Irfan i=(name)->{
			return name;
		};
			System.out.println("It has Called with a parameter");
		System.out.println(i.Bro("hiiiiiiiiii"));

	}

}

