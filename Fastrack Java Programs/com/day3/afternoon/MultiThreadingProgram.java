package com.day3.afternoon;
class Multi extends Thread{
	public void run() {
		System.out.println("The Thread is running: "+Thread.currentThread().getId());
	}
}
public class MultiThreadingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<=5;i++) {
			Multi m=new Multi();
			m.start();
		}

	}

}
