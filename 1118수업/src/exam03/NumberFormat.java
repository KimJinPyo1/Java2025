package exam03;

public class NumberFormat {

	public static void main(String[] args) {
		String age = "23";
		String age2 = "abc";
		int ageValue;
		int ageValue2;
		
		try {
			ageValue = Integer.parseInt(age);
			ageValue2 = Integer.parseInt(age2);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Error");
			ageValue = 0;
			ageValue2 = 0;
		}
		
		System.out.println("Your age : " + ageValue);
		System.out.println("Your age : " + ageValue2);

	}

}
