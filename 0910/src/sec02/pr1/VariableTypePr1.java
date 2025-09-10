package sec02.pr1;

public class VariableTypePr1 {
	
	public static void main(String[] args) {
		int var1 = 0b1011;
		int var2 = 0206;
		
		System.out.println("var1: " + var1 + ", var2: " + var2);
		
		//byte var3 = 128;
		
		long var4 = 10L; // int 범위 이내라면 L , l 필요없음
		
		char c1 = 'A';
		char c2 = 65; // 둘 다 출력하면 A
		
		String s1 = "홍길동";	
		
		System.out.println("봄\\여름\\가을\"겨울\"");
		
		//float f1 = 3.14;  뒤에 f 붙여줘야함
		//실수는 기본적으로 double로 인식
		
		boolean a = true; // 논리 true false
	}

}
