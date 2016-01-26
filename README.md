# pingpongtdd
Repo for solution to Jozi-Jug January 2015 session - http://www.meetup.com/Jozi-JUG/events/227689917

This exercise is to create a unit of code that converts Roman numbers into Arabic numerals.
Were going to show how the development proceeds when we work in the smallest possible increments

Player 1:

	@Test
	public void testNumber1() {
		assertEquals(1,RomanConverter.Convert("I"));
	}


Player 2:

	public class RomanConverter {
			public static int Convert(String s) 
			{
				return 1;
			}
	}

	@Test
	public void testNumber2() {
		assertEquals(2,RomanConverter.Convert("II"));
	}


Player 1:

	public class RomanConverter {
		public static int Convert(String s) 
		{
			return s.length();
		}
	}

	@Test
	public void testNumber5() {
		assertEquals(5,RomanConverter.Convert("V"));
	}

Player 2:

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
		assertEquals(6,RomanConverter.Convert("VI"));
	}


Player 1:

	public class RomanConverter {
		public static int Convert(String s) 
		{
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'I') {
					sum += 1;
				}
				else {
					sum+= 5;
				}
			}
		return sum;
	}


	@Test
	public void testSmallchar() {
		assertEquals(6,RomanConverter.Convert("vi");
	}


Continue until the final solution (with RegEx).


