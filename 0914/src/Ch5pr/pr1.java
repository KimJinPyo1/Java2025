package Ch5pr;
import java.util.Calendar;

public class pr1 {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2)
		{
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else
		{
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2))
		{
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++)
		{
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		System.out.println(arr1.length);
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++)
		{
			for(int k=0; k<mathScores[i].length; k++)
			{
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week)
		{
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일: " + today);

	}

}
