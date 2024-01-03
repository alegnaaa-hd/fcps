package Java.i_GUIProject;

// File   : GUIexample.java
// Purpose: Use textfields and button to convert a number

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  // Needed for ActionListener

//////////////////////////////////////////////////////// class GUIexample
public class GUIexample extends JFrame {

    private JTextField _numOneTF = new JTextField(3);       
    private JTextField _newNumberTF   = new JTextField(3);

    //====================================================== constructor
    public GUIexample() {                                        
        // 1... Create/initialize components
        JButton convertBtn = new JButton("Convert");  
        convertBtn.addActionListener(new ConvertBtnListener()); 

        _newNumberTF.setEditable(false);

        // 2... Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        // 3... Add the components to the content panel.
        content.add(new JLabel("Original Number"));
        content.add(_numOneTF);              // Add input field
        content.add(convertBtn);               // Add button
        content.add(new JLabel("New Number"));
        content.add(_newNumberTF);            // Add output field

        // 4... Set this window's attributes, and pack it.
        setContentPane(content);
        pack();                               // Layout components.
        setTitle("Simple GUI example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window.   
    }
    //======= end of constructor. ** NOTE the close curly brace above!!! **

    ////////////////////////////////////////////////// ConvertBtnListener
    class ConvertBtnListener implements ActionListener {         
        public void actionPerformed(ActionEvent e) {
            //... Get the value from the numOne TEXT field, then convert to an int
            String dyStr = _numOneTF.getText();                
            int numberOne = Integer.parseInt(dyStr);              

            //... use this new variable in a calculation
            int newNumber = numberOne * 2; 
            
            //... Convert to string and put in newNumber textfield
            _newNumberTF.setText("" + newNumber);              
            
        }
    }

    //======================================================  main method
    public static void main(String[] args) {
        GUIexample window = new GUIexample();
        window.setVisible(true);
    }
}
