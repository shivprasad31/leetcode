class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                boolean isMax=isMaxInCol(matrix,i,j);
                boolean isMin=isMinInRow(matrix,i,j);
                if(isMax&&isMin){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
        
    }
    public boolean isMaxInCol(int[][] mat,int row,int col){
        int number=mat[row][col];
        int max=mat[0][col];
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
            }
        }
        return number==max;
    }
    public boolean isMinInRow(int[][] mat,int row,int col){
        int number=mat[row][col];
        int min=mat[row][0];
        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]<min){
                min=mat[row][i];
            }
        }
        return number==min;
    }
    
}