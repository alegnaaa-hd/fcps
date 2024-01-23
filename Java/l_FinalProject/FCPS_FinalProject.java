// Angela Wang FCPS Final Project CTY Session 1

package Java.l_FinalProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // Needed for ActionListener

public class FCPS_FinalProject extends JFrame{
    
   //================================================== constructor
    
    private JTextField base_10 = new JTextField(8);
    private JTextField binaryValue = new JTextField(8);
    
    //================================================== constructor
    public FCPS_FinalProject() {
        // Create components
        JButton convertBtn = new JButton("Convert");
        convertBtn.addActionListener(new ConvertBtnListener());
        
        binaryValue.setEditable(false);

        // Create content panel, set layout
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        // Add the components to the content panel.
        content.add(new JLabel("Base 10"));
        content.add(base_10);              // Add input field
        content.add(convertBtn);               // Add button
        content.add(new JLabel("Binary"));
        content.add(binaryValue);            // Add output field

        // Set this window's attributes, and pack it.
        setContentPane(content);
        pack();                               // Layout components.
        setTitle("Binary Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);          // Center window.   
    }
    
    //============================================== end of constructor
    
    ////////////////////////////////////////////////// ConvertBtnListener
    
    class ConvertBtnListener implements ActionListener {  
        public void actionPerformed(ActionEvent e) {
            // Get the value from the base 10 textfield.
            String dyStr = base_10.getText();
            int base10Value = Integer.parseInt(dyStr);

            //======================================================
            
            int base_10Num = base10Value;
            int newNum;
            String binaryNum = "";
            
            while (base_10Num > 0){
            
            newNum = base_10Num % 2;
            base_10Num = base_10Num / 2;
            
            binaryNum = newNum + binaryNum;            
            } 
                        
            //======================================================
            
            // Convert to string and set binary textfield
            binaryValue.setText("" + binaryNum);
        }
    }
    
    //======================================================  main method
    
    public static void main(String[] args) {
        FCPS_FinalProject window = new FCPS_FinalProject();
        window.setVisible(true);
    }
}
