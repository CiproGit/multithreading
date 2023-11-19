package shared_data;

public class Shared_data {
	private int data;
	
	public Shared_data() {}
	
	public synchronized int get_data() {
		return data;
	}

	public synchronized void set_data(int data) {
		this.data = data;
	}
}
