import java.util.Scanner;

public class tictactoe {
    
    public static void main(String[] args) {
        // creating a 3x3 board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        // printing the initial board
        printBoard(board);

        // starting the game
        playGame(board);
    }

    private static void printBoard(char[][] board) {
        System.out.println("Current board:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print("|" + cell);
            }
            System.out.println("|");
        }
    }

    private static void playGame(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameWon = false;

        for (int turn = 0; turn < 9; turn++) {
            System.out.println("Player " + currentPlayer + ", enter your move (row: 1, 2, or 3):");
            int row1 = scanner.nextInt();
            int row = row1 - 1; // adjusting for 0-based index
            System.out.println("Player " + currentPlayer + ", enter your move (column: 1, 2, or 3):");
            int col1 = scanner.nextInt();
            int col = col1 - 1; // adjusting for 0-based index

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                turn--; // retry the turn
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard(board);

            if (checkWinner(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }

    private static boolean checkWinner(char[][] board, char player) {
        // checking rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // checking diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}
