class Solution {
    public int maxStability(int n, int[][] edges, int k) {
        // Range for binary search: 1 to max possible doubled strength
        int low = 1, high = 200000;
        int ans = -1;

        // Check if a spanning tree is even possible with mandatory edges
        if (!isMandatoryStructureValid(n, edges)) return -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFormMST(n, edges, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean isMandatoryStructureValid(int n, int[][] edges) {
        DSU dsu = new DSU(n);
        int mandatoryCount = 0;
        for (int[] e : edges) {
            if (e[3] == 1) {
                // If nodes are already connected, a mandatory cycle is formed
                if (!dsu.union(e[0], e[1])) return false;
                mandatoryCount++;
            }
        }
        // A spanning tree can't have more than n-1 edges
        return mandatoryCount < n;
    }

    private boolean canFormMST(int n, int[][] edges, int k, int threshold) {
        DSU dsu = new DSU(n);
        int edgesUsed = 0;
        int upgradesUsed = 0;

        // 1. Process Mandatory Edges
        for (int[] e : edges) {
            if (e[3] == 1) {
                if (e[2] < threshold) return false; // Fixed strength fails threshold
                if (dsu.union(e[0], e[1])) edgesUsed++;
            }
        }

        // 2. Process Optional Edges that satisfy threshold WITHOUT upgrade
        for (int[] e : edges) {
            if (e[3] == 0 && e[2] >= threshold) {
                if (dsu.union(e[0], e[1])) edgesUsed++;
            }
        }

        // 3. Process Optional Edges that satisfy threshold WITH one upgrade
        for (int[] e : edges) {
            if (e[3] == 0 && e[2] < threshold && 2 * e[2] >= threshold) {
                if (upgradesUsed < k) {
                    if (dsu.union(e[0], e[1])) {
                        edgesUsed++;
                        upgradesUsed++;
                    }
                }
            }
        }

        return edgesUsed == n - 1;
    }

    class DSU {
        int[] parent;
        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }
        boolean union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI != rootJ) {
                parent[rootI] = rootJ;
                return true;
            }
            return false;
        }
    }
}