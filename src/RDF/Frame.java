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

        JTextField textField1 = new JTextField("Путь к файлам");
        JTextField textField2 = new JTextField("Путь к резервной копии файлов");
        JButton button1 = new JButton("Путь к файлам");
        JButton button2 = new JButton("Путь к копии");

        textField1.setEnabled(false);
        frame.add(textField1, new GridBagConstraints(0, 0, 1, 1, 1, 1,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2, 2), 0, 6));

        frame.add(button1, new GridBagConstraints(1, 0, 1, 1, 1, 1,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(textField2, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 6));

        frame.add(button2, new GridBagConstraints(1, 1, 1, 1, 1, 1,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2, 2), 0, 0));
        frame.setVisible(true);
        frame.pack();
    }
}
