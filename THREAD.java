// TO IMPLEMENT THREAD CONCEPT IN JAVA

public class THREAD {

	public static void main(String[] args) {
		
		// thread t1 created with anonymous class
		Thread t1 = new Thread() {
				public void run() {
					// prints the thread name and the iteration it is in
					for(int i=1; i<=5; i++)
						System.out.println(Thread.currentThread().getName()+", i="+i);
				}}
				;
		
		// thread t2 created with lambda
		Thread t2 = new Thread(() -> {
				// prints the thread name and the iteration it is in
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName()+", i="+i);
				}
		});
		
		// after running the program we can the see that the output from both the threads are mixed up even though t2 is 
		// started first, so we can see that both the threads are run simultaneously
		t2.start();
		t1.start();
	}

}