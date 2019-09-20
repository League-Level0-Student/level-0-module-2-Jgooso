package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
	public static void main(String[] args) {
	Random ran = new Random();
	int num = 0;
	for(int i = 0; i<5; i++) {
	num = ran.nextInt(100);
	JOptionPane.showConfirmDialog(null, num);
	}
	}
}
