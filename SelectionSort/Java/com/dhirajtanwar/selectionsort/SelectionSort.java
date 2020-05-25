package com.dhirajtanwar.selectionsort;

import java.util.Arrays;

/* 
 * Selection Sort
 * This algorithm is not suitable for large data sets as its average
 * worst case complexities are of Ο(n2)
 * 
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 14, 33, 27, 10, 35, 19, 42, 44 };
		System.out.println("Array before Sorting: " + Arrays.toString(arr));

		sort(arr);
		System.out.println("Array after Selection Sort: " + Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int min = i;
			for (int j =i+1; j<n ; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			if(!(min == i)) {
				int temp = arr[i];
				arr [i]= arr[min];
				arr[min]= temp;
			}
		}

	}
}
