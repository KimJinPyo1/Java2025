package java_1109; // 백준 토마토 문제

import java.util.*;
import java.io.*;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static final int[] mx = { 1, -1, 0, 0 };
    static final int[] my = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[m][n];
        int[][] visited = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(visited[i], -1);
        }

        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    q.offer(new Point(i, j));
                    visited[i][j] = 0;
                }
            }
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            int x = p.x;
            int y = p.y;

            for (int i = 0; i < 4; i++) {
                int n1 = x + mx[i];
                int n2 = y + my[i];

                if (n1 >= 0 && n1 < m && n2 >= 0 && n2 < n) {
                    if (visited[n1][n2] == -1 && map[n1][n2] == 0) {
                        visited[n1][n2] = visited[x][y] + 1;
                        q.offer(new Point(n1, n2));
                    }
                }
            }
        }

        int max_day = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0 && visited[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }
                max_day = Math.max(max_day, visited[i][j]);
            }
        }

        System.out.println(max_day);
    }
}