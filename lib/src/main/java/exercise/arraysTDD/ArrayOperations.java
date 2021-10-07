package exercise.arraysTDD;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
	private final int[] numbers; // array that needs to be sorted.
	private final int[] unsorted; // reference array which stays unsorted.

	public ArrayOperations(int[] numbers) {
		this.numbers = numbers;
		this.unsorted = numbers.clone();
	}

	/*
	 * ********************************************************** Please implement
	 * the following methods. * It is intended that they are not static. *
	 ***********************************************************/

	/**
	 * Prints out the numbers array.
	 */

	public void print() {
		System.out.println(Arrays.toString(numbers));
	}

	/**
	 * @return the sorted numbers array.
	 * @see <a
	 *      href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
	 */
	public int[] sort() {
		int swap = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[j - 1]) {
					swap = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = swap;
				}
			}
		}
		return numbers;
	}

	/**
	 * @return the sorted array in reverse order
	 */
	public int[] revertSort() {
		int swap = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if (numbers[j] > numbers[j - 1]) {
					swap = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = swap;
				}
			}
		}
		return numbers;
	}

	/**
	 * @return the unsorted array in reverted order.
	 */
	public int[] reverted() {
		int[] array = new int[unsorted.length];
		int counter = 0;
		for (int i = unsorted.length - 1; i >= 0; i--) {
			array[counter] = unsorted[i];
			counter++;
		}
		return array;
	}

	/**
	 * @param value which should be searched for.
	 * @return true if the array contains the value, false otherwise.
	 */
	public boolean contains(int value) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == value) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the average value of all elements summed up.
	 */
	public double average() {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = numbers[i] + sum;
		}
		return sum / numbers.length;
	}

	/**
	 * @return the average value of all elements summed up, but without the highest
	 *         and the lowest value.
	 */
	public double trimmedMean() {
		double lowestNumber = 0;
		double highestNumber = 0;
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			lowestNumber = minValue();
			highestNumber = maxValue();
			sum = numbers[i] + sum;
		}
		return (sum - lowestNumber - highestNumber) / (numbers.length - 2);
	}

	/**
	 * @return the max value of the array. In the array [1,9,3] max would be 9.
	 */
	public int maxValue() {
		int y = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > y) {
				y = numbers[i];
			}
		}
		return y;
	}

	/**
	 * @return the min value of the array. In the array [1,9,3] min would be 1.
	 */
	public int minValue() {
		int y = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				y = numbers[i];
			} else if (numbers[i] < y) {
				y = numbers[i];
			}
		}
		return y;
	}

	/*
	 * ********************************************************** Feel free to add
	 * as many private helper methods as * you like. *
	 ***********************************************************/

	private int someHelper(int[] tmp) {
		return 1;
	}
}
