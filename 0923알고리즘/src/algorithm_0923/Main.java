package algorithm_0923; // 백준 10250

import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//import java.io.IOException;

public class Main {

	public static void main(String[] args) /*throws IOException*/{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine(), "");
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int h = sc.nextInt();
			int w = sc.nextInt();
			int g = sc.nextInt();
			
			int floor = g%h;
			int room = g/h+1;
			
			if(floor == 0)
			{
				floor = h;
				room = g/h;
			}
			
			if(room>=10)
			{
				System.out.println(String.valueOf(floor) + String.valueOf(room));
			} else
				System.out.println(String.valueOf(floor) + "0" + String.valueOf(room));
		}
		

	}

}
