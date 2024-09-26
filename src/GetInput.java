// Importing Scanner from Java utilities
import java.util.Scanner;

/**
 * Description: This class is to get the user input
 */
public class GetInput {

	// Create scanner
	static Scanner reader = new Scanner(System.in);

	// Method to retrieve user input and filter out invalid inputs (strings)
	public static double getDouble(String message) {
		
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

	public static String isSatisfied(String message) {

		// Print message to console
		System.out.println(message);

		String input = reader.next();

		// As long as the input is not a double, this will run and ask you to enter a valid input
		while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
			System.out.println("Please enter yes or no.");
			input = reader.next();

		}

		return input;
	}
}
