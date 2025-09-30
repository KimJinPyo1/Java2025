package exm01.sec01;

public class MainClass {

	public static void main(String[] args) {
		Student st1 = new Student();
		//st1.SayHello();
		//Car c = new Car("Hyundai", 200);
		//c.SetMaxSpeed(100);
		//c.maxSpeed = 200;
		//c.ShowInfo();
		
		Calcu1 cal = new Calcu1();
		int val = cal.add(1, 3);
		double vald = cal.add(1.0, 2.0);
		System.out.println("value " + val);

	}

}
