package com.day1;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number :");
     int count=sc.nextInt();
    int num1=0,num2=1;
    System.out.println("The Fibanocci Series Of "+count+" numbers");
    for(int i=1;i<=count;i++) {
    	System.out.print(num1+" ");
    	int sum=num1+num2;
    	num1=num2;
    	num2=sum;
    }
	}

}
