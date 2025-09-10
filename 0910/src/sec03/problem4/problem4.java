package sec03.problem4;

public class problem4 {

	public static void main(String[] args) {
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;
		//short result = s1 + 21;
		//int 보다 작은 short나 byte가 피연산자로 쓰임
		//그렇다면 연산 결과는 int 로 나오기 때문에 에러
		int result = s1 + s2;
		int result1 = i1 + i2;

	}

}
