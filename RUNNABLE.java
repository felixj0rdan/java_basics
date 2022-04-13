// TO SHOW THE WORKING OF RUNNABLE INTERFACE

// threads are used to perform actions simultaneously 

public class RUNNABLE {

	public static void main(String[] args) {

		// defining runnable r using lambda
		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+", i="+i);
			}
		};
		
		// threads 
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		// starting the threads simultaneously
		// after running the program we can the see that the output from both the threads are mixed up even though t2 is 
			// started first, so we can see that both the threads are run simultaneously
		t2.start();
		t1.start();
	}

}
