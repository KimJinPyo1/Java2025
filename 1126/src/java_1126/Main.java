package java_1126;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] answer = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> dp = new ArrayList<>();
        dp.add(arr[0]);
        
        for (int i = 0; i < n; i++) 
        {
            int currentVal = arr[i];

            if (currentVal > dp.get(dp.size() - 1)) {
                dp.add(currentVal);
                answer[i] = dp.size() - 1;
            } else
            {
                int idx = Collections.binarySearch(dp, currentVal);

                if (idx < 0) {
                    idx = -(idx + 1); 
                }
                
                dp.set(idx, currentVal);
                answer[i] = idx;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        int temp = dp.size() - 1;
        
        for (int i = n - 1; i >= 0; i--) {
            if (answer[i] == temp) {
                temp--;
                result.add(arr[i]);
            }
        }
        
        Collections.reverse(result);

        System.out.println(result.size());
        
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}