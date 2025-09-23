package algorithm2;//백준 10818

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int max_v = 0;
		int min_v = 10000001;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens())
		{
			int temp = Integer.parseInt(st.nextToken());
			if(max_v < temp)
			{
				max_v = temp;
			}
			
			
			if(min_v > temp)
			{
				min_v = temp;
			}
		}
		
		bw.write(String.valueOf(min_v) + " " + String.valueOf(max_v));
		bw.flush();
		br.close();

	}

}