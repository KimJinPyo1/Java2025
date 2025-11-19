package sec04;

public class ClassCast {

	public static void main(String[] args) throws Exception {
		Cat cat = new Cat();
//		ChangeDog(cat);
//		try {
//			Method();
//		}
//		catch(Exception e) {
//			System.out.println("Exception ");
//		}
		Method();
		System.out.println("Program is running");

	}
	
	public static void ChangeDog(Animal animal)
	{
		Dog dog = (Dog) animal;
	}
	
	public static void Method() throws Exception
	{
		System.out.println("Hi");
	}

}
