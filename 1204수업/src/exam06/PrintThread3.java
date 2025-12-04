package exam06;

public class PrintThread3 extends Thread {
	public void run()
	{
		while(true)
		{
			System.out.println("Running");
			
			if(Thread.interrupted())
			{
				break;
			}
		}
		
		System.out.println("Terminating");
	}

}
