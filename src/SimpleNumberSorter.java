import javax.swing.JOptionPane;

public class SimpleNumberSorter {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Please input a number.");
		String answer = JOptionPane.showInputDialog("Please input a number.");
		String digit = JOptionPane.showInputDialog("Please input a number.");

		int num1 = Integer.parseInt(number);
		int num2 = Integer.parseInt(answer);
		int num3 = Integer.parseInt(digit);
		if (num1 < num2) {
			if (num1 < num3) {
				if (num2 < num3) {
					System.out.format("%d %d %d \n", num1, num2, num3);

				} else {
					System.out.format("%d %d %d \n", num1, num3, num2);
				}
			} else {
				System.out.format("%d %d %d \n", num3, num1, num2);
			}
		} else {

		}
	}

}
