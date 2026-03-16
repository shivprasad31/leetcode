import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                set.add(grid[i][j]); // size 0 rhombus

                int maxK = Math.min(Math.min(i, j), Math.min(m - 1 - i, n - 1 - j));

                for (int k = 1; k <= maxK; k++) {

                    int sum = 0;

                    int x = i - k;
                    int y = j;

                    // top -> right
                    for (int t = 0; t < k; t++) {
                        sum += grid[x + t][y + t];
                    }

                    // right -> bottom
                    for (int t = 0; t < k; t++) {
                        sum += grid[i + t][j + k - t];
                    }

                    // bottom -> left
                    for (int t = 0; t < k; t++) {
                        sum += grid[i + k - t][j - t];
                    }

                    // left -> top
                    for (int t = 0; t < k; t++) {
                        sum += grid[i - t][j - k + t];
                    }

                    set.add(sum);
                }
            }
        }

        int size = Math.min(3, set.size());
        int[] res = new int[size];

        int idx = 0;
        for (int val : set) {
            if (idx == size) break;
            res[idx++] = val;
        }

        return res;
    }
}