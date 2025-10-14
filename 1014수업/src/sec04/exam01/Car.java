package sec04.exam01;

public class Car {
	int gas;
	int minGas;
	String teamName;
	String color;
	static int numberOfCars;
	
	Car(int gas, int minGas, String teamName, String color)
	{
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
		numberOfCars++;
	}
	
	boolean IsleftGas()
	{
		if(gas < minGas)
		{
			System.out.println("Need Fuel");
			return false;
		}
		
		System.out.println("Can More Round");
		return true;
	}
	
	void AddGas(int gas)
	{
		System.out.println("Full Tank");
		this.gas += gas;
	}
	
	void RunOneRound()
	{
		System.out.println("One round done");
		this.gas -= minGas;
	}
	
	static void ShowNumberOfCars()
	{
		System.out.println("Number of Cars : " + numberOfCars);
	}
	

}
