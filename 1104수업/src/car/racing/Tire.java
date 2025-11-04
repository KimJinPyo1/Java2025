package car.racing;

public abstract class Tire {
	int capacity;
	int consume;
	
	Tire(int capacity, int consume)
	{
		this.capacity = capacity;
		this.consume = consume;
	}
	
	void UseTire()
	{
		capacity -= consume;
	}
	
	abstract boolean IsAvailable();

}
