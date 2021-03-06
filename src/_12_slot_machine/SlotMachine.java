package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class SlotMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel left = new JLabel();
	JLabel right = new JLabel();
	JLabel middle = new JLabel();
	JButton button = new JButton();
	String imageL;
	String imageC;
	String imageO;
	public void go(){
		frame.add(panel);
		panel.add(button);
		frame.setSize(new Dimension(1000,700));
		panel.setLayout(null);
		button.setBounds(450,25,100,25);
		middle.setText("middle");
		
		button.addActionListener(this);
		frame.setVisible(true);
			//imageL = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.cooksillustrated.com%2Fhow_tos%2F11022-substituting-meyer-lemons&psig=AOvVaw1_Z2DrMxbnT9JipsCHL_GY&ust=1583691675623000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLjSwvH8iOgCFQAAAAAdAAAAABAD";
			//imageC = "https://www.google.com/url?sa=i&url=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fcherry&psig=AOvVaw3bA25isFsBzlKOIet8ds5M&ust=1583691649324000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNCs9uP8iOgCFQAAAAAdAAAAABAD";
			//imageO = "https://image.shutterstock.com/image-photo/ripe-orange-isolated-on-white-260nw-606022676.jpg";
			imageL = "lemon.jpeg";
			imageO = "orange.jpeg";
			imageC = "cherry.jpeg";
	}
	public void spin() throws MalformedURLException{
		int ranL = new Random().nextInt(3);
		int ranM = new Random().nextInt(3);
		int ranR = new Random().nextInt(3);
		panel.remove(right);
		panel.remove(left);
		panel.remove(middle);
		System.out.println(ranL + ", " + ranM + ", " + ranR);
			
		if(ranL == 0) {	
		left = createLabelImage(imageO);
		}else if(ranL == 1) {
			left = createLabelImage(imageC);
		}else if(ranL == 2) {
			left = createLabelImage(imageL);
		}
		
		if(ranM == 0) {
			middle = createLabelImage(imageO);
		}else if(ranM == 1) {
			middle = createLabelImage(imageC);
		}else if(ranM == 2) {
			middle = createLabelImage(imageL);
		}
		
		if(ranR == 0) {
			right = createLabelImage(imageO);
		}else if(ranR == 1) {
			right = createLabelImage(imageC);
		}else if(ranR == 2) {
			right = createLabelImage(imageL);
		}
		panel.add(right);
		panel.add(middle);
		panel.add(left);
		left.setBounds(25, 75, 300, 300);
		middle.setBounds(350, 75, 300, 300);
		right.setBounds(725, 75, 300, 300);
		if(ranL == ranM && ranM == ranR){
			JOptionPane.showConfirmDialog(null, "You win");
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
		try {
			spin();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
