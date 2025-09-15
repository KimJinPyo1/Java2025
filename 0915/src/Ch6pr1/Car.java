package Ch6pr1;

public class Car {
	String company = "현대자동차";
	int speed;
	String color = "";
	int cc;
	
	Car(String color, int cc)
	{
		this.color = color;
		this.cc = cc;
	}
	
	Car(String color)
	{
		this("은색", 123);
	}
	
	Car(){}
}
