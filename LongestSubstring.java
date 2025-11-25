package com.pratik;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        
        int left = 0, maxLen = 0;
        
        Set<Character> set = new HashSet<>();
        
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            // if character already exists, shrink window 
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(ch);
            
            // update maximum window size
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);  // Output: 3
    }
}
