package main;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Saddle {

    private int[][] matrix;

    public Saddle(int[][] matrix) {
	this.matrix = matrix;
    }

    public static int[] indexesOfValueInAnArray(int value, int[] array) {
	var indexes = new ArrayList<Integer>(array.length);

	for (int i = 0; i < array.length; i++) {
	    if (array[i] == value) {
		indexes.add(i);
	    }
	}

	int[] result = new int[indexes.size()];

	for (int i = 0; i < indexes.size(); i++) {
	    result[i] = indexes.get(i);
	}

	return result;
    }

    public static int max(int[] array) {
	return valueFromCondition(array, Math::max);
    }

    public static int min(int[] array) {
	return valueFromCondition(array, Math::min);
    }

    private static int valueFromCondition(int[] array,
					  BiFunction<Integer, Integer, Integer> func) {
	int value = array[0];

	for (int number : array) {
	    value = func.apply(value, number);
	}

	return value;
    }

    public static int[] maxElementsIn(int[] array) {
	return indexesOfValueInAnArray(max(array), array);
    }

    public static int[] minElementsInArray(int[] array) {
	return indexesOfValueInAnArray(min(array), array);
    }

    public int[][] points() {
	int[] firstRow = matrix[0];
	int firstMaxCandidateColumnNumber = maxElementsIn(firstRow)[0];
	int maxValueInFirstRow = max(matrix[0]);
	if (existsSmallerElementThanXInColumn(maxValueInFirstRow,
					      firstMaxCandidateColumnNumber)) {
	    return matrixOf();
	} else {
	    return matrixOf(arrayOf(0, firstMaxCandidateColumnNumber)); 
	}
    }

    private boolean existsSmallerElementThanXInColumn(int value, int columnNumber) {
	for (int i = 0; i < matrix.length; i++) {
	    if (matrix[columnNumber][i] < value) {
		return true;
	    }
	}
	return false;
    }
    
    public static int[] arrayOf(int... elements) {
	return elements;
    }
    
    public static int[][] matrixOf(int[]... arrays) {
	return arrays;
    }

}
