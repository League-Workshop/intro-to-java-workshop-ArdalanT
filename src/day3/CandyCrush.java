package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String crush= JOptionPane.showInputDialog("WHO DO U LIKE? ;)");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "oh... I've heard that "+ crush + " is a meanie");
		// 3. Ask the user for the name of their best friend
String bff= JOptionPane.showInputDialog("anyway, who's ur BFF");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, "AYYYY!!!! I know " +bff + ", we gucci");
	} 
}



