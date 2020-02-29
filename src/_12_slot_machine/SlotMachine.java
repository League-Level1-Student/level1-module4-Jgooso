package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class SlotMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel left;
	JLabel right;
	JLabel middle;
	JButton button = new JButton();
	String imageL;
	String imageM;
	String imageR;
	public void go() {
		frame.add(panel);
		panel.add(left);
		panel.add(right);
		panel.add(middle);
		left = createLabelImage("cherry.jpeg");
		middle = createLabelImage("lemon.jpeg");
		right = createLabelImage("orange.jpeg");
	}
	public void spin() {
		int ranL = new Random().nextInt(2);
		int ranM = new Random().nextInt(2);
		int ranR = new Random().nextInt(2);
		if(ranL == 0) {
			imageL = "cherry.jpeg";
		}
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}
