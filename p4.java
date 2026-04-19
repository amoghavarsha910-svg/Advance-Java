/*Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
package basic;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class p4 {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("CMY Tabbed Pane Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panels for each tab
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Add tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // Label to show selected color
        JLabel label = new JLabel("Select a tab", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Change listener for tab selection
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();

                switch (index) {
                    case 0:
                        label.setText("CYAN tab selected");
                        label.setForeground(Color.CYAN);
                        cyanPanel.setBackground(Color.CYAN);
                        break;

                    case 1:
                        label.setText("MAGENTA tab selected");
                        label.setForeground(Color.MAGENTA);
                        magentaPanel.setBackground(Color.MAGENTA);
                        break;

                    case 2:
                        label.setText("YELLOW tab selected");
                        label.setForeground(Color.YELLOW);
                        yellowPanel.setBackground(Color.YELLOW);
                        break;
                }
            }
        });

        // Layout setup
        frame.setLayout(new BorderLayout());
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        // Show frame
        frame.setVisible(true);
    }
}
