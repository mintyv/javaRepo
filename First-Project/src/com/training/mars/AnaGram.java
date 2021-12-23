package com.training.mars;
import java.util.Arrays;

public class AnaGram {

	public static void main(String[] args) {
		

        String word = "please";
        String anagram = "asleep";
 
        System.out.println("please and asleep:" + isAnaGram(word, anagram));
    }
 
    public static boolean isAnaGram(String word, String anagram) {
 
        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);
 
        return sortedWord.equals(sortedAnagram);
    }
 
    public static String sortChars(String word) {
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }
}
 