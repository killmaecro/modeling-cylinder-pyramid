/**
 * Student Name: Joshua MacPherson
 * Lab Professor: Teddy Yap
 * Due Date: October 6th, 2024
 * Assessment: Assignment 01
 * Description: Program that, when given the height and radius of a cylinder,
 * calculates a cylinder pyramid's total volume.
 **/
import java.util.Scanner;
public class Main {

	// Main entry point to the program
	public static void main(String[] args) {

		// Creating a new pyramid object
		ModelingCylinder pyramid = new ModelingCylinder();

		Scanner reader = new Scanner(System.in);

		boolean satisfied = false;

		while (!satisfied) {
			// Ask user for the radius of the cylinder
			pyramid.setRadius(GetInput.getArgs("Enter the radius of the cylinder: "));
			System.out.println("You entered: " + pyramid.getRadius());

			// Ask user for the height of the cylinder
			pyramid.setHeight(GetInput.getArgs("Enter the height of the cylinder: "));
			System.out.println("You entered: " + pyramid.getHeight());

			System.out.println("Are you satisfied with these numbers? Type yes if so.");
			String answer = reader.next();

			if (answer.equalsIgnoreCase("yes")) {
				satisfied = true;
			}
		}

		reader.close();

		// Displaying result
		pyramid.displayResult();
	}
}
