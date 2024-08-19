package Structure;

import Utils.Constraints;

import javax.swing.*;

public class VisualizerFrame extends JFrame implements Constraints {
    private SortingPanel myPanel = new SortingPanel();

    public VisualizerFrame() {
        setTitle(TITLE);
        add(myPanel);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
