import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class testping {

	@Test
	public void testNumber1() {
		assertEquals(RomanConverter.Convert("I"), 1);
	}
	
	@Test
	public void testNumber2() {
		assertEquals(RomanConverter.Convert("II"), 2);
	}
	
	@Test
	public void testNumber5() {
		assertEquals(RomanConverter.Convert("V"), 5);
	}
	
	@Test
	public void test2DifferentNumber() {
		assertEquals(RomanConverter.Convert("VI"), 6);
	}
	
	@Test
	public void testSmallchar() {
		assertEquals(RomanConverter.Convert("vi"), 6);
	}
	@Test
	public void testX(){
		assertEquals(RomanConverter.Convert("x"),10);
	}
	@Test
	public void testL(){
		assertEquals(RomanConverter.Convert("l"),50);
	}
	@Test
	public void testC(){
		assertEquals(RomanConverter.Convert("C"),100);
	}
	@Test
	public void testD(){
		assertEquals(RomanConverter.Convert("D"),500);
	}
	@Test
	public void testM(){
		assertEquals(RomanConverter.Convert("M"),1000);
	}
	@Test(expected=RuntimeException.class)
	public void testA(){
		RomanConverter.Convert("A");
	}
	
	@Test(expected=RuntimeException.class)
	public void testNull(){
		RomanConverter.Convert("");
	}
	@Test
	public void testNumber4() {
		assertEquals(RomanConverter.Convert("IV"), 4);
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
	
	@Test(expected=RuntimeException.class)
	public void testInvalidRepetition() {
		RomanConverter.Convert("IIII");
	}
}
