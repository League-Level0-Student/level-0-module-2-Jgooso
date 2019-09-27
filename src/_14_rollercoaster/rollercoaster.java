package _14_rollercoaster;
import javax.swing.JOptionPane;

public class rollercoaster {
	
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog(null, "Input you height");
		int nim = Integer.parseInt(quantity);
	if( nim < 48) {
		JOptionPane.showConfirmDialog(null, "You can ride the rollercoaster");
	}else {
		JOptionPane.showConfirmDialog(null, "You can't ride the rollercoaster");
	}
}
}

