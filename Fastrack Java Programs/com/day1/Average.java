package com.day1;

import java.util.Scanner; 

public class Average {

 public static void main(String[] args) { 
          Scanner scanner = new Scanner(System.in); 
         System.out.print("Enter the first number: "); 
         double a = scanner.nextDouble(); 
         System.out.print("Enter the second number: "); 
         double b = scanner.nextDouble(); 
         double average = (a + b) / 2;
           System.out.println("The average of " + a + " and " + b + " is: " + average); 


   } 
}
 