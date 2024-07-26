package com.day3;
/*we can achieve 100% abstraction and multiple inheritance
there are two parent class and one child class in multiple inheritance
  from two parent class one parent class must be interface with the unimplemented method
  and in child class the unimplemented method must be done with using public
 */
class Vehicle{
	void dispay() {
		System.out.println("Hello Vehicle");
	}
}
interface car1{
	String hyundai();
}
class Audiii extends Vehicle implements car1{
	void start() {
		System.out.println("Hey From Child");
	}
	public String hyundai(){
		return "Dzire";
	}
}
public class InterfaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audiii a=new Audiii();
		a.start();
		System.out.println(a.hyundai());
		a.dispay();}

}
