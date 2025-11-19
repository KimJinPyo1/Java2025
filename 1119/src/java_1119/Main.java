package java_1119;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        long max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if (max < a[i]) {
                max = a[i];
            }
        }

        long low = 0;
        long high = max;
        long ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;

            for (int treeHeight : a) {
                if (treeHeight > mid) {
                    sum += (treeHeight - mid);
                }
            }

            if (sum >= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}