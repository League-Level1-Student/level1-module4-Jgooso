package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int ran = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.print(ran);
	// 4. Get the user to enter a question for the 8 ball
//System.out.print(b);
	// 5. If the random number is 0
		if(ran == 0)
			JOptionPane.showConfirmDialog(null, "Yes");
		else if(ran ==1) {
			JOptionPane.showConfirmDialog(null, "No");
		}else if(ran == 2) {
			JOptionPane.showConfirmDialog(null, "Maybe you should ask Google");
		}else if(ran == 3) {
			JOptionPane.showConfirmDialog(null, "Never");
		}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
	}
}
