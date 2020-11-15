package MathFunctions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MathFunctions.Trigonometric_functions.MathFunc;

class TestCases {

	@Test
	void test() {
		
		MathFunc mf = new MathFunc();
		
		assertEquals(mf.toRadians(30.0), 0.5235987755982988);
		
	}

}
