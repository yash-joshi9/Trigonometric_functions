package MathFunctions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;


import MathFunctions.Trigonometric_functions.MathFunc;

public class TestCase_version_2 {

	@Test
	public void TestCase_version_2() {
	}
	
	@Test
	public void testPrint() {
		System.out.println(">>>>>>>>>>test 2 executing");
	}
	
	@Test
	@DisplayName("It should convert degrees to radians")
	public void testRadian() {
		MathFunc mathf = new MathFunc();
		// Checks the radian value of degree  
		assertEquals(mathf.toRadians(30.0), 0.1);
	}
	
	@Test
	@DisplayName("It should give sine value of degree")
	public void TestSin() {
		MathFunc mathf = new MathFunc();
		assertEquals(mathf.Sin(mathf.toRadians(30)), 0.22222);
	}

	@Test
	@DisplayName("It should give Cos value of degree")
	public void TestCos() {
		MathFunc mathf = new MathFunc();
		assertEquals(mathf.Cos(mathf.toRadians(30.0)), 0.1121);
	}

	@Test
	@DisplayName("It should give Tan value of degree")
	public void TestTan() {
		MathFunc mathf = new MathFunc();
		assertEquals(mathf.Tan(mathf.toRadians(30.0)), 0.323232);
	}
}
