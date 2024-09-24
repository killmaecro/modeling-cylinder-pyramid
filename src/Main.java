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
		
		// Ask user for the radius of the cylinder
		double radius = GetInput.getInput("Please enter the radius of the base cylinder.");
		
		// Ask user for the height of the cylinder
		double height = GetInput.getInput("Please enter the height of the base cylinder.");

		// Creating a variable that stores the output from ModelingCylinder
		double volume = ModelingCylinder.getPyramidVolume(radius, height);
		
		// Printing the total volume and my name to the console
		System.out.printf("The total volume of the cylinder pyramid is %.3f units cubed. \n%s", volume,
				"Program by: Joshua MacPherson");
	}
}
