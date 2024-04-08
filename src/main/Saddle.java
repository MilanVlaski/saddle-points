package main;

import java.util.ArrayList;

public class Saddle
{

	public static int max(int[] array)
	{

		int max = array[0];

		for (int number : array)
		{
			max = Math.max(max, number);
		}

		return max;
	}

	public static int[] indexesOf(int value, int[] array)
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

}
