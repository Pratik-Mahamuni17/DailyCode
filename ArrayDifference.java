package com.pratik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDifference {
	
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,6,10};
		int [] arr2 = {8,9,7,1,2,3,4,5};
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int num : arr1) set1.add(num);
		for(int num : arr2) set2.add(num);
		
		List<Integer> unmatched = new ArrayList<Integer>();
		
		for(int num :arr1) {
			if(!set2.contains(num)) {
				unmatched.add(num);
			}
		}
		
		for(int num :arr2) {
			if(!set1.contains(num)) {
				unmatched.add(num);
			}
		}
		System.out.println(unmatched);
		
	}
}
