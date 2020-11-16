package MathFunctions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

import MathFunctions.Trigonometric_functions.MathFunc;

public class TestCase_version_3 {

	

	@Test
	public void testPrint() {
		System.out.println(">>>>>>>>>>test 3 executing");
	}
	
	double PI = 3.141592653589793;
	MathFunc m = new MathFunc();

	//Testing the method toRadians which converts degree into radian
	@Test
	public void testToRadian()
	{
		double radian = m.toRadians(30);
		assertEquals(Math.toRadians(30),radian);
	}
	
	
	@Test
	public void testToRadian2()
	{
		double radian = m.toRadians(45);
		assertEquals(Math.toRadians(45),radian);
	}

	
	//Testing the method factorial
	@Test
	@DisplayName("Test Case for factorial of 0")
	public void testFactorial1()
	{
		long fact = MathFunc.factorial(0);
		assertEquals(1L, fact);
	}
	
	
	@Test
	@DisplayName("Test Case for long value")
	public void testFactorial2()
	{
		long fact = MathFunc.factorial(5L);
		assertEquals(120L, fact);
	}
	
	//Testing the power method
	
	@Test
	@DisplayName("Testing the Power Method with 0 value")
	public void testPower1()
	{
		float power = m.power(2.0, 0.0);
		assertEquals(Math.pow(2.0, 0.0), power);	
	}
	
	@Test
	@DisplayName("Testing the Power method with non-zero values")
	public void testPower2()
	{
		float power = m.power(2.0, 3.0);
		assertEquals(Math.pow(2.0, 3.0), power);
	}
	
	
}
