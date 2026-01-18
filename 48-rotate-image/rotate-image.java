class Solution {
    public void rotate(int[][] matrix) {
        //first make the transpose of that matrix
        for(int row=0;row<matrix.length;row++){
            for(int col=row+1;col<matrix.length;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
        //reverse each row
        for(int row=0;row<matrix.length;row++){
            int r=0;
            int l=matrix.length-1;
            while(r<l){
                int temp=matrix[row][r];
                matrix[row][r]=matrix[row][l];
                matrix[row][l]=temp;
                r++;
                l--;
            }
        }
    }
}