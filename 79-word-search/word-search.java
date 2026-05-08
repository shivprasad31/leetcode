class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(find(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean find(int row,int col,char[][] board,String target,int index){
        if(index==target.length()){
            return true;
        }

        if(row<0||col<0||row>=board.length||col>=board[0].length||board[row][col]!=target.charAt(index)){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='#';
        boolean found=find(row+1,col,board,target,index+1)||find(row,col+1,board,target,index+1)||find(row-1,col,board,target,index+1)||find(row,col-1,board,target,index+1);
        board[row][col]=temp;
        return found;

    }
}