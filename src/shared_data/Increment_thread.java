package shared_data;

class Increment_thread extends Thread {
	private Shared_data shared_data;
	
	public Increment_thread(Shared_data shared_data) {
		this.shared_data = shared_data;
	}

	public void run() {
		while (true) {
			int data = shared_data.get_data();
			shared_data.set_data(++data);
			
			System.out.println("Increased value: " + shared_data.get_data());
		}
	}
}
