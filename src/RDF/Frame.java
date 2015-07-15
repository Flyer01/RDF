package RDF;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 6377-00-285 on 15.07.2015.
 */
public class Frame {

    public void fRame() {
        JFrame frame = new JFrame("Название проги...");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        frame.setVisible(true);
    }
}
