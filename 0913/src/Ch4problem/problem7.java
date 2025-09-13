package Ch4problem;
import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
		boolean run = true;
		int money = 0;
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("--------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			
			System.out.println("--------------------------");
			System.out.println("선택> ");
			
			int n = Integer.parseInt(scanner.nextLine());
			
			switch(n)
			{
			case 1:
				System.out.println("예금액> ");
				money += (scanner.nextInt());
				break;
			case 2:
				System.out.println("출금액> ");
				temp = (scanner.nextInt());
				if(temp>money)
				{
					System.out.println("출금할 금액이 부족합니다.");
				} else
					money -= temp;
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(money);
				break;
			default:
				run = false;
				break;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
