/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
whenever the countries are selected on the list.*/
package basic;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class p1 {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Country List Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Country data
        String[] countries = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        // Create JList
        JList<String> countryList = new JList<>(countries);

        // Allow single selection (optional)
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add listener to detect selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                // Avoid duplicate events
                if (!e.getValueIsAdjusting()) {

                    String selectedCountry = countryList.getSelectedValue();

                    if (selectedCountry != null) {
                        System.out.println("Selected Country: " + selectedCountry);
                    }
                }
            }
        });

        // Add list inside scroll pane
        frame.add(new JScrollPane(countryList), BorderLayout.CENTER);

        // Show frame
        frame.setVisible(true);
    }
}
