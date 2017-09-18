import javax.swing.*;


/* 	Uppgift 2.8
	David Persson
	2017-09-18
*/


public class uppgift8{
	public static void main(String[]args){
		String a;
		a = "Programspråk";
		String b;
		b = a.substring(4, 8) + a.charAt(5);
		JOptionPane.showMessageDialog(null, b);
	}

}