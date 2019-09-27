package _15_voting_booth;
import javax.swing.JOptionPane;

public class voitingBooth {
	public static void main(String arg[]) {
		String quantity = JOptionPane.showInputDialog(null, "Input you age");
		int nim = Integer.parseInt(quantity);
		if ( nim >= 18) {
			JOptionPane.showConfirmDialog(null, "You can vote");
		}else {
			JOptionPane.showConfirmDialog(null, "No one cares what you think");
		}
	}
}
