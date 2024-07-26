package com.day1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String :");
    String str=sc.nextLine();
    String reversed="";
    for(int i=str.length()-1;i>=0;i--) {
    	reversed+=str.charAt(i);
    	
    }
    if(str.equals(reversed)) {
    	System.out.println("It is a Palindrome");
    }
    else {
    	System.out.println("It is not a palindrome");
    }
	}

}
