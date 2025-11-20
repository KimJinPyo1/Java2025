package exam2;

public class Main {

	public static void main(String[] args) {
		Test test1 = new Test(123);
		Test test2 = new Test(123);
		Object obj = test1;
		
		if(test1.equals(test2))
		{
			System.out.println("Equal");
		} else
		{
			System.out.println("Not Equal");
		}

	}

}
