



// Modify the BreakAPlate application to display a picture of the prize won rather than text naming the prize. 
//The tiger_plush.gif, sticker.gif, and 
// placeholder.gif are supplied as data files for this text. The placeholder.gif file should be displayed in the label and at the start 
// of each game.


import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;  
 
public class BreakAPlate implements ActionListener {
	String FIRST_PRIZE = "tiger plush";
	String CONSOLATION_PRIZE = "sticker";
	JFrame frame;
	JPanel contentPane;
	JButton play;
 	JLabel plates, prizeWon;
 	GameBooth BreakAPlate;
	private AbstractButton label;
 	
 	public BreakAPlate(){
 		
 		GameBooth b = BreakAPlate = new GameBooth(0, FIRST_PRIZE, CONSOLATION_PRIZE);
 
	
		
 	frame = new JFrame("BreakAPlate");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 		
 		contentPane = new JPanel();
 	contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
 		contentPane.setBackground(Color.white);
 	contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
       
 
 		plates = new JLabel(new ImageIcon("../Chapters10/images/plates2.gif"));
 	
 	
 		plates.setAlignmentX(JLabel.CENTER_ALIGNMENT);
 		plates.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
 	contentPane.add(plates);
     
 		
		play = new JButton("Play");
 	play.setActionCommand("Play");
 	play.setAlignmentX(JButton.CENTER_ALIGNMENT);
		play.addActionListener(this);
 		contentPane.add(play);
     
 	
 		prizeWon = new JLabel(" ");
 	
	prizeWon.setAlignmentX(JLabel.CENTER_ALIGNMENT);
	prizeWon.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));	
		contentPane.add(prizeWon);
 
 		frame.setContentPane(contentPane);
 		
 		
 	

 		
		frame.pack();
 	frame.setVisible(true);
     }
    
    
 	
    public void actionPerformed(ActionEvent event) {
     	String eventName = event.getActionCommand();
     	String prize;
   	
    	if (eventName == "Play") {
 		prize = BreakAPlate.start();
 		if (prize.equals(FIRST_PRIZE)) {
 			
			plates.setIcon(new ImageIcon("../Chapters10/images/plates_all_broken.gif"));
			} else if (prize.equals(CONSOLATION_PRIZE)) {
 				plates.setIcon(new ImageIcon("../Chapters10/images/plates_two_broken.gif"));
		}
 		prizeWon.setText("You win: " + prize);
 		
 		plates.setIcon(new ImageIcon("../Chapters10/images/sticker.gif"));
			play.setText("Play Again");
			
			play.setActionCommand("Play Again");
		
 	} else if (eventName == "Play Again") {
 			plates.setIcon(new ImageIcon("plates2.gif"));
		prizeWon.setText("you win: tiger ");
		plates.setIcon(new ImageIcon("../Chapters10/images/tiger_plush.gif"));
 		play.setText("Play");
 	
		play.setActionCommand("Play");
	
 	}
     }


    
     private static void runGUI() {
         JFrame.setDefaultLookAndFeelDecorated(true);

        BreakAPlate carnivalGame = new BreakAPlate();
     }
    

    public static void main(String[] args) {
      
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
                runGUI();
           }
        });
   }
}