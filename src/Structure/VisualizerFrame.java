package Structure;

import Utils.Constraints;

import javax.swing.*;
import java.awt.*;

public class VisualizerFrame extends JFrame implements Constraints {
    private SortingPanel myPanel = new SortingPanel();

    public VisualizerFrame() {
        setTitle(TITLE);
        setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        add(myPanel);
        pack();//This will force the frame to adjust to the preferred sizes of its components.
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
