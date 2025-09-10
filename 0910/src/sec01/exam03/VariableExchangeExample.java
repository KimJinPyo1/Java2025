package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		//변수 서로 바꿔주는 법
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);

	}

}
