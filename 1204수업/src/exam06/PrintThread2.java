package exam06;

public class PrintThread2 extends Thread{
	
	
	public void run()
	{
		try {
			while(true)
			{
				System.out.println("Running");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {}
		
		System.out.println("Terminating");
	}

}
