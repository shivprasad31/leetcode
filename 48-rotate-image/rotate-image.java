class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        int i = 1;
        while (i < n) {
            int j = 0;
            while (j <= i) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
                j++;
            }
            i++;
        }

        for(int k=0;k<n;k++){
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=mat[k][start];
                mat[k][start]=mat[k][end];
                mat[k][end]=temp;
                start++;
                end--;
            }
        }
    }
}