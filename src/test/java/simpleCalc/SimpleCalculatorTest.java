package simpleCalc;

import static org.junit.Assert.*;

import org.junit.Test;                        //�̰� �ΰ� �߰����ѿ�

public class SimpleCalculatorTest {

	@Test
	public void testAdd() 
	{
		SimpleCalculator calc= new SimpleCalculator();
		calc.add(10,20);
		assertEquals(30, calc.getResult());
		//	fail("Not yet implemented");
	}
	
	public void testSub() 
	{
		SimpleCalculator calc= new SimpleCalculator();
		calc.sub(10,20);
		assertEquals(-10, calc.getResult());
		//	fail("Not yet implemented");
	}

}
