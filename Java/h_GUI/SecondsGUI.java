package Java.h_GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // Needed for ActionListener

////////////////////////////////////////////////////////////////////////

public class SecondsGUI extends JFrame {
    
    //================================================== constructor
    private JTextField _hours = new JTextField(10);
    private JTextField _seconds = new JTextField(10);
    
    //================================================== constructor
    public SecondsGUI() {
        // Create components
        JButton convertBtn = new JButton("Convert");
        convertBtn.addActionListener(new ConvertBtnListener());
        
        _seconds.setEditable(false);

        // Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        // Add the components to the content panel.
        content.add(new JLabel("Hours"));
        content.add(_hours);              // Add input field
        content.add(convertBtn);               // Add button
        content.add(new JLabel("Seconds"));
        content.add(_seconds);            // Add output field

        // Set this window's attributes, and pack it.
        setContentPane(content);
        pack();                               // Layout components.
        setTitle("Seconds Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window.   
    }
    //============================================== end of constructor
    
    ////////////////////////////////////////////////// ConvertBtnListener
    class ConvertBtnListener implements ActionListener {  
        public void actionPerformed(ActionEvent e) {
            // Get the value from the hours textfield.
            String dyStr = _hours.getText();
            int amthours = Integer.parseInt(dyStr);

            // Convert it - each hours equals 3600 seconds
            int amtseconds = amthours * 3600;

            // Convert to string and set seconds textfield
            _seconds.setText("" + amtseconds);
        }
    }
    
    //======================================================  main method
    public static void main(String[] args) {
        SecondsGUI window = new SecondsGUI();
        window.setVisible(true);
    }
}
