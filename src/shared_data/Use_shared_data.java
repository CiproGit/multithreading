package shared_data;

public class Use_shared_data {
	public static void main(String[] args) {
		Shared_data shared_data = new Shared_data();
		
		Increment_thread increment_thread = new Increment_thread(shared_data);
		Decrement_thread decrement_thread = new Decrement_thread(shared_data);
		
		increment_thread.start();
		decrement_thread.start();
	}
}
