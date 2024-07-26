package com.day1;
class Bro{
protected void display() {
	System.out.println("Hiii From Protected ");
}
}
public class Protected extends Bro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected obj=new Protected();
		obj.display();

	}

}
