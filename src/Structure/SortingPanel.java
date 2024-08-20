package Structure;

import Utils.Constraints;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SortingPanel extends JPanel implements Constraints {

    private Random random;
    private int[] array;

    // Buttons
    private JButton start;
    private JButton reset;
    private JButton insertion;

    public SortingPanel() {
        random = new Random();
        array = new int[SIZE];
        this.setArray();
    }

    private void setArray() {
        for (int i = 0; i < this.array.length; i++) {
            int bar_height = FRAME_HEIGHT - HEADER_SIZE;
            this.array[i] = random.nextInt(bar_height);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        int bar_width = FRAME_WIDTH / SIZE;
        for (int i = 0; i < array.length; i++) {
            g.setColor(Color.yellow);
            g.drawRect(i * bar_width, FRAME_HEIGHT - array[i], bar_width, array[i]);
        }
    }
}
