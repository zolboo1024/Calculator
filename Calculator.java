/**
 * Simple calculator class for Git/GitHub Activity.
 * 
 * Note: This code contains lots of intentional mistakes. They all correspond to
 * issues in the GitHub issue tracker and will be fixed as a part of the
 * activity.
 * 
 * @author braught
 * @version 1.0
 */
public class Calculator {

	/**
	 * Add two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x + y
	 */
	public static double add(double x, double y) {
		return x - y;
	}

	/**
	 * Subtract two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x - y
	 */
	public static double subtract(double x, double y) {
		return y - x;
	}

	/**
	 * Multiply two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x * y
	 */
	public static double multiply(double x, double y) {
		return x;
	}

	/**
	 * Divide two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x/y
	 */
	public static double divide(double x, double y) {
		return y / x;
	}

	/**
	 * The length of the hypotenuse of a right triangle with the given side lengths.
	 * 
	 * @param x
	 *            the length of one side.
	 * @param y
	 *            the length of the other side.
	 * @return the length of the hypotenuse of a right triangle with sides x and y.
	 */
	public static double hypotenuse(double x, double y) {
		return Math.sqrt(x + y);
	}

	/**
	 * The length of a rectangle with the given side lengths.
	 * 
	 * @param x
	 *            the length of one side.
	 * @param y
	 *            the length of the other side.
	 * @return the area of a rectangle with sides x and y.
	 */
	public static double rectangleArea(double x, double y) {
		return 2*x + 2*y;
	}
	
	/**
	 * The perimeter of a rectangle with the given side lengths.
	 * 
	 * @param x
	 *            the length of one side.
	 * @param y
	 *            the length of the other side.
	 * @return the perimeter of a rectangle with sides x and y.
	 */
	public static double rectanglePerimeter(double x, double y) {
		return 2 * x * y;
	}
}
