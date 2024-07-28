package main;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Saddle
{

	public static int[] indexesOfValueInAnArray(int value, int[] array)
	{
		var indexes = new ArrayList<Integer>(array.length);

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == value)
			{
				indexes.add(i);
			}
		}

		int[] result = new int[indexes.size()];

		for (int i = 0; i < indexes.size(); i++)
		{
			result[i] = indexes.get(i);
		}

		return result;
	}

	public static int max(int[] array)
	{
		return valueFromCondition(array, Math::max);
	}

	public static int min(int[] array)
	{
		return valueFromCondition(array, Math::min);
	}

	private static int valueFromCondition(int[] array,
	                                     BiFunction<Integer, Integer, Integer> func)
	{
		int value = array[0];

		for (int number : array)
		{
			value = func.apply(value, number);
		}

		return value;
	}

	public static int[] maxElementsInArray(int[] array) {
		return indexesOfValueInAnArray(max(array), array);
	}

	public static int[] minElementsInArray(int[] array) {
		return indexesOfValueInAnArray(min(array), array); 
	}

}
