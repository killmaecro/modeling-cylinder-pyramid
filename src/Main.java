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

			// Ask user for the radius of the cylinder
			pyramid.setRadius(GetInput.getArgs("Enter the radius of the cylinder: "));
			System.out.println("You entered: " + pyramid.getRadius());

			// Ask user for the height of the cylinder
			pyramid.setHeight(GetInput.getArgs("Enter the height of the cylinder: "));
			System.out.println("You entered: " + pyramid.getHeight());

		// Displaying result
		pyramid.displayResult();
	}
}

