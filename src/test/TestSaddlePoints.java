package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Saddle;


public class TestSaddlePoints
{

	@Test
	void ReturnsSameElement_IfOnlyElement()
	{
		int[] five = new int[] {5};
		assertEquals(5, Saddle.max(five));
	}
}
