import java.io.IOException;

//Bieber Fever Challenge
public class BieberFeverChallenge {
	public BieberFeverChallenge() {
	}

	public static void main(String[] args) {
		// 1: Write a program that uses a for loop to print
		/*
		 * baby baby baby oh Code can only contain one “baby”, and one “oh”.
		 */
		for (int i = 0; i < 8; i++) {
			if (i == 3) {
				System.out.println("oh");
			} else if (i == 7) {
				System.out.println("no");
			} else
				System.out.println("baby");
			// 2: Every 2nd time the “oh” should be “no”

			// 3: Each chorus ends with “I thought you'd always be mine”.

			// 4: [Optional] Use the speak method from Stephen Hawking to speak the lyrics.

		}
		System.out.println("I thought you'd always be mine");
	}

}
