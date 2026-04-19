package basic;

//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
//depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
//mechanism with addActionListener( ).
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p2 extends JFrame implements ActionListener {

  JLabel label;
  JButton btnIndia, btnSrilanka;

  public p2() {

      // Frame settings
      setTitle("Country Button Demo");
      setSize(400, 200);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create buttons
      btnIndia = new JButton("India");
      btnSrilanka = new JButton("Srilanka");

      // Create label
      label = new JLabel("Press a button");

      // Add ActionListener
      btnIndia.addActionListener(this);
      btnSrilanka.addActionListener(this);

      // Add components
      add(btnIndia);
      add(btnSrilanka);
      add(label);

      // Make visible
      setVisible(true);
  }

  // Event handling
  public void actionPerformed(ActionEvent e) {

      if (e.getSource() == btnIndia) {
          label.setText("India is pressed");
      } else if (e.getSource() == btnSrilanka) {
          label.setText("Srilanka is pressed");
      }
  }

  public static void main(String[] args) {
      new p2();
  }
}

