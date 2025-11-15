package java_1115;

import java.util.*;
import java.io.*;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n;
    static char[][] map;
    static boolean[][] visited;
    static int[] mx = {1, -1, 0, 0};
    static int[] my = {0, 0, 1, -1};
    
    static int carea = 0;
    static int iarea = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        n = Integer.parseInt(br.readLine());
        
        map = new char[n][n];
        visited = new boolean[n][n];

        
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, 1, map[i][j]);
                    carea++;
                }
            }
        }

       
        visited = new boolean[n][n];

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, 2, map[i][j]);
                    iarea++;
                }
            }
        }

        
        System.out.println(carea + " " + iarea);
    }

    static void bfs(int x, int y, int w, char s) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point current = q.poll();
            int cx = current.x;
            int cy = current.y;

           
            if (w == 1) {
                for (int i = 0; i < 4; i++) {
                    int nx = cx + mx[i];
                    int ny = cy + my[i];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                        if (map[nx][ny] == s && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            q.offer(new Point(nx, ny));
                        }
                    }
                }
            } 
          
            else {
                for (int i = 0; i < 4; i++) {
                    int nx = cx + mx[i];
                    int ny = cy + my[i];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                        if (s == 'R' || s == 'G') {
                           
                            if (map[nx][ny] == 'R' || map[nx][ny] == 'G') {
                                visited[nx][ny] = true;
                                q.offer(new Point(nx, ny));
                            }
                        } else {
                           
                            if (map[nx][ny] == 'B') {
                                visited[nx][ny] = true;
                                q.offer(new Point(nx, ny));
                            }
                        }
                    }
                }
            }
        }
    }
}