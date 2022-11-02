/*
 * multithreading program in java
 * METHOD 2: Implementing Runnable interface
 */

class SampleThread2 implements Runnable{
	
	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("i = " + i);
		}
	}	
}

public class My_Thread_Test2 {

	public static void main(String[] args) {
		SampleThread2 threadObject = new SampleThread2();
		Thread thread = new Thread(threadObject);
		System.out.println("Thread about to start...");
		thread.start();
	} // end of main
} // end of class