package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mult = new JButton();
	JButton sub = new JButton();
	JButton add = new JButton();
	JButton div = new JButton();
	JTextField atext = new JTextField();
	JTextField btext = new JTextField();
	public void run() {
		frame.add(panel);
		frame.add(mult);
		frame.add(add);
		frame.add(sub);
		frame.add(div);
		//frame.add(atext);
		//frame.add(btext);
		//atext.setSize(100, 50);
		//btext.setSize(100, 50);
		atext.setBounds(100, 50, 250, 50);
		btext.setBounds(300, 50, 250, 50);
		mult.setBounds(100, 150, 100, 50);
		add.setBounds(250, 150, 100, 50);
		sub.setBounds(400, 150, 100, 50);
		div.setBounds(550, 150, 100, 50);
		frame.setVisible(true);
		frame.pack();
		mult.addActionListener(this);
		div.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
	}
	public int addition(int a, int b) {
		return a+b;
	}
	public int multiplication(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	public int subtraction(int a, int b) {
		return a-b;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(atext.getText());
		int b = Integer.parseInt(btext.getText());
		JButton ButtonPressed = (JButton)e.getSource();
		if(ButtonPressed == mult) {
			multiplication(a,b);
		}else if(ButtonPressed == div) {
			division(a,b);
		}else if(ButtonPressed == sub) {
			subtraction(a,b);
		}else if(ButtonPressed == add) {
			addition(a,b);
		}
		
	}
}
