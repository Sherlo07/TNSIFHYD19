package com.day2;

public class StaticOverride {
  static void display() {
	  System.out.println("Hey this is Parent Class");
  }
  class B extends StaticOverride{
  static void display() {
	  System.out.println("Hey this is Child Class");
  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B.display();
	}

}
