package Lection001;
import java.util.ArrayList;
import java.util.List;

public class nQueen {
    public static int count = 0;
    public static int[][] board;
    public static List<List<String>> ans = new ArrayList<>();
    public static void main(String[] args) {
        int n = 4;

        System.out.println(solveNQueens(n));
        System.out.println(count);
    }
    private static List<List<String>> solveNQueens(int n) {

        board = new int[n][n];
        backtrack(0);
        return ans;
    }
    private static void backtrack(int col) {
        if (col == board.length) {
            addBoard();
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (canPlace(row, col)) {
                board[row][col] = 1;
                backtrack(col + 1);
                board[row][col] = 0;

            }
        }
    }
    public static boolean canPlace(int i, int j) {

        // LEFT
        for (int col = j - 1; col >= 0; col--) {
            if (board[i][col] == 1) return false;
        }
        //UP DIAGON
        for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 1) return false;
        }
        //DOWN DIAGON
        for (int row = i + 1, col = j - 1; row < board.length && col >= 0; row++, col--) {
            if (board[row][col] == 1) return false;
        }
        return true;
    }
    private static void addBoard() {
        List<String> b = new ArrayList<>();
        for (int[] ints : board) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < board.length; j++) {
                sb.append(ints[j] == 0 ? "." : " Q");
            }
            b.add(sb.toString());
        }
        ans.add(b);
        count = count + 1;
    }
}
