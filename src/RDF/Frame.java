package RDF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by 6377-00-285 on 15.07.2015.
 */
public class Frame {
        String str = null;
    public void fRame() {
        JFrame frame = new JFrame("Название проги...");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        final JTextField textField1 = new JTextField("Путь к файлам");
        textField1.setEnabled(false);
        final JTextField textField2 = new JTextField("Путь к резервной копии файлов");
        textField2.setEnabled(false);
        JButton button1 = new JButton("Путь к файлам");
        JButton button2 = new JButton("Путь к копии");
        JButton button3 = new JButton("Выполнить...");

        JTextField textField3 = new JTextField("Что искать...");
        JTextField textField4 = new JTextField("На что менять...");

        frame.add(textField1, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 7));

        frame.add(button1, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(textField2, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 7));

        frame.add(button2, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        frame.add(panel, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        panel.add(textField3, new GridBagConstraints(0, 0, 1, 1, 1, 1,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2, 2), 0, 7));
        panel.add(textField4, new GridBagConstraints(0, 1, 1, 1, 1, 1,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2, 2), 0, 7));
        panel.add(button3, new GridBagConstraints(1, 0, 1, 1, 1, 1,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2, 2), 0, 0));

        panel.setBackground(Color.GRAY);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton open = new JButton();
                JFileChooser fileChooser1 = new JFileChooser();
                fileChooser1.setCurrentDirectory(new File("C:\\Users\\6377-00-285\\Desktop\\Новая папка (2)"));
                fileChooser1.setDialogTitle("Путь к файлам...");
                fileChooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                if (fileChooser1.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {
                    str = fileChooser1.getSelectedFile().getAbsolutePath();
                }
                textField1.setText(str);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton open = new JButton();
                JFileChooser fileChooser2 = new JFileChooser();
                fileChooser2.setCurrentDirectory(new File("C:\\Users\\6377-00-285\\Desktop\\Новая папка (2)"));
                fileChooser2.setDialogTitle("Путь куда делать копию...");
                fileChooser2.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                if (fileChooser2.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {
                    str = fileChooser2.getSelectedFile().getAbsolutePath();
                }
                textField2.setText(str);
                System.out.println(textField1.getText());
            }

        });
        /*button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start start = new Start();
                start.start();
            }
        });*/

        frame.setVisible(true);
        frame.pack();
    }
}
