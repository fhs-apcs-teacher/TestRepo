import java.util.Arrays;

public class Revised8QueenPuzzle {

    public boolean solveNQueenPuzzle(int boardSize) {
        String[][] board = new String[boardSize][boardSize];
        int[] positions = new int[boardSize];
        boolean hasSolution = solve(boardSize, positions);
        if (hasSolution) {
            int col = 0;
            for (int row = 0; row < boardSize; row++) {
                Arrays.fill(board[row], "* ");
                col = positions[row];
                board[row][col] = "Q ";
            }
            printBoard(board);
            return true;
        }

        return false;
    }

    private boolean solve(int boardSize, int[] positions) {
        boolean foundSafe = true;
        int row = 0, col = 0;
        while (row < boardSize) {
            for (; col < boardSize; col++) {
                foundSafe = true;

                for (int queen = 0; queen < row; queen++) {
                    if (positions[queen] == col ||
                            queen - positions[queen] == row - col
                            || queen + positions[queen] == row + col) {
                        foundSafe = false;
                        break;
                    }
                }
                if (foundSafe) {
                    positions[row] = col;
                    break;
                }
            }
            if (foundSafe) {
                row++;
                col = 0;
            } else {
                row--;
                if (row < 0) {
                    return false;
                }
                if (row == 0) {
                    for (int i = 1; i < boardSize; i++)
                        positions[i] = 0;
                }
                col = positions[row] + 1;
            }
        }
        return true;

    }

    public void printBoard(String[][] board) {
        int boardSize = board[0].length;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int boardSize = 8;
        Revised8QueenPuzzle puzzleInstance = new Revised8QueenPuzzle();
        boolean status = puzzleInstance.solveNQueenPuzzle(boardSize);
        if (!status) {
            System.out.println("No solution exists.");
        }
    }
}

