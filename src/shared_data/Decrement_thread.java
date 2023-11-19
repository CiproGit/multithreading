package shared_data;

class Decrement_thread extends Thread {
	private Shared_data shared_data;
	
	public Decrement_thread(Shared_data shared_data) {
		this.shared_data = shared_data;
	}

	public void run() {
		while (true) {
			int data = shared_data.get_data();
			shared_data.set_data(--data);
			
			System.out.println("Decreased value: " + shared_data.get_data());
		}
	}
}
