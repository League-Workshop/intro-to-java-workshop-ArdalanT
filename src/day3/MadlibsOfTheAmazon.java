package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "IF YOU FIND YOURSELF CROSSING A PRIANHA INFESTED RIVER IN THE AMAZON. BE CAREFUL AND I'LL SHOW YOU HOW TO DO IT.");
		// Get the user to enter an adjective
String adj= JOptionPane.showInputDialog("ENTER AN ADJECTIVE PLS");
		// Get the user to enter a type of liquid
String liquid= JOptionPane.showInputDialog("ENTER A LIQUID PLS");
		// Get the user to enter a body part
String body= JOptionPane.showInputDialog("ENTER A BODY PART");
		// Get the user to enter a verb
String v= JOptionPane.showInputDialog("ENTER A VERB");
		// Get the user to enter a place
String place= JOptionPane.showInputDialog("ENTER A PLACE POR FAVORE");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "PIRANHAS ARE MORE " + adj 
				+ " DURING THE DAY, SO CROSS THE RIVER AT NIGHT. PIRANHAS ARE ATTRACTED TO FRESH \n" + liquid + " AND WILL MOST LIKELY TAKE A BITE OUT OF YOUR " +
		 body + " IF YOU\n " + v + " WHATEVER YOU DO, IF YOU HAVE AN OPEN WOUND, TRY TO FIND ANOTHER WAY TO GET BACK TO THE \n" + place + " GOOD LUCK!!!!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

