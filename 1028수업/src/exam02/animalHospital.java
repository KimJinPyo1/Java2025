package exam02;

public class animalHospital {

	public static void main(String[] args) {
		animalHospital h = new animalHospital();
		
		Dog dog = new Dog(100);
		
		h.CheckPatient(dog);
		h.HealPatient(dog);
		
		Cat cat = new Cat(1);
		
		h.CheckPatient(cat);
		h.HealPatient(cat);
		

	}
	
	void CheckPatient(Dog dog)
	{
		if(dog.IsHealthy())
		{
			System.out.println("Healthy!");
		} else
		{
			System.out.println("Sick!");
		}
	}
	
	void HealPatient(Dog dog)
	{
		dog.Heal();
	}
	
	void CheckPatient(Cat cat)
	{
		if(cat.IsHealthy())
		{
			System.out.println("Healthy!");
		} else
		{
			System.out.println("Sick!");
		}
	}
	
	void HealPatient(Cat cat)
	{
		cat.Heal();
	}

}
