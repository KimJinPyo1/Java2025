package java_1123;

import java.io.*;
import java.util.*;

public class Main {
    
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int answer = 0;

    static final int[] mx = { 1, -1, 0, 0, 1, 1, -1, -1 };
    static final int[] my = { 0, 0, 1, -1, 1, -1, 1, -1 };

    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(int row, int col) {

        Queue<Node> q = new LinkedList<>();

        visited[row][col] = true;
        q.offer(new Node(row, col));

        while (!q.isEmpty()) {
            Node current = q.poll();
            int r = current.x;
            int c = current.y;

            for (int i = 0; i < 8; i++) {
                int n1 = r + mx[i];
                int n2 = c + my[i];

                if (n1 >= 0 && n1 < N && n2 >= 0 && n2 < M && map[n1][n2] != 0
                    && !visited[n1][n2] && (map[r][c] >= map[n1][n2])) {
                    
                    visited[n1][n2] = true;
                    q.offer(new Node(n1, n2));
                }
            }
        }
        
        int com = 0;
        int start_row = 0;
        int start_col = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && map[i][j] != 0) {
                    if (com <= map[i][j]) {
                        com = map[i][j];
                        start_row = i;
                        start_col = j;
                    }
                }
            }
        }

        if (com != 0) {
            bfs(start_row, start_col);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int com = 0;
        int start_row = 0;
        int start_col = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    if (com <= map[i][j]) {
                        com = map[i][j];
                        start_row = i;
                        start_col = j;
                    }
                }
            }
        }

        if (com != 0) {
             bfs(start_row, start_col);
        }

        System.out.println(answer);
    }
}