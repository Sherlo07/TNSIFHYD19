package com.day2.afternoon;

public class GetterSetter {

	private int a,b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GetterSetter obj=new GetterSetter();
      obj.setA(100);
      System.out.println(obj.getA());
      obj.setB(200);
      System.out.println(obj.getB());
	}

}
