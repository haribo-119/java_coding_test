package coding_test_book;

import java.util.*;



public class question30_Union_Find {
    public static void main(String[] args) {
        respond result = new respond();

//        int[][] operations = {{0,0,1},{0,1,2},{1,1,2}};
//        int k = 3;

        int[][] operations = {{0,0,1},{1,1,2},{0,1,2},{1,0,2}};
        int k =4;
        List<Boolean> answer = result.solution(k,operations);
        System.out.println(answer);

    }
}



class respond {
    static class UnionFind {
        int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        // 루트가 작은 쪽을 더 큰 쪽의 자식으로 연결
        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return;
            if (rootX < rootY) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
            }
        }

        public boolean equals(int x, int y) {
            return find(x) == find(y);
        }
    } //UnionFind

    public static List<Boolean> solution(int k, int[][] operations) {
        UnionFind uf = new UnionFind(k);

        List<Boolean> result = new ArrayList<>();
        for (int[] op : operations) {
            if (op[0] == 0) { // union
                uf.union(op[1], op[2]);
            } else if (op[0] == 1) { // equals
                result.add(uf.equals(op[1], op[2]));
            }
        }
        return result;
    }

}