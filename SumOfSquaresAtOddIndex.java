package com.pratik;
// Sum of squares of all numbers at odd indexes.
public class SumOfSquaresAtOddIndex {
	public static void main(String[] args) {
		String str = "14A34@578m";
		int sum = 0;
		for(int i = 0;i < str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c) && i % 2 != 0) {
				int num = c - '0';
				sum += num * num;
			}
		}
		System.out.println(sum);
	}
}
