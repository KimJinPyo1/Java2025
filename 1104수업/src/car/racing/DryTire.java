package car.racing;

public class DryTire extends Tire {
	DryTire(int capacity, int consume)
	{
		super(capacity, consume);
	}
	
	boolean IsAvailable()
	{
		if(Env.isRain)
		{
			return false;
		}
		return capacity - consume > 0;
	}

}
