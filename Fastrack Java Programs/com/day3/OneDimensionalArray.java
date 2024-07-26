package com.day3;
import java.util.Scanner;
public class OneDimensionalArray {

	public static void main(StringClass[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the array Elements ");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
			}
		System.out.println("Print the elements ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
