class Solution {
    boolean[] zeroRow;
    boolean[] zeroCol;
    boolean[][] visited;

    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        zeroRow = new boolean[r];
        zeroCol = new boolean[c];
        visited = new boolean[r][c];

        // discover all zero influence
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0 && !visited[i][j]){
                    helper(matrix, i, j);
                }
            }
        }

        // apply zeros
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(zeroRow[i] || zeroCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    void helper(int[][] mat, int r, int c){
        if(visited[r][c]) return;
        visited[r][c] = true;

        zeroRow[r] = true;
        zeroCol[c] = true;

        // scan row
        for(int j=0;j<mat[0].length;j++){
            if(mat[r][j]==0){
                helper(mat, r, j);
            }
        }

        // scan column
        for(int i=0;i<mat.length;i++){
            if(mat[i][c]==0){
                helper(mat, i, c);
            }
        }
    }
}
