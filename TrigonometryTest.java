import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrigonometryTest {
	double precision = 0.0002;
	
	//Test cases for Sin for all 4 quadrants
	@Test
	public void testCaseSinQuadrant1() throws Exception
	{
		assertEquals(Math.sin(0.785398), Trigonometry.sin(0.785398), precision);
	}
	@Test
	public void testCaseSinQuadrant2() throws Exception
	{
		assertEquals(Math.sin(1.65806), Trigonometry.sin(1.65806), precision); 
	}
	@Test
	public void testCaseSinQuadrant3() throws Exception
	{
		assertEquals(Math.sin(3.83972), Trigonometry.sin(3.83972), precision);  
	}
	@Test
	public void testCaseSinQuadrant4() throws Exception
	{
		assertEquals(Math.sin(5.41052), Trigonometry.sin(5.41052), precision);  
	}
	
	//Test cases for Cos for all 4 quadrants
	@Test
	public void testCaseCosQuadrant1() throws Exception
	{
		assertEquals(Math.cos(0.785398), Trigonometry.cos(0.785398), precision);
	}
	@Test
	public void testCaseCosQuadrant2() throws Exception
	{
		assertEquals(Math.cos(1.65806), Trigonometry.cos(1.65806), precision);  
	}
	@Test
	public void testCaseCosQuadrant3() throws Exception
	{
		assertEquals(Math.cos(3.83972), Trigonometry.cos(3.83972), precision);  
	}
	@Test
	public void testCaseCosQuadrant4() throws Exception
	{
		assertEquals(Math.cos(5.41052), Trigonometry.cos(5.41052), precision);  
	}
	
	//Test cases for Tan for all 4 quadrants
	@Test
	public void testCaseTanQuadrant1() throws Exception
	{
		assertEquals(Math.tan(0.785398), Trigonometry.tan(0.785398), precision);
	}
	@Test
	public void testCaseTanQuadrant2() throws Exception
	{
		assertEquals(Math.tan(1.65806), Trigonometry.tan(1.65806), precision);  
	}
	@Test
	public void testCaseTanQuadrant3() throws Exception
	{
		assertEquals(Math.tan(3.83972), Trigonometry.tan(3.83972), precision);  
	}
	@Test
	public void testCaseTanQuadrant4() throws Exception
	{
		assertEquals(Math.tan(5.41052), Trigonometry.tan(5.41052), precision);  
	}

	//Test cases for Degree to Radians conversion and test sin,cos and tan
	@Test
	public void testdegreeToRadian() throws Exception
	{
		int angle = 45;
		double radians = Math.toRadians(angle);
		assertEquals(radians, Trigonometry.degreeToRadian(angle), precision);
		angle = 120;
		radians = Math.toRadians(angle);
		assertEquals(radians, Trigonometry.degreeToRadian(angle), precision);
		
		assertEquals(Math.sin(Math.toRadians(angle)), Trigonometry.sin(Trigonometry.degreeToRadian(angle)), precision);
		assertEquals(Math.cos(Math.toRadians(angle)), Trigonometry.cos(Trigonometry.degreeToRadian(angle)), precision);
		assertEquals(Math.tan(Math.toRadians(angle)), Trigonometry.tan(Trigonometry.degreeToRadian(angle)), precision);
	}
	
}
