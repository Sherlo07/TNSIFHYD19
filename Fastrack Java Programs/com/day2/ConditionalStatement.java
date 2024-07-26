package com.day2;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the 1st number: ");
	         int a=sc.nextInt();
	         System.out.println("Enter the 2nd number: ");
	         int b=sc.nextInt();
	         if(a>=b) {
	        	 System.out.println("A is Greater ");
	         }
	         else {
	        	 System.out.println("B is Greater");
	         }
	         
	         
	         System.out.println("The choice of urs : ");
	         int choice=sc.nextInt();
	         switch(choice) {
	         case 1:
	        	 System.out.println("You have choosen the 1");
	        	 break;
	         case 2:
	        	 System.out.println("You have choosen the 2");
	        	 break;
	        	 default:
	        		 System.out.println("Enter the correct choice from 1 and 2 ");
	         }
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	}

}
