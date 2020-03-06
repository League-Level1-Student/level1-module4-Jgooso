package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton mult = new JButton();
	JButton sub = new JButton();
	JButton add = new JButton();
	JButton div = new JButton();
	JTextField atext = new JTextField();
	JTextField btext = new JTextField();
	public void run() {
		frame.add(panel);
		frame.setPreferredSize(new Dimension(650,300));
		//panel.setPreferredSize(new Dimension(900,500));
		panel.setLayout(null);
		div.setText("div");
		add.setText("add");
		sub.setText("sub");
		mult.setText("mult");
		panel.add(label);
		//atext.setSize(100, 100);
		//btext.setSize(100, 100);
		//atext.setLocation(100, 300);
		atext.setBounds(50, 125, 250, 25);
		btext.setBounds(350, 125, 250, 25);
		mult.setBounds(50, 50, 100, 25);
		add.setBounds(200, 50, 100, 25);
		sub.setBounds(350, 50, 100, 25);
		div.setBounds(500, 50, 100, 25);
		label.setBounds(300, 175, 50, 50);
		panel.add(atext);
		panel.add(btext);
		panel.add(mult);
		panel.add(add);
		panel.add(sub);
		panel.add(div);
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
			label.setText(String.valueOf(multiplication(a,b)));
		}else if(ButtonPressed == div) {
			label.setText(String.valueOf(division(a,b)));
		}else if(ButtonPressed == sub) {
			label.setText(String.valueOf(subtraction(a,b)));
		}else if(ButtonPressed == add) {
			label.setText(String.valueOf(addition(a,b)));
		}
		
	}
}
