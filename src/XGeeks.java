// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String Kaley = "invincibility";
	String Shiva = "invisibility";

		// 2. Ask the user to enter a name. Store their answer in a variable.
String Super = JOptionPane.showInputDialog("Please enter a name.");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (Super.equals("Kaley")){
JOptionPane.showMessageDialog( null, "Your super power is "+Kaley);

	}
else if (Super.equals("Shiva")){
JOptionPane.showMessageDialog( null, "Your super power is "+Shiva);
}
else JOptionPane.showMessageDialog( null, "I couldn't find name.");
}
}