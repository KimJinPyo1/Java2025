package exam03;

public class NewHospital {

	public static void main(String[] args) {
		NewHospital h = new NewHospital();
		
		Dog dog = new Dog(100);
		
		h.CheckPatient(dog);
		h.HealPatient(dog);
		
		Cat cat = new Cat(1);
		
		h.CheckPatient(cat);
		h.HealPatient(cat);

	}
	
	
	void CheckPatient(Animal animal)
	{
		if(animal.IsHealthy())
		{
			System.out.println("Healthy!");
		} else
		{
			System.out.println("Sick!");
		}
	}
	
	void HealPatient(Animal animal)
	{
		animal.Heal();
	}
}
