package com.dhirajtanwar.mergesort;

import java.util.Arrays;

public class MergeSortAlgo {

	public static void main(String[] args) {

		int arr[] = { 34, 23, 1, 90, 54,100, 65 };
		mergeSort(arr, arr.length);
		System.out.println("Sorted array using MergeSort : " + Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int length) {

		if (length < 2) {
			return;
		}

		int mid = length / 2;
		int[] left_arr = new int[mid];
		int[] right_arr = new int[length - mid];
		int k =0;
		for (int i = 0; i < length; i++) {
			
			if (i < mid) {
				left_arr[i] = arr[i];
			} else {
				right_arr[k] = arr[i];
				k++;
			}
		}

		mergeSort(left_arr, mid);
		mergeSort(right_arr, length - mid);

		merge(left_arr, right_arr, arr, mid, length - mid);
	}

	//Merge the left and right Array
	private static void merge(int[] left_arr, int[] right_arr, int[] arr, int leftSize, int rightSize) {

		int i = 0, l = 0, r = 0;

		while (l < leftSize && r < rightSize) {
			if (left_arr[l] < right_arr[r]) {
				arr[i] = left_arr[l];
				i++;
				l++;
			} else {
				arr[i] = right_arr[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			arr[i++] = left_arr[l++];
		}
		while (r < rightSize) {
			arr[i++] = right_arr[r++];
		}
	}

}
