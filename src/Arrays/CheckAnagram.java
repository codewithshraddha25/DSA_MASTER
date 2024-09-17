package Arrays;

import java.util.*;

public class CheckAnagram {

	public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // If lengths are different, not anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Create frequency maps for both strings
        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();
        
        // Populate the frequency map for the first string
        for (char c : str1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }
        
        // Populate the frequency map for the second string
        for (char c : str2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }
        
        // Compare both maps
        return charCountMap1.equals(charCountMap2);
    }

    public static void main(String[] args) {
        String str1 = "Triangle";
        String str2 = "Integral";
        
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

}
