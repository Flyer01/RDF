package RDF;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 6377-00-285 on 17.07.2015.
 */
public class FrameIdFileR {
    public void frameIdFileR() {
        JFrame frameOpenDialogR = new JFrame("Путь куда делать копию...");

        frameOpenDialogR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameOpenDialogR.setLocationRelativeTo(null);
        frameOpenDialogR.setLayout(new GridBagLayout());

        JFileChooser fileChooser2 = new JFileChooser();

        frameOpenDialogR.add(fileChooser2);

        frameOpenDialogR.setVisible(true);
        frameOpenDialogR.pack();
    }
}
