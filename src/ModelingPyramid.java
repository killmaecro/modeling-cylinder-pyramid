/**
 * Description: This class takes care of all the calculations for the cylinder pyramid.
 */
public class ModelingPyramid {

	private double radius;
	private double height;

	// Constructor method
	public ModelingPyramid() {

	}

	// Getter method for radius
	public double getRadius() {
		return radius;
	}

	// Setter method for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Getter method for height
	public double getHeight() {
		return height;
	}

	// Setter method for height
	public void setHeight(double height) {
		this.height = height;
	}

	/*
	 * Method that takes in radius and height arguments and does the calculations
	 * This method uses the cylinder volume formula from calculator.net
	 * Reference:
	 * Volume Calculator calculator.net
	 * https://www.calculator.net/volume-calculator.html (Accessed September 12, 2024)
	 */
	public double calculateVolume() {
		double volume = height * Math.pow(radius, 2) * Math.PI;
		volume += height * Math.pow(radius * .8, 2) * Math.PI;
		volume += height * Math.pow(radius * .64, 2) * Math.PI;
		return volume;
	}

}