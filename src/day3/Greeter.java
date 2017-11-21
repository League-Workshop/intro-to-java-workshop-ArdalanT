package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
String peep= JOptionPane.showInputDialog("STATE YOUR NAME");
	 
	JOptionPane.showMessageDialog(null, "HEY "+ peep);
}
}
