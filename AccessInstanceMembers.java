package com.si.assignment1;

public class AccessInstanceMembers {
    int a=10;
    void display() {
    	System.out.println("Hi This is intance method you have accessed");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessInstanceMembers a1=new AccessInstanceMembers();
		System.out.println(a1.a);
		a1.display();

	}

}
