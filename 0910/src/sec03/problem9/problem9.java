package sec03.problem9;

public class problem9 {

	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.0f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)var1 + (int)var2 + (int)var3 + (int)Double.parseDouble(var4) + 1; // 이렇게 하면 소수부분이 전부 버려지기에 8이 나오는데
		// 9가 나오도록 하라고 했으므로 +1 해주기 ?
		System.out.println(result);

	}

}
