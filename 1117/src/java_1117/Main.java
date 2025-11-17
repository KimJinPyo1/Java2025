package java_1117; // 1238

import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    int idx;
    int cost;

    public Node(int idx, int cost) {
        this.idx = idx;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.cost, other.cost);
    }
}

public class Main {
    static final int INF = 1000000000;
    static ArrayList<ArrayList<Node>> graph;
    static int[] dist;
    static int vortex, edge, end_node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vortex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        end_node = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= vortex; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            
            graph.get(start).add(new Node(end, cost));
        }

        dist = new int[vortex + 1];
        
        dijkstra(end_node);
        
        int[] returnCosts = new int[vortex + 1];
        for (int i = 1; i <= vortex; i++) {
            returnCosts[i] = dist[i];
        }

        int answer = 0;

        for (int i = 1; i <= vortex; i++) {
            if (i != end_node) {
                dijkstra(i);
                
                if (dist[end_node] != INF && returnCosts[i] != INF) {
                    answer = Math.max(answer, dist[end_node] + returnCosts[i]);
                }
            }
        }

        System.out.println(answer);
    }

    static void dijkstra(int start) {
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int now = current.idx;
            int now_dist = current.cost;

            if (dist[now] < now_dist) continue;

            for (Node nextNode : graph.get(now)) {
                int next = nextNode.idx;
                int cost = nextNode.cost + now_dist;

                if (dist[next] > cost) {
                    dist[next] = cost;
                    pq.offer(new Node(next, cost));
                }
            }
        }
    }
}