package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton joke = new JButton();
	JButton punchline = new JButton();
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}
	public void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JOptionPane.showConfirmDialog(null, "Make buttons");
		frame.add(panel);
		panel.add(joke);
		joke.setText("joke");
		punchline.setText("punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		panel.add(punchline);
		frame.setVisible(true);
		//return new JButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "hi");
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(joke)) {
			JOptionPane.showConfirmDialog(null, "What do you call a cow in an earthquake");
		}else if(buttonPressed.equals(punchline)) {
			JOptionPane.showConfirmDialog(null, "A milkshake");
		}
		
	}
}
