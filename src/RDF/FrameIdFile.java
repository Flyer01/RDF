package RDF;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 6377-00-285 on 16.07.2015.
 */
public class FrameIdFile {
    public void frameIdFile() {
        JFrame frameOpenDialog = new JFrame();

        frameOpenDialog.setSize(500, 500);
        frameOpenDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameOpenDialog.setLocationRelativeTo(null);
        frameOpenDialog.setLayout(new GridBagLayout());

        JFileChooser fileChooser1 = new JFileChooser();

        frameOpenDialog.add(fileChooser1);

        frameOpenDialog.setVisible(true);
    }
}
