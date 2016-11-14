
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		int r = new Random().nextInt(4);

		// 3. Print out this variable
		System.out.println(r);

		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Please enter a question for the Magic 8 Ball.");

		// 5. If the random number is 0
if (r==0) {
	JOptionPane.showMessageDialog(null, "Yes.");
}
		// -- tell the user "Yes"

		// 6. If the random number is 1
else if (r==1) {
	JOptionPane.showMessageDialog(null, "No.");
}

		// -- tell the user "No"

		// 7. If the random number is 2
else if (r==2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
else if (r==3) {
	JOptionPane.showMessageDialog(null, "Maybe you should go eat a caramel cupcake.");
}

		// -- write your own answer

else if (r==4) {
	JOptionPane.showMessageDialog(null, "Sorry, this is not a valid answer.");
}

else if (r==5) {
	JOptionPane.showMessageDialog(null, "Maybe you should go eat a cream-filled donut.");
}

else if (r==6) {
	JOptionPane.showMessageDialog(null, "Maybe you should go eat an egg burrito.");
}

else if (r==7) {
	JOptionPane.showMessageDialog(null, "Maybe you should go eat a cinnamon, pumpkin cupcake");
}
	}
}
