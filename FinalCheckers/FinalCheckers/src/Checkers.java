// Name: Hansel Doan
// Date: 07/31/2022
// Assignment: Checkers Finals
// Description: A checkers game that allows the user to play checkers against the computer. 
// The computer is not on expert mode, but must make legal moves.
// Uses a 2 dimensional array to display the board.
// All moves have to be legal moves.

import java.util.Scanner;

/**
 * This class is used to represent a checkers game. It contains the board, the
 * current player, and the number of moves.
 */
public class Checkers {

    /**
     * The board is a 8x8 array of strings. Each string represents a square on
     * the board. The first character of the string is the player who has a
     * piece on that square. The second character is the piece type. The third
     * character is the piece color. The fourth character is the piece
     * orientation. The fifth character is the piece status. The sixth character
     * is the piece type. The seventh character is the piece color. The eighth
     * character is the piece orientation. The ninth character is the piece
     * status. The tenth character is the piece type. The eleventh character is
     * the piece color. The twelfth character
     */
    static String[][] board = new String[8][8];

    static int player = 1; //1 for player1 and 2 for player2
    static int count = 0;
    static int p = 0;

    static class Move {

        int oldRow;
        int oldCol;
        int newRow;
        int newCol;

        Move(int oldRow, int oldCol, int newRow, int newCol) {
            this.oldRow = oldRow;
            this.oldCol = oldCol;
            this.newRow = newRow;
            this.newCol = newCol;
        }
    }

    /**
     * This function is the main function of the game. It will be called when
     * the game is started. It will print the board, and ask the player to make
     * a move. It will then check if the game is over. If not, it will call
     * itself again.
     *
     * @param args
     */
    public static void main(String[] args) {
        do {

            if (count == 0) {
                initBoard();
            }
            if (p == 0) {
                System.out.println("Player 1's turn");
            } else {
                System.out.println("Player 2's turn");
            }
            printBoard();
            makeMove();
            count++;
            p = (p + 1) % 2;

        } while (checkMoves());
    }

    /**
     * Initializes the board array with the correct pieces for the game.
     */
    static void initBoard() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = " ";
                } else {
                    if (i < 3) {
                        board[i][j] = "O";
                    } else if (i > 4) {
                        board[i][j] = "X";
                    } else {
                        board[i][j] = " ";
                    }
                }
            }
        }
    }

    /**
     * Prints the board to the console.
     */
    static void printBoard() {
        System.out.println("  0 1 2 3 4 5 6 7 ");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * This function will make a move for the computer player.
     *
     * @return the move that the computer player makes.
     */
    static void makeMove() {
        Move m = null;
        do {
            try {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter old row and column:");
                int oldRow = scan.nextInt();
                int oldCol = scan.nextInt();
                System.out.println("Enter new row and column:");
                int newRow = scan.nextInt();
                int newCol = scan.nextInt();
                m = new Move(oldRow, oldCol, newRow, newCol);
                /**
                 * This function is used to move the player's piece from one
                 * location to another. It will check if the move is valid, and
                 * if it is, it will update the board accordingly.
                 *
                 * @param oldRow the row of the piece to be moved
                 * @param oldCol the column of the piece to be moved
                 * @param newRow the row to move the piece to
                 * @param newCol the column to move the piece to
                 * @throws Exception if the move is invalid
                 */
                if (player == 1) {
                    if (!(board[oldRow][oldCol].equals("O") || board[oldRow][oldCol].equals("Q"))) {

                        throw new Exception("Invalid Move");
                    }
                    if (newRow - oldRow != 1 || Math.abs(newCol - oldCol) != 1) {

                        throw new Exception("Invalid Move");
                    }
                    if (board[newRow][newCol].equals(" ")) {
                        board[newRow][newCol] = "O";
                        board[oldRow][oldCol] = " ";
                    } else {
                        if (newRow - oldRow != 2 || Math.abs(newCol - oldCol) != 2) {

                            throw new Exception("Invalid Move");
                        }
                        if (board[(oldRow + newRow) / 2][(oldCol + newCol) / 2].equals("X")) {
                            board[(oldRow + newRow) / 2][(oldCol + newCol) / 2] = " ";
                        } else {

                            throw new Exception("Invalid Move");
                        }
                        board[newRow][newCol] = "O";
                        board[oldRow][oldCol] = " ";
                    }
                    /**
                     * This function will check if the move is valid.
                     *
                     * @param oldRow the row of the piece to be moved
                     * @param oldCol the column of the piece to be moved
                     * @param newRow the row to move the piece to
                     * @param newCol the column to move the piece to
                     * @throws Exception if the move is invalid
                     */
                } else {
                    if (!(board[oldRow][oldCol].equals("X") || board[oldRow][oldCol].equals("Q"))) {

                        throw new Exception("Invalid Move");
                    }
                    if (oldRow - newRow != 1 || Math.abs(newCol - oldCol) != 1) {

                        throw new Exception("Invalid Move");
                    }
                    if (board[newRow][newCol].equals(" ")) {
                        board[newRow][newCol] = "X";
                        board[oldRow][oldCol] = " ";
                    } else {
                        if (oldRow - newRow != 2 || Math.abs(newCol - oldCol) != 2) {

                            throw new Exception("Invalid Move");
                        }
                        if (board[(oldRow + newRow) / 2][(oldCol + newCol) / 2].equals("O")) {
                            board[(oldRow + newRow) / 2][(oldCol + newCol) / 2] = " ";
                        } else {

                            throw new Exception("Invalid Move");
                        }
                        board[newRow][newCol] = "X";
                        board[oldRow][oldCol] = " ";
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Enter a valid move");
            }
        } while (m == null);
    }

    /**
     * Checks if there is a move available for the player.
     *
     * @return whether there is a move available for the player.
     */
    static boolean checkMoves() {
        if (player == 1) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j].equals("O")) {
                        if (i < 6 && j > 1 && (board[i + 1][j - 1].equals(" ") || board[i + 1][j - 1].equals("*")) && board[i + 2][j - 2].equals("X")) {
                            return true;
                        }
                        if (i < 6 && j < 6 && (board[i + 1][j + 1].equals(" ") || board[i + 1][j + 1].equals("*")) && board[i + 2][j + 2].equals("X")) {
                            return true;
                        }
                        if (i > 1 && j > 1 && (board[i - 1][j - 1].equals(" ") || board[i - 1][j - 1].equals("*")) && board[i - 2][j - 2].equals("X")) {
                            return true;
                        }
                        if (i > 1 && j < 6 && (board[i - 1][j + 1].equals(" ") || board[i - 1][j + 1].equals("*")) && board[i - 2][j + 2].equals("X")) {
                            return true;
                        }
                    }
                }
            }
        } /**
         * Checks if the game is over.
         *
         * @return whether the game is over or not
         */
        else {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j].equals("X")) {
                        if (i < 6 && j > 1 && (board[i + 1][j - 1].equals(" ") || board[i + 1][j - 1].equals("*")) && board[i + 2][j - 2].equals("O")) {
                            return true;
                        }
                        if (i < 6 && j < 6 && (board[i + 1][j + 1].equals(" ") || board[i + 1][j + 1].equals("*")) && board[i + 2][j + 2].equals("O")) {
                            return true;
                        }
                        if (i > 1 && j > 1 && (board[i - 1][j - 1].equals(" ") || board[i - 1][j - 1].equals("*")) && board[i - 2][j - 2].equals("O")) {
                            return true;
                        }
                        if (i > 1 && j < 6 && (board[i - 1][j + 1].equals(" ") || board[i - 1][j + 1].equals("*")) && board[i - 2][j + 2].equals("O")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
