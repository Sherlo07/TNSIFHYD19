package com.day1;
import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number:");
          int num=sc.nextInt();
          if(num%2==0) {
        	  System.out.println(num+ " It is Even");
          }
          else {
        	  System.out.println(num+ " It is odd");
          }
	}

}
