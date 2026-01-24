class Solution {
    public int[][] transpose(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int[][] result = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = mat[i][j];
            }
        }
        return result;
    }
}
