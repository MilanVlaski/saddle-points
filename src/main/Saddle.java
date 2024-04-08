package main;

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

	public static int indexOf(int value)
	{
		return 0;
	}

}
