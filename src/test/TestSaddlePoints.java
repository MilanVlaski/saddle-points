package test;

import static main.Saddle.arrayOf;
import static main.Saddle.matrixOf;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Saddle;

public class TestSaddlePoints {

    @Test
    void ReturnsSameValueAsOnlyElement() {
	int[] five = arrayOf(5);
	assertEquals(5, Saddle.max(five));
    }

    @Test
    void ReturnsLargerValueFromTwoGivenValues() {
	int[] twoElements = arrayOf(2, 3);
	assertEquals(3, Saddle.max(twoElements));
    }

    @Test
    void FindsElementWithValue() {
	int[] three = arrayOf(3);
	assertArrayEquals(arrayOf(0), Saddle.indexesOfValueInAnArray(3, three));
    }

    @Test
    void FindsElementWithValueThree_WhenTwoValuesExist() {
	int[] twoElements = arrayOf(1, 3);
	assertArrayEquals(arrayOf(1), Saddle.indexesOfValueInAnArray(3, twoElements));
    }

    @Test
    void FindsElementWithValueThree_WhenTwoThreesExist() {
	int[] twoThrees = arrayOf(3, 3);
	assertArrayEquals(arrayOf(0, 1), Saddle.indexesOfValueInAnArray(3, twoThrees));
    }

    @Test
    void FindsMinimumValueinArray() {
	int[] array = arrayOf(2, 3);
	assertEquals(2, Saddle.min(array));
    }

    @Test
    void FindMaxValuesInRow() {
	int[] array = arrayOf(3, 2, 3);
	assertArrayEquals(arrayOf(0, 2), Saddle.maxElementsIn(array));
    }

    @Test
    void FindMinValuesInColumn() {
	int[] array = arrayOf(2, 3, 2, 1, 1);
	assertArrayEquals(arrayOf(3, 4), Saddle.minElementsInArray(array));
    }

    @Test
    void DoesNotIdentifyFirstRowMaxCandidateAsSaddlePoint() {
	//@formatter:off
	int[][] matrix = {{0,  1},
			  {1, -2}};
	//formatter:on
	assertArrayEquals(matrixOf(), new Saddle(matrix).points());
    }
    
    @Test
    void IdentifiesSaddlePointInFirstRow() {
	//@formatter:off
	int[][] matrix = {{0, 1},
			  {1, 4}};
	//formatter:on
	assertArrayEquals(matrixOf(arrayOf(0, 1)), new Saddle(matrix).points());
    }
    
    @Test
    void IdentifiesSaddlePointInSecondRow() {
	//@formatter:off
	int[][] matrix = {{0, 5},
			  {1, 4}};
	//formatter:on
	assertArrayEquals(matrixOf(arrayOf(1, 1)), new Saddle(matrix).points());
    }

}
