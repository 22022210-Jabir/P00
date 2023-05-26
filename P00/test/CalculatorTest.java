import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = 9999;
			assertEquals(expected,actual);
	}	

	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	public final void testMultiply() {
		int a = 1000;
		int b = 20;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 20000;
		assertEquals(actual,expected);
	}
	
	public final void testDivide() {
		int a = 3000;
		int b = 50;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 60;
		assertEquals(actual,expected);
		
	}
	}


