package com.day1;

import java.util.Scanner;

public class Concat { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the first string: "); 
      String str1 = scanner.nextLine(); 
      System.out.print("Enter the second string: "); 
       String str2 = scanner.nextLine(); 
      String Concat = str1 + str2; 

    System.out.println("The concatenated string is: " + Concat); 

  }
}

