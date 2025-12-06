package java_1207;

import java.util.*;
import java.io.*;

public class Main {
    
    static int[] parent;
    
    static class Edge implements Comparable<Edge> {
        long cost;
        int nodeA;
        int nodeB;

        public Edge(long cost, int nodeA, int nodeB) {
            this.cost = cost;
            this.nodeA = nodeA;
            this.nodeB = nodeB;
        }

        @Override
        public int compareTo(Edge other) {
            return Long.compare(this.cost, other.cost);
        }
    }
    
    static class Coordinate implements Comparable<Coordinate> {
        int coord;
        int id;

        public Coordinate(int coord, int id) {
            this.coord = coord;
            this.id = id;
        }

        @Override
        public int compareTo(Coordinate other) {
            return Integer.compare(this.coord, other.coord);
        }
    }

    static int findParent(int x) {
        if (parent[x] == x) return x;
        return parent[x] = findParent(parent[x]); 
    }

    static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        List<Coordinate> xCoords = new ArrayList<>();
        List<Coordinate> yCoords = new ArrayList<>();
        List<Coordinate> zCoords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            xCoords.add(new Coordinate(a, i + 1));
            yCoords.add(new Coordinate(b, i + 1));
            zCoords.add(new Coordinate(c, i + 1));
        }
        
        Collections.sort(xCoords);
        Collections.sort(yCoords);
        Collections.sort(zCoords);

        List<Edge> edges = new ArrayList<>();
        
        for (int i = 0; i < n - 1; i++) {
            edges.add(new Edge((long)xCoords.get(i + 1).coord - xCoords.get(i).coord, 
                                xCoords.get(i).id, xCoords.get(i + 1).id));
            
            edges.add(new Edge((long)yCoords.get(i + 1).coord - yCoords.get(i).coord, 
                                yCoords.get(i).id, yCoords.get(i + 1).id));
            
            edges.add(new Edge((long)zCoords.get(i + 1).coord - zCoords.get(i).coord, 
                                zCoords.get(i).id, zCoords.get(i + 1).id));
        }

        Collections.sort(edges);

        long result = 0;
        
        for (Edge edge : edges) {
            if (findParent(edge.nodeA) != findParent(edge.nodeB)) {
                unionParent(edge.nodeA, edge.nodeB);
                result += edge.cost;
            }
        }

        System.out.println(result);
    }
}