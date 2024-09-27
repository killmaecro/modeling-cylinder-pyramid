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

		// Creating new scanner
		Scanner kbd = new Scanner(System.in);

		// Creating a new pyramid object
		ModelingPyramid pyramid = new ModelingPyramid();

			// Ask user for the radius of the cylinder
			System.out.println("Enter the radius of the cylinder: ");
			pyramid.setRadius(kbd.nextDouble());
			System.out.println("You entered: " + pyramid.getRadius());

			// Ask user for the height of the cylinder
			System.out.println("Enter the height of the cylinder: ");
			pyramid.setHeight(kbd.nextDouble());
			System.out.println("You entered: " + pyramid.getHeight());

		// Displaying result
		System.out.printf("The total volume of the cylinder pyramid is %.3f units cubed. \n%s"
				, pyramid.calculateVolume(), "Program by: Joshua MacPherson");
	}
}

