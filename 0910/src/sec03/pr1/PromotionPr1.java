package sec03.pr1;

public class PromotionPr1 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		// 범위가 작은 값을 범위가 큰 타입으로 자동변환
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		// 강제로 타입 변환

		// 정수 연산에선 int 로 결과값이 나옴
		// 그냥 int 쓰는게 맘 편함
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		// 피연산자에 int보다 큰 자료형이 있다면 그 자료형으로 결과값 나옴
		
		String str1 = 10 + 2 + "8"; // 앞에 10 + 2 를 먼저 계산해줘서 12 + "8" 128
		
		int a1 = Integer.parseInt("10"); // 문자열을 실수나 정수로 바꾸고 싶다면 자료형.parse자료형약자
		
		String s1 = String.valueOf(10); // 실수나 정수를 문자열로 바꾸고 싶다면 String.valueOf(값)
	}

}
