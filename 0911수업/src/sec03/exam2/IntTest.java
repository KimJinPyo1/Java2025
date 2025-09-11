package sec03.exam2;
import java.util.Scanner;

public class IntTest {

	public static void main(String[] args) {
		byte val1 = 1;
		byte val2 = 2;
		
		//byte val3 = val1 + val2;
		
		System.out.println(1/2);
		System.out.println(1.0/2.0);
		
		String str = "10";
		int value = 20;
		//String str1 = str + value;
		String str1 = "" + value;
		int result = val1 + Integer.parseInt(str);
		System.out.println(str1);
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println(input);
		
	}

}
