package thread;

class My_thread extends Thread {
	public void run() {
		System.out.println("Print from My_thread: " + Thread.currentThread());
	}
}
