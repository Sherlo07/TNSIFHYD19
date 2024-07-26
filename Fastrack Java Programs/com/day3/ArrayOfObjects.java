package com.day3;
class Student{
	String Student_Name;
	int roll_no;

Student(String a,int b){
	this.roll_no=b;
	this.Student_Name=a;
}
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student[] arr=new Student[2];
      arr[0]=new Student("Irfan",1245);
      arr[1]=new Student("Pranay Goud",1250);
      System.out.println(arr[1].roll_no+" " +arr[1].Student_Name);
	}

}
