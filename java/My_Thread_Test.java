/* multithreading in java
 *  METHODS 1: extends Thread class
 * extending thread class
 */
class SampleThread extends Thread{
	
	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("i = " + i);
		}
	}	
}

public class My_Thread_Test {

	public static void main(String[] args) {
		SampleThread t1 = new SampleThread();
		System.out.println("Thread about to start...");
		t1.start();
	}
}
