# pingpongtdd
Repo for solution to Jozi-Jug January 2015 session - http://www.meetup.com/Jozi-JUG/events/227689917

Pavel:

	@Test
	public void testNumber1() {
		assertEquals(RomanConverter.Convert("I"), 1);
	}


Rory:

public class RomanConverter {
	public static int Convert(String s) 
	{
		return 1;
	}
}

	@Test
	public void testNumber2() {
		assertEquals(RomanConverter.Convert("II"), 2);
	}


Pavel:

public class RomanConverter {
	public static int Convert(String s) 
	{
		return s.length();
	}
}

	@Test
	public void testNumber5() {
		assertEquals(RomanConverter.Convert("V"), 5);
	}

 
Rory:

public class RomanConverter {
	public static int Convert(String s) 
	{
		if (s.equals("V") {
			return 5;
		}
		else {
			return s.length();
}
	}
}

	@Test
	public void testTwoDifferentNumbers() {
		assertEquals(RomanConverter.Convert("VI"), 6);
	}


Pavel:

public class RomanConverter {
	public static int Convert(String s) 
	{
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ‘I’) {
				sum += 1;
			}
			else {
				sum+= 5;
}
return sum;


	@Test
	public void testSmallchar() {
		assertEquals(RomanConverter.Convert("vi"), 6);
	}


Rory and Pavel to show the final solution with RegEx.

