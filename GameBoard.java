package blackjack;

import javax.swing.*;

public class GameBoard extends JFrame {
    /* Draws the shapes */
    private GamePanel myGamePanel;

    public GameBoard() {
        super("BlackJack! - github.com/diogobarrel"); // Recomendado como boas práticas
        myGamePanel = new GamePanel();
    }

    public void start() {
        setVisible(true);
        buildGUI();

    }

    private void buildGUI() {
        /*
         * JPanel masterPanel = new JPanel(); masterPanel.add(myGamePanel);
         */
        // add(masterPanel);
        add(myGamePanel);
        pack(); // pack "resizes" the panel so things fit in it
    }

}