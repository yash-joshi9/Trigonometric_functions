package MathFunctions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import MathFunctions.Trigonometric_functions.MathFunc;

public class TestCase_version_4 {

	@Test
	public void TestCase_version_4() {
	}
	
	@Test
	public void testPrint() {
		System.out.println(">>>>>>>>>>test 4 executing");
	}
	
	MathFunc m = new MathFunc();
	@Test
	public void testsin()
	{
		double s = m.Sin(m.toRadians(33.0));

		String str = String.format("%.3f", s);
		String str2 = String.format("%.3f", Math.sin(Math.toRadians(33)));
		assertEquals(str2, str);
	}
	
	@Test
	public void testcos()
	{
		float c = (float)m.Cos(m.toRadians(66));
		assertEquals((float)Math.cos(Math.toRadians(66)), c);
		
	}
	
	@Test
	public void testTan()
	{
		float t = (float) m.Tan(66);
		assertEquals((float)(Math.tan(Math.toRadians(66))), t);
	}

}
