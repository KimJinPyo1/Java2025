package sec03.exam03;

import java.io.IOException;
import java.util.Scanner;

public class readTest {

	public static void main(String[] args) {
//		while(true) {
//			try {
//				
//				int code = System.in.read();
//				System.out.println("code : " + code);
//				if(code == 'q') break;
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		Scanner scanner = new Scanner(System.in);
		
//		while(true)
//		{
//			int code = scanner.nextInt();
//			System.out.println("Code : " + code);
//			if(code == 'q') break;
//		}
		
		while(true)
		{
			String code = scanner.nextLine();
			System.out.println("Code : " + code);
			if(code.equals("q")) break;
		}

	}

}
