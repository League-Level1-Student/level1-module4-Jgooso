package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener{
	char currentLetter; 
	//currentLetter = generateRandomLetter();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	Color red = new Color(250,1,1);
	Color green = new Color(0,250,0);
	
	public static void main(String[] args) {
	TypingTutor tut = new TypingTutor();
		tut.setup();
		
		//currentLetter = generateRandomLetter();
		
	}
	public void setup() {
		currentLetter = generateRandomLetter();
		frame.setVisible(true);
		frame.add(label);
		frame.addKeyListener(this);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(label.CENTER);
		label.setText(String.valueOf(currentLetter));
		frame.pack();
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		char charPressed = (char) e.getKeyCode();
		//System.out.print((char)(charPressed-32) + " " + currentLetter);
		if(Character.toLowerCase(charPressed) == currentLetter) {
			System.out.print("correct");
			frame.getContentPane().setBackground(Color.GREEN);
			//frame.getBackground();
		}else {
			frame.getContentPane().setBackground(Color.RED);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
		
		
	}	
}