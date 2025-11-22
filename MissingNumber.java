package com.pratik;

// Find the missing number in an array (1 to n).
public class MissingNumber {

	public static int findMissing(int arr[]) {

		int n = arr.length + 1;

		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int num : arr) {
			actualSum += num;
		}
		
		int missing = expectedSum - actualSum;
		
				
		return missing;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		int res = findMissing(arr);
		
		System.out.println(res);
	}

}
