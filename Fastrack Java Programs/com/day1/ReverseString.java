package com.day1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ;");
        String str=sc.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--) {
        	reversed+=str.charAt(i);
        }
        System.out.println("The reversed String is :"+reversed);
	}

}
