package com.dhirajtanwar.insertionsort;

import java.util.Arrays;

/*
 * Insertion sort is used when number of elements is small
 * Time Complexity: O(n*2)
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 14, 33, 27, 10, 35, 19, 42, 44 };
		System.out.println("Array before Sorting: " + Arrays.toString(arr));

		sort(arr);
		System.out.println("Array after Selection Sort: " + Arrays.toString(arr));
	}

	private static void sort(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int value = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = value;
		}

	}
}
