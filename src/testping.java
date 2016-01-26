import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class testping {

	@Test
	public void testNumber1() {
		assertEquals(1,RomanConverter.Convert("I"));
	}

	@Test
	public void testNumber2() {
		assertEquals(2,RomanConverter.Convert("II"));
	}

	@Test
	public void testNumber5() {
		assertEquals(5,RomanConverter.Convert("V"));
	}

	@Test
	public void test2DifferentNumber() {
		assertEquals(6,RomanConverter.Convert("VI"));
	}

	@Test
	public void testSmallchar() {
		assertEquals(6,RomanConverter.Convert("vi"));
	}

	@Test
	public void testX() {
		assertEquals(10,RomanConverter.Convert("x"));
	}

	@Test
	public void testL() {
		assertEquals(50,RomanConverter.Convert("l"));
	}

	@Test
	public void testC() {
		assertEquals(100,RomanConverter.Convert("C"));
	}

	@Test
	public void testD() {
		assertEquals(500,RomanConverter.Convert("D"));
	}

	@Test
	public void testM() {
		assertEquals(1000,RomanConverter.Convert("M"));
	}

	@Test(expected = RuntimeException.class)
	public void testA() {
		RomanConverter.Convert("A");
	}

	@Test(expected = RuntimeException.class)
	public void testNull() {
		RomanConverter.Convert("");
	}

	@Test
	public void testNumber4() {
		assertEquals(4,RomanConverter.Convert("IV"));
	}

	@Test
	public void testNumber40() {
		assertEquals(RomanConverter.Convert("XL"), 40);
	}

	@Test
	public void testNumber9() {
		assertEquals(RomanConverter.Convert("IX"), 9);
	}

	@Test
	public void testNumber90() {
		assertEquals(RomanConverter.Convert("XC"), 90);
	}

	@Test
	public void testNumber400() {
		assertEquals(RomanConverter.Convert("CD"), 400);
	}

	@Test
	public void testNumber999() {
		assertEquals(RomanConverter.Convert("CMXCIX"), 999);
	}

	@Test(expected = RuntimeException.class)
	public void testInvalidRepetition() {
		RomanConverter.Convert("IIII");
	}
}
