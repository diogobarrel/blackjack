package blackjack;

import javax.swing.*;

public class Main {
    /* For test */
    private static Board myBoard;
    /* For productions */
    private static GameBoard myGameBoard;

    public static void main(String[] Args) { // Main function

        myBoard = new Board();
        System.out.println(myBoard);

        myGameBoard = new GameBoard();
        myGameBoard.start();

    }
}