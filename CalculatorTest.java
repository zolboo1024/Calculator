import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for the Calclator class.
 * 
 * Note: This code contains lots of intentional mistakes. They all correspond to
 * issues in the GitHub issue tracker and will be fixed as a part of the
 * activity.
 * 
 * @author braught
 * @version 1.0
 */
public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals("Incorrect addition", 5.0, Calculator.add(2.0, 3.0), 0.01);
		assertEquals("Incorrect addition", 4.0, Calculator.add(3.0, 2.0), 0.01);
		assertEquals("Incorrect addition", 3.0, Calculator.add(0.0, 3.0), 0.01);
		assertEquals("Incorrect addition", 3.0, Calculator.add(3.0, 0.0), 0.01);
	}
	
	@Test
	public void testSubtract() {
		assertEquals("Incorrect subtraction", 1.0, Calculator.subtract(2.0, 3.0), 0.01);
		assertEquals("Incorrect subtraction", -1.0, Calculator.subtract(3.0, 2.0), 0.01);
		assertEquals("Incorrect subtraction", -3.0, Calculator.subtract(0.0, 3.0), 0.01);
		assertEquals("Incorrect subtraction", 3.0, Calculator.subtract(3.0, 0.0), 0.01);
	}

	@Test
	public void testMultiply() {
		assertEquals("Incorrect multiplication", 6.0, Calculator.multiply(2.0, 3.0), 0.01);
		assertEquals("Incorrect multiplication", 6.0, Calculator.multiply(3.0, 2.0), 0.01);
		assertEquals("Incorrect multiplication", 0.0, Calculator.multiply(0.0, 3.0), 0.01);
		assertEquals("Incorrect multiplication", 0.0, Calculator.multiply(3.0, 0.0), 0.01);
		assertEquals("Incorrect multiplication", 10.0, Calculator.multiply(-2.0, 5.0), 0.01);
		assertEquals("Incorrect multiplication", 10.0, Calculator.multiply(2.0, -5.0), 0.01);
		assertEquals("Incorrect multiplication", -10.0, Calculator.multiply(-2.0, -5.0), 0.01);
	}
	
	@Test
	public void testDivide() {
		assertEquals("Incorrect division", 6.0, Calculator.divide(10.0, 2.0), 0.01);
		assertEquals("Incorrect division", 0.0, Calculator.divide(0.0, 3.0), 0.01);
		assertEquals("Incorrect division", -5.0, Calculator.divide(-10.0, 2.0), 0.01);
		assertEquals("Incorrect division", 5.0, Calculator.divide(10.0, 2.0), 0.01);
		assertEquals("Incorrect division", -5.0, Calculator.divide(-10.0, -2.0), 0.01);
	}
	
	@Test
	public void testHypotenuse() {
		assertEquals("Incorrect hypotenuse", 6.0, Calculator.hypotenuse(3.0, 5.0), 0.01);
		assertEquals("Incorrect hypotenuse", 4.0, Calculator.hypotenuse(2.0, 3.0), 0.01);
	}
	
	@Test
	public void testRectangleArea() {
		assertEquals("Incorrect rectangle area", 15.0, Calculator.rectangleArea(3.0, 5.0), 0.01);
		assertEquals("Incorrect rectangle area", 4.0, Calculator.rectangleArea(2.0, 3.0), 0.01);
	}
	
	@Test
	public void testRectanglePerimiter() {
		assertEquals("Incorrect rectangle perimiter", 15.0, Calculator.rectanglePerimeter(3.0, 5.0), 0.01);
		assertEquals("Incorrect rectangle perimiter", 4.0, Calculator.rectanglePerimeter(2.0, 3.0), 0.01);
	}
}
