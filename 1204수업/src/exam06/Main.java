package exam06;

public class Main {

	public static void main(String[] args) {
		PrintThread3 thread = new PrintThread3();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
//		thread.SetStop(true);
		thread.interrupt();

	}

}
