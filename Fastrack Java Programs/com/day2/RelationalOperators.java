package com.day2;
import java.util.Scanner;
public class RelationalOperators {

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
	}

}
