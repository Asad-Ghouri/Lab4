package swingdemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingHelloWorld {
    public static void main(String[] args) {
        // Create the main JFrame window
        JFrame frame = new JFrame("Swing Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        frame.setSize(300, 200); // Set the window size

        // Create a JButton with the label "Click Me"
        JButton button = new JButton("Click Me");

        // Add an ActionListener to the button to handle clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a dialog box with the message "Hello, Swing!"
                JOptionPane.showMessageDialog(frame, "Hello, Swing!");
            }
        });

        // Add the button to the content pane of the frame
        frame.getContentPane().add(button);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
