package algo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = 1;
		int[] arr = new int[10];
		
		for(int i = 0; i<3; i++)
		{
			temp *= sc.nextInt();
		}
		
		String a = String.valueOf(temp);
		
		for(int i=0; i<String.valueOf(temp).length(); i++)
		{
			int n = a.charAt(i) - '0';
			arr[n] += 1;
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
