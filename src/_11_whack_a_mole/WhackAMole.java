package _11_whack_a_mole;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;



public class WhackAMole implements ActionListener{
	JFrame frame;
	JPanel panel;
	int score = 0;
	int missed = 0;
	public void go() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		drawButton(new Random().nextInt(24));
	
	}
	public void drawButton(int ran) {
	System.out.print(ran);
	int count  = 0;
	for(int y = 0; y < 8; y ++) {
		for(int x = 0; x < 3; x++) {
			JButton button;
			if(count == ran) {
				button = new JButton("Mole");
			}else {
				button = new JButton("" + x+y);
				button.setText("");
			}
			button.addActionListener(this);
			button.setBounds(x*125, y*50, 100, 25);
			
			count++;
			panel.add(button);
		}
	}
	
	
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		System.out.println(buttonPressed.getText());
		if(buttonPressed.getText().equals("Mole")) {
			frame.dispose();
			go();
			score++;
		}else {
			speak("You missed" + missed + "times");
			frame.dispose();
			go();
			missed++;
		}
		if(score==10) {
			endGame(new Date(), score);
		}else if(missed == 5) {
			endGame(new Date(), score);
		}
		
	}
}
