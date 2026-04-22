import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queen(board, 0);
    }

    public List<List<String>> queen(boolean[][] board, int row) {
        List<List<String>> ans = new ArrayList<>();

        if (row == board.length) {
            ans.add(display(board));
            return ans;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;

                ans.addAll(queen(board, row + 1));

                board[row][col] = false; // backtrack
            }
        }
        return ans;
    }

    public boolean isSafe(boolean[][] board, int row, int col) {
        // vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) return false;
        }

        // right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }

    public List<String> display(boolean[][] board) {
        List<String> result = new ArrayList<>();

        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }
            result.add(sb.toString());
        }
        return result;
    }
}