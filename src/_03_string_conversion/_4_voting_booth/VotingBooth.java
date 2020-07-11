package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog(null, "How old are you?");
	
	int number = Integer.parseInt(age);
	
	if (number >= 18) {
		JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, kid. Nobody cares what you think!");
	}
}
}
