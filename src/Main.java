/**
 * Student Name: Joshua MacPherson
 * Lab Professor: Teddy Yap
 * Due Date: October 6th, 2024
 * Assessment: Assignment 01
 * Description: Program that, when given the height and radius of a cylinder,
 * calculates a cylinder pyramid's total volume.
 **/
public class Main {

	// Main entry point to the program
	public static void main(String[] args) {

		// Creating a new pyramid object
		ModelingCylinder pyramid = new ModelingCylinder();

		// Boolean to break out of the loop
		boolean satisfied = false;

		// Loop to catch errors and allow user to make changes in case they make a typo
		while (!satisfied) {

			// Ask user for the radius of the cylinder
			pyramid.setRadius(GetInput.getDouble("Enter the radius of the cylinder: "));
			System.out.println("You entered: " + pyramid.getRadius());

			// Ask user for the height of the cylinder
			pyramid.setHeight(GetInput.getDouble("Enter the height of the cylinder: "));
			System.out.println("You entered: " + pyramid.getHeight());

			// Storing the answer and converting it to lowercase so any capitalization of yes works
			String answer = GetInput.isSatisfied("Are you satisfied with these numbers? (yes/no)").toLowerCase();

			if (answer.equals("yes")) {
				satisfied = true;
			}
		}
		// Displaying result
		pyramid.displayResult();
	}
}
