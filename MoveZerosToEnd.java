package com.pratik;

// Move all zeros to the end
public class MoveZerosToEnd {

	public static void moveZeros(int[] arr) {
		int j = 0; // Pointer For Non zero Position.

		// Step 1: Move all non-zero elements to front
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}

		// Step 2: Fill the remaining array with zeros

		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		moveZeros(arr);
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
}
