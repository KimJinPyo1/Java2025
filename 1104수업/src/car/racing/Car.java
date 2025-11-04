package car.racing;

public class Car {
	Tire tire;
	
	void Run()
	{
		tire.UseTire();
	}
	
	boolean CheckTire()
	{
		if(tire == null)
		{
			return false;
		}
		return tire.IsAvailable();
	}
	
	void ChangeTire(Tire tire)
	{
		this.tire = tire;
//		System.out.println("Change tire!!");
	}

}
