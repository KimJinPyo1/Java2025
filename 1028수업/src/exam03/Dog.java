package exam03;

public class Dog extends Animal {
	static int normalSpeed = 50;
	int runSpeed;
	
	Dog(int runSpeed){
		this.runSpeed = runSpeed;
	}
	
	boolean IsHealthy()
	{
		if(runSpeed > normalSpeed)
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	void Heal()
	{
		if(IsHealthy())
		{
			System.out.println("No Problem!");
		} else
		{
			System.out.println("Run more!");
		}
	}

}
