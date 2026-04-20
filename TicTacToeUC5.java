public class TicTacToeUC5 {

    public static boolean isValidMove(char[][] board, int row, int col) {

    
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Move out of bounds!");
            return false;
        }

        
        if (board[row][col] != '-') {
            System.out.println("Cell already occupied!");
            return false;
        }

        
        return true;
    }

    public static void main(String[] args) {

    
        char[][] board = {
            {'-', '-', '-'},
            {'-', 'X', '-'},
            {'-', '-', '-'}
        };

        
        int row = 1;
        int col = 1;

        
        if (isValidMove(board, row, col)) {
            System.out.println("Move is valid.");
        } 
        else {
            System.out.println("Move is invalid.");
        }
    }
}

