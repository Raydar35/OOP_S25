package week5;

import java.util.Random;

public class BattleshipBoard {
    public static void main(String[] args) {
        char[][] board = new char[5][5];

        // Step 1: Initialize the board with water (~)
        initializeBoard(board);

        // Step 2: Place four ships randomly
        placeShips(board, 4);

        // Step 3: Print the board (for debugging)
        printBoard(board);
    }

    /**
     * Initializes the board with water symbols ('~').
     * @param board The 2D board array
     */
    public static void initializeBoard(char[][] board) {
        // TODO: Use nested loops to set all cells to '~'
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                board[row][column] = '~';
            }
        }
    }

    /**
     * Places a given number of ships ('S') randomly on the board.
     * Ensures no two ships occupy the same position.
     * @param board The 2D board array
     * @param numShips The number of ships to place
     */
    public static void placeShips(char[][] board, int numShips) {
        Random rand = new Random();

        int shipsPlaced = 0;
        while (shipsPlaced < numShips) {
            int row = rand.nextInt(board.length);
            int col = rand.nextInt(board[0].length);

            // TODO: Check if the cell is empty ('~') before placing a ship ('S')
            // If empty, place the ship and increment shipsPlaced
            if (board[row][col] == '~') {
                board[row][col] = 'S';
                shipsPlaced++;
            }
        }
    }

    /**
     * Prints the board to the console.
     * @param board The 2D board array
     */
    public static void printBoard(char[][] board) {
        // print the heading row
        System.out.println("  0 1 2 3 4");

        //print the board start each row with the row number
        for (int row = 0; row < 5; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < 5; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}

