package exm01.sec01;

public class Car {
	String company;
	int maxSpeed;
	int speed;
	int rpm;
	
	public Car(String company, int maxSpeed)
	{
		this.company = company;
		this.maxSpeed = maxSpeed;
	}
	
	void SetMaxSpeed(int value)
	{
		maxSpeed = value;
	}
	
	void ShowInfo()
	{
		System.out.println("Company : " + company);
		System.out.println("Max Speed : " + maxSpeed);
		System.out.println("Current speed : " + speed);
		System.out.println("Current RPM : " + rpm);
	}
	
	void Hi()
	{
		int value = 0;
		System.out.println("Value : " + value);
	}

}
