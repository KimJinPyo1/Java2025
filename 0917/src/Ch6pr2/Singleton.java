package Ch6pr2;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	final String nation = "Korea";
	static final double EARTH_RADIUS = 6400;
	
	private Singleton() {}
	
	static Singleton getInstance()
	{
		return singleton;
	}

}
