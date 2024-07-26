package com.day3.afternoon;
class Game implements Runnable{
	public void run() {
		System.out.println("Helloo Bro");
	}
}
public class MultiThreadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=0;i<=5;i++) {
		Thread t=new Thread(new Game());
		t.start();
	}
		

	}

}
