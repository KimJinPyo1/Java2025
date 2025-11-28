package java_1128; // 4485

import java.io.*;
import java.util.*;

public class Main {

    static final int INF = 1_000_000_000; 

    static final int[] dx = {1, -1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};

    static class Node implements Comparable<Node> {
        int x, y;
        int cost;

        Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    static int[][] map;
    static int[][] dist;
    static int N;

    public static int dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[0][0] = map[0][0];
        pq.offer(new Node(0, 0, dist[0][0]));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int x = current.x;
            int y = current.y;
            int currentCost = current.cost;
            
            if (currentCost > dist[x][y]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    int nextCost = currentCost + map[nx][ny];

                    if (dist[nx][ny] > nextCost) {
                        dist[nx][ny] = nextCost;
                        pq.offer(new Node(nx, ny, nextCost));
                    }
                }
            }
        }
        
        return dist[N - 1][N - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = 1;

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty() || line.trim().equals("0")) {
                break;
            }
            
            N = Integer.parseInt(line.trim());

            map = new int[N][N];
            dist = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    dist[i][j] = INF;
                }
            }

            int result = dijkstra();
            System.out.println("Problem " + cnt + ": " + result);
            cnt++;
        }
    }
}