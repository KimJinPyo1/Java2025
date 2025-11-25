package exam06;

public class SmartPhone {
	String company;
	String os;
	
	public SmartPhone(String company, String os)
	{
		this.company = company;
		this.os = os;
	}
	
	public String toString()
	{
		return company + ", " + os;
	}

}
