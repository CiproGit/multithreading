package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Use_executor {
	public static void main(String[] args) {
		ExecutorService executor_service = Executors.newFixedThreadPool(5);
		
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
		executor_service.submit(() -> System.out.println("Print from thread: " + Thread.currentThread()));
	}
}
