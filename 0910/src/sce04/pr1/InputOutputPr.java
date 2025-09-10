package sce04.pr1;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputPr {

	public static void main(String[] args) throws IOException{ // 자꾸 read 오류나서 추가
		int value = 123;
		System.out.printf("상품의 가격:%d\n", value);
		System.out.printf("상품의 가격:%6d\n", value); // d 앞에 숫자는 정수의 자리수, 빈자리는 왼쪽부터 공백으로 채워줌
		//숫자에 - 붙여주면 공백을 오른쪽부터 채워줌
		//숫자에 0 을 붙여주면 공백 대신 0 으로 왼쪽부터 채워줌
		//\n 은 줄바꿈
		
		int KeyCode;
		KeyCode = System.in.read(); // 정수형 변수라서 알파벳을 치면 키코드 번호를 출력
		// read 만 사용하면 오류가 남 왜 나는지는 모르겠음
		System.out.println("KeyCode: " + KeyCode);
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true)
		{
			inputData = scanner.nextLine(); //엔터가 입력되기 전까지 모든 입력을 받아냄
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q"))
			{
				break; // q가 입력되면 반복문 종료
			}
		}
		
		System.out.println("종료");

	}

}
