package thread;

public class Use_my_thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		My_thread my_thread = new My_thread();
		my_thread.start();

		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Print from Runnable: " + Thread.currentThread());
			}
		};
		
		Thread my_runnable = new Thread(runnable);
		my_runnable.start();
	}
}
