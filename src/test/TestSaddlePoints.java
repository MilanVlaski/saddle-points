package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Saddle;


public class TestSaddlePoints
{

	@Test
	void ReturnsSameValueAsOnlyElement()
	{
		int[] five = new int[] {5};
		assertEquals(5, Saddle.max(five));
	}
	
	@Test
	void ReturnsLargerValueFromTwoGivenValues()
	{
		int[] twoElements = new int[] {2,3};
		assertEquals(3, Saddle.max(twoElements));
	}
}
