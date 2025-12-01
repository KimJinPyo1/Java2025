package java_1201; //2110

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long[] arr = new long[n]; 
        
        for (int i = 0; i < n; i++) 
        {
            arr[i] = Long.parseLong(br.readLine()); 
        }

        Arrays.sort(arr);

        long start = 1;
        long end = arr[n - 1];
        long answer = 0;

        while (start <= end) 
        {
            long mid = (start + end) / 2;

            long lastPlaced = arr[0]; 
            int count = 1;

            for (int i = 1; i < n; i++) 
            {
                if (arr[i] >= lastPlaced + mid) 
                {
                    lastPlaced = arr[i];
                    count++;
                }
            }

            if (count >= c) 
            {
                answer = mid;
                start = mid + 1;
            } else 
            {
                end = mid - 1;
            }
        }
        
        System.out.println(answer);
    }
}