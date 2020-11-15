package MathFunctions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import MathFunctions.Trigonometric_functions.MathFunc;

class TestCase_version_1 {

	
	@Test
	@DisplayName("It should convert degrees to radians")
	void testRadian() {
		MathFunc mathf = new MathFunc();
		// Checks the radian value of degree  
		assertEquals(mathf.toRadians(30.0), 0.1);
	}
	
	@Test
	@DisplayName("It should give sine value of degree")
	void TestSin() {
		MathFunc mathf = new MathFunc();
		assertEquals(mathf.Sin(mathf.toRadians(30)), 0.22222);
	}

	@Test
	@DisplayName("It should give Cos value of degree")
	void TestCos() {
		MathFunc mathf = new MathFunc();
		assertEquals(mathf.Cos(mathf.toRadians(30.0)), 0.1121);
	}

	@Test
	@DisplayName("It should give Tan value of degree")
	void TestTan() {
		MathFunc mathf = new MathFunc();
		assertEquals(mathf.Tan(mathf.toRadians(30.0)), 0.323232);
	}

	
}
