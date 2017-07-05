import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	// Run threads
	public static void main(String[] args)  {
		System.out.println("Main Thread:: starting");
		
		// Executor service that can execute up to 10 threads
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for (int i=0; i < 10; i++) {
			Runnable thread = new Runnable() {
				// Sample thread - prints out random numbers
				public void run() {
					Random random = new Random();
					for (int i=0; i < 1; i++) {
						System.out.println("Current Thread Name: "+Thread.currentThread().getName());
					}
				}};
				
			
			executor.execute(thread);
			
		}
		
		// Accept no more new threads
		executor.shutdown();
		
		// Waiting for all the threads to finish
		while(!executor.isTerminated()) {
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread:: end");
		
	}
	
}
