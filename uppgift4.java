import javax.swing.*;

/* 	Char övning
	David Persson
	2017-09-18
*/
public class uppgift4 {
	public static void main(String[]args) {

		char c1, c2, c3;
		c1 = '\u00D8';
		c2 = '\u00F8';
		c3 = '\u03c0';
		String tot = "";
		tot = tot+" "+c1+" "+c2+" "+c3;
			JOptionPane.showMessageDialog(null, tot);
	}
}