package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {
public static void main(String[] args) {
	Random ran = new Random();
	int number1 = ran.nextInt(101) + 100;
	Random r = new Random();
	int number2 = r.nextInt(101) + 100;
	Random a = new Random();
	int number3 = a.nextInt(101) + 100;
	Random n = new Random();
	int number4 = n.nextInt(101) + 100;
	Random s = new Random();
	int number5 = s.nextInt(101) + 100;
	Random e = new Random();
	int number6 = e.nextInt(101) + 100;
	JOptionPane.showMessageDialog(null, number1 + "   " + number2 + "   " + number3 + "   " + number4 + "   " + number5 + "   " + number6);;
}
}
