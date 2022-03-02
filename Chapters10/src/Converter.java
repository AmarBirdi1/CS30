


// Converter application

import javax.swing.*;            
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame       
                       implements ActionListener, KeyPadClient 
{ 

    private JLabel prompt = new JLabel("Distance in miles: "); 
    private JTextField input = new JTextField(6);
    private JTextArea display = new JTextArea(1,25);
    private JButton convert = new JButton("Convert!");
    private KeyPad keypad;
  
  
    public Converter() 
	 {
	    getContentPane().setLayout(new BorderLayout());
	    keypad = new KeyPad(this);

	    JPanel inputPanel = new JPanel();        
	    inputPanel.add(prompt);
	    inputPanel.add(input);
	    getContentPane().add(inputPanel,"North");

	    JPanel controlPanel = new JPanel(new BorderLayout(0, 0));
	    controlPanel.add(keypad, "Center");
	    controlPanel.add(convert, "South");
	    getContentPane().add(controlPanel, "East");

	    getContentPane().add(display,"Center");  
	    display.setLineWrap(true);
	    display.setEditable(false);

	    convert.addActionListener(this);
	    input.addActionListener(this);
    } 
  
    
    public void actionPerformed(ActionEvent e) 
	 {
        double miles = Double.valueOf(input.getText()).doubleValue();
        double km =  miles / 0.62;
        km = Math.round(km * 100 + 0.5)/100.0;
        display.setText(miles + " miles equals " + km + " kilometers\n");
    }

   
    public void keypressCallback(String s) 
	 {
        if (s.equals("C"))
            input.setText("");
        else
            input.setText(input.getText() + s);
    }

   
    public static void main(String args[])
	 {
        Converter f = new Converter();
        f.setSize(400, 300);  
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {      
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    } 
} 

class KeyPad extends JPanel implements ActionListener
{
 
    private final static int NBUTTONS = 12;  
    private KeyPadClient kpc;      
    private JButton buttons[];
    private String labels[] =      // An array of button labels
            { "1","2","3",
              "4","5","6",
              "7","8","9",
              "C","0","." };

   
    public KeyPad(KeyPadClient kpc) 
    {
        this.kpc = kpc;
        setLayout(new GridLayout(4,3,1,1));        
        buttons = new JButton[NBUTTONS];          
        for(int k = 0; k < buttons.length; k++) 
	     {   buttons[k] = new JButton(labels[k]);   
            buttons[k].addActionListener(this);    
            add(buttons[k]);                       
        } // for
    }    

  
    public void actionPerformed(ActionEvent e) 
	 {
        String keylabel = ((JButton)e.getSource()).getText();
        kpc.keypressCallback(keylabel);
    }
}


abstract interface KeyPadClient
{
    public void keypressCallback(String s);
}
