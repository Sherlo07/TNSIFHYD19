package com.day3;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(StringClass[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the elements");
		Scanner sc=new Scanner(System.in);
		int[][][] arr=new int[2][2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					arr[i][j][k]=sc.nextInt();
				}
				
			}
		}
		System.out.println("The elements are");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				
				
			}
			System.out.println();
		}
	}

}
