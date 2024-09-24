// Importing Scanner from Java utilities
import java.util.Scanner;

/**
 * Description: This class is to get the user input
 */
public class GetInput {

	// Method to retrieve user input and filter out invalid inputs (strings)
	public static double getInput(String message) {

		// Create scanner
		Scanner reader = new Scanner(System.in);
		
		// Print message to console
		System.out.println(message);

		// As long as the input is not a double, this will run and ask you to enter a valid input
		while (!reader.hasNextDouble()) {
			System.out.println("Please enter a valid input.");

			// Get rid of input so it doesn't loop infinitely
			reader.next();
		}

		// If the input passes the loop's conditions, return the input
		return reader.nextDouble();
	}
}
