package Structure;

import Utils.Constraints;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class SortingPanel extends JPanel implements Constraints {

    private Random random;
    private float[] array;

    // Buttons
    private JButton start;
    private JButton reset;
    private JButton insertion;

    public SortingPanel() {
        random = new Random();
        array = new float[SIZE];
        this.setArray();
    }

    private void setArray() {
        for (int i = 0; i < this.array.length; i++) {
            // bar height - height of buttons that will be added at top of panel because we do not want bars to overlap buttons.
            float bar_height = FRAME_HEIGHT - HEADER_SIZE;
            this.array[i] = random.nextFloat(bar_height);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Casting Graphics g to Graphics2d -
        // because I was facing a bug when increasing the size of array all bars were not fitting complete fitting in panel
        // because HEIGHT and WIDTH were int value and when i was dividing WIDTH with SIZE to get bar_width it was converting float to int
        // which was leaving some space at end
        Graphics2D g2d = (Graphics2D) g;
        this.setBackground(Color.BLACK);
        // width of each bar
        float bar_width = (float) FRAME_WIDTH / SIZE;
        Rectangle2D.Float rect;
        for (int i = 0; i < array.length; i++) {g2d.setColor(Color.yellow);
            rect =new Rectangle2D.Float(i*bar_width,FRAME_HEIGHT-array[i],bar_width,array[i]);
            g2d.draw(rect);
        }
    }
}
