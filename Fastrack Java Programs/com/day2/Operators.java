package com.day2;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the 1st number: ");
      int a=sc.nextInt();
      System.out.println("Enter the 2nd number: ");
      int b=sc.nextInt();
      int sum=a+b;
      System.out.println("The sum is "+sum);
      int sub=a-b;
      System.out.println("The sub is "+sub);
      int mul=a*b;
      System.out.println("The mul is "+mul);
      float div=a/b;
      System.out.println("The div is "+div);
      int mod=a%b;
      System.out.println("The mod is "+mod);
      
	}

}
