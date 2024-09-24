// Importing Scanner from Java utilities
import java.util.Scanner;

/** Description: This class is to get the user input, and filter out any inputs that are not valid **/
public class GetInput {
	
	public static double getInput(String message) {

		// Create scanner
		Scanner reader = new Scanner(System.in);
		
		// Print message to console
		System.out.println(message);

		// As long as the input is not a double, this will run and ask you to enter a valid input
		while (!reader.hasNextDouble()) {
			System.out.println("Please enter a valid input.");

			// Tells the scanner to move on so it doesn't get stuck on the invalid input resulting in an infinite loop
			reader.next();
		}

		// If the input passes the loop's conditions, return the input
		return reader.nextDouble();
	}
}
