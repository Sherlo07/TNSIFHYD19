package com.day3.afternoon;
import java.util.*;
import java.lang.*;
@FunctionalInterface  
	interface display{
	public void run();
}

public class FunctionalInterfaceProgram implements display{
    
	public void run() {
		System.out.println("hello i am running");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceProgram f=new FunctionalInterfaceProgram();
		f.run();

	}

}
