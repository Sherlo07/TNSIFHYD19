package com.day1;
import java.util.Scanner;
public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st number");
    int a=sc.nextInt();
    System.out.println("Enter the 2nd number");
    int b=sc.nextInt();
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("After swapping the numbers ");
     System.out.println("The 1st Number is "+a);
     System.out.println("The 2nd Number is "+b);
	}

}
