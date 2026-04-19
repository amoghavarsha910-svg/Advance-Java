/*Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
the concerned color whenever the specific tab is selected in the Pan.*/
package basic;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class p6 {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Tabbed Pane Color Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panels for each color tab
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Label to display selected color
        JLabel label = new JLabel("Select a tab", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Add change listener to detect tab selection
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();

                switch (index) {
                    case 0:
                        label.setText("RED tab selected");
                        label.setForeground(Color.RED);
                        break;
                    case 1:
                        label.setText("BLUE tab selected");
                        label.setForeground(Color.BLUE);
                        break;
                    case 2:
                        label.setText("GREEN tab selected");
                        label.setForeground(Color.GREEN);
                        break;
                }
            }
        });

        // Add components to frame
        frame.setLayout(new BorderLayout());
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        // Show frame
        frame.setVisible(true);
    }
}
