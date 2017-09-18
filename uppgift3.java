import javax.swing.*;

/*	övning 2.3
	David Persson
	2017-09-18
*/


public class uppgift3 {
	public static void main(String[]args) {
		String name = JOptionPane.showInputDialog(null, "What is name?");
		String surname = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, name);
		JOptionPane.showMessageDialog(null, surname);
		JOptionPane.showMessageDialog(null, "Hello" + " " + name + " " + surname);

			
		
	}
}