package car.racing;

public class WetTire extends Tire {
	WetTire(int capacity, int consume)
	{
		super(capacity, consume);
	}
	
	boolean IsAvailable()
	{
		return capacity - consume > 0;
	}

}
