//Multithreading is the ability of a program or an operating system to enable more than one user at a time without requiring multiple copies of the program running on the computer.

package MultiThreading;

//import java.util.Scanner;

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Child Thread");
		}
	

	}
class Main{
	public static void main(String[]args){
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++){
			MultithreadingDemo1 obj= new MultithreadingDemo1();
			obj.start();
			
		}
	}
}
}
