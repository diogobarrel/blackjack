package blackjack;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    private static final int DEFAULT_WIDTH = 1366;
    private static final int DEFAULT_HEIGHT = 768;

    public GamePanel() {
        super(); // good pratices ?
        // dimension
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setVisible(true);
        this.setBackground(Color.DARK_GRAY);

    }
}