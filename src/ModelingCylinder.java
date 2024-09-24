/** Description: This class takes care of all the calculations for the cylinder pyramid. */
public class ModelingCylinder {


	// This method is to extract the output from calculateOneCylinder and add up the volumes to return the final result to Main
    static double getPyramidVolume(double radius, double height) {

		double constant = .8;

		// Calculating base cylinder volume
		double volumeBottom = getCylinderVolume(radius, height);

		// 2nd cylinder radius is initial radius * .8
		double volumeMiddle = getCylinderVolume(radius * constant, height);

		// 3rd cylinder radius is initial radius * (.8 * .8) which is (.64)
		double volumeTop = getCylinderVolume(radius * constant * constant, height);

		// Returning the result to Main
		return volumeBottom + volumeMiddle + volumeTop;
	}

	/* Method that takes in radius and height arguments and puts them in the formula
	 * This method uses the cylinder volume formula from calculator.net
	 * Reference:
	 * Volume Calculator calculator.net
	 * https://www.calculator.net/volume-calculator.html (Accessed September 12, 2024) */
	private static double getCylinderVolume (double radius, double height) {

		// Return the result from the formula to the math method
		return height * Math.PI * Math.pow(radius, 2);
	}


}	