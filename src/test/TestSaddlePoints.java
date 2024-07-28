package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Saddle;

public class TestSaddlePoints {

    @Test
    void ReturnsSameValueAsOnlyElement() {
	int[] five = new int[] { 5 };
	assertEquals(5, Saddle.max(five));
    }

    @Test
    void ReturnsLargerValueFromTwoGivenValues() {
	int[] twoElements = new int[] { 2, 3 };
	assertEquals(3, Saddle.max(twoElements));
    }

    @Test
    void FindsElementWithValue() {
	int[] three = new int[] { 3 };
	assertArrayEquals(new int[] { 0 }, Saddle.indexesOf(3, three));
    }

    @Test
    void FindsElementWithValueThree_WhenTwoValuesExist() {
	int[] twoElements = new int[] { 1, 3 };
	assertArrayEquals(new int[] { 1 }, Saddle.indexesOf(3, twoElements));
    }

    @Test
    void FindsElementWithValueThree_WhenTwoThreesExist() {
	int[] twoThrees = new int[] { 3, 3 };
	assertArrayEquals(new int[] { 0, 1 }, Saddle.indexesOf(3, twoThrees));
    }

    @Test
    void FindsMinimumValueinArray() {
	int[] array = new int[] { 2, 3 };
	assertEquals(2, Saddle.min(array));
    }

    @Test
    void FindMaxValuesInRow() {
	int[] array = new int[] { 3, 2, 3 };
	assertEquals(new int[] { 0, 2 }, Saddle.maxElementsInArray(array));
    }

}
