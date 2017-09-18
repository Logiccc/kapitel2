import javax.swing.*;
/*	Uppgift 2.9
	David Persson
	2017-09-18
*/

public class uppgift9{
	public static void main(String[]args){
		String a = " Erik Andersson 860314-2714  ";
/*	
	a = a.trim();// får värdet Erik Andersson 860314-2714
	int i = a.lastIndexOf(' ') + 1; // 14 + 1
	int j = a.indexOf('-'); // 21
	String b = a.substring(i, j); // värdet "860314"
	JOptionPane.showMessageDialog(null, b);
*/	
	a = a.trim();// får värdet Erik Andersson 860314-2714
	int i = a.lastIndexOf(' ') + 1; // 14 + 1
	int j = a.indexOf('-'); 
	String b = a.substring(19, 21); 
	String c = a.substring(17, 19);
	String d = b + "/" + c;
	JOptionPane.showMessageDialog(null, d);

	}
}