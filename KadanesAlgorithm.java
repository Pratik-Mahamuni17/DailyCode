package com.pratik;

// Kadane’s Algorithm – Maximum Subarray Sum
public class KadanesAlgorithm {
	
	public static int maxSubArray(int[] arr) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int num : arr) {
			currentSum += num;
			if(currentSum > maxSum) {
				maxSum = currentSum;				
			}
			
			// reset if sum becomes negative
			if(currentSum < 0) {
				currentSum = 0;
			}
		}
		
		return maxSum;		
	}

	public static void main(String[] args) {
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4,8};
        System.out.println(maxSubArray(arr));  // Output: 6

	}

}
