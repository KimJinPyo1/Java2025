package java_1106;

import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m;
    static int[][] w;
    static List<Point> emptySpaces = new ArrayList<>();
    static int answer = 0;
    static int[] mx = {1, -1, 0, 0};
    static int[] my = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        w = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                w[i][j] = Integer.parseInt(st.nextToken());
                if (w[i][j] == 0) {
                    emptySpaces.add(new Point(i, j));
                }
            }
        }

        Point[] walls = new Point[3];
        generateWallCombinations(walls, 0, 0);

        System.out.println(answer);
    }

    static void generateWallCombinations(Point[] walls, int wallCount, int startIdx) {
        if (wallCount == 3) {
            runSimulation(walls);
            return;
        }

        for (int i = startIdx; i < emptySpaces.size(); i++) {
            walls[wallCount] = emptySpaces.get(i);
            generateWallCombinations(walls, wallCount + 1, i + 1);
        }
    }

    static void runSimulation(Point[] walls) {
        
        int[][] temp = new int[n][m];
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = w[i][j];
                if (temp[i][j] == 2) {
                    q.add(new Point(i, j));
                }
            }
        }

        for (Point p : walls) {
            temp[p.x][p.y] = 1;
        }

        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = p.x + mx[i];
                int ny = p.y + my[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && temp[nx][ny] == 0) {
                    temp[nx][ny] = 2;
                    q.add(new Point(nx, ny));
                }
            }
        }

        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (temp[i][j] == 0) {
                    safeCount++;
                }
            }
        }

        answer = Math.max(answer, safeCount);
    }
}