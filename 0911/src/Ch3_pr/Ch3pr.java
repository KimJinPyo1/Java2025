package Ch3_pr;

public class Ch3pr {

	public static void main(String[] args) {
		int a = -100;
		int result1 = +a;
		System.out.println(result1);
		
		int x = 10;
		x++;
		
		System.out.println(x);
		
		boolean play = true;
		
		if(play)
			System.out.println("true");
		
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(grade);

	}

}
