package MathFunctions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import MathFunctions.Trigonometric_functions.MathFunc;

public class TestCase_version_4 {


	
	@Test
	public void testPrint() {
		System.out.println(">>>>>>>>>>test 4 executing");
	}
	
	MathFunc m = new MathFunc();
	
//	Comparing sine with Math.sine 
	@Test
	@DisplayName("It should give sine value of degree")
	public void testsin()
	{
		double s = m.Sin(m.toRadians(33.0));
		String str = String.format("%.3f", s);
		String str2 = String.format("%.3f", Math.sin(Math.toRadians(33)));
		assertEquals(str2, str);
	}
	
//	Comparing cos with Math.Cos 
	@Test
	@DisplayName("It should give Tan value of degree")
	public void testcos()
	{
		float c = (float)m.Cos(m.toRadians(66));
		assertEquals((float)Math.cos(Math.toRadians(66)), c);
		
	}
	
//	Comparing Tan with Math.Tan 
	@Test
	@DisplayName("It should give Tan value of degree")
	public void testTan()
	{
		float t = (float) m.Tan(66);
		assertEquals((float)(Math.tan(Math.toRadians(66))), t);
	}

}
