/**
 * Description: This class takes care of all the calculations for the cylinder pyramid.
 */
public class ModelingCylinder {

	/*
	 * Method that takes in radius and height arguments and does the calculations
	 * This method uses the cylinder volume formula from calculator.net
	 * Reference:
	 * Volume Calculator calculator.net
	 * https://www.calculator.net/volume-calculator.html (Accessed September 12, 2024)
	 */
	static double getPyramidVolume(double radius, double height) {

		double constant = .8;

		// Calculating base cylinder volume
		double volume = height * Math.PI * Math.pow(radius, 2);

		// 2nd cylinder radius is initial radius * .8
		volume += height * Math.PI * Math.pow(radius * constant, 2);

		// 3rd cylinder radius is initial radius * (.8 * .8) which is (.64)
		volume += height * Math.PI * Math.pow(radius * constant * constant, 2);

		// Returning the result to Main
		return volume;
	}
}	