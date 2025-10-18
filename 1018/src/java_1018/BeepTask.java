package java_1018;

import java.awt.Toolkit;

public class BeepTask {
	public void run()
	{
		Toolkit toolkit = new Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++)
		{
			toolkit.bepp();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
