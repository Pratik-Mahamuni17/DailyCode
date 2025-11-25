package com.pratik;

public class WordsStartsWithVowel {
    public static void main(String[] args) {
        String str = "apple orange mango egg ice".trim();

        String[] words = str.split(" ");
        int count = 0;

        for (String word : words) {
            char c = Character.toLowerCase(word.charAt(0));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
