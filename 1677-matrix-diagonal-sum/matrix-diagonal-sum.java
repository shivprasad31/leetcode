class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            // primary diagonal
            sum += mat[i][i];

            // secondary diagonal
            sum += mat[i][n - 1 - i];

            // if same element counted twice (center of odd matrix)
            if(i == n - 1 - i){
                sum -= mat[i][i];
            }
        }
        return sum;
    }
}
