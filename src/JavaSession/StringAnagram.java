package JavaSession;

import java.util.Arrays;

public class StringAnagram {
	/*
	 * Writing a program to check whether the given two strings are anagram or not
	 * Anagram : two strings are considered anagrams if they have the same
	 * characters with the same frequency, but the order of the characters is
	 * different.
	 */

	public static void main(String[] args) {
		String str1 = "Tomato";
		String str2 = "matoTo";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("The given two strings are not anagram");
		} else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if (Arrays.equals(string1, string2)) {
				System.out.println("The given two strings are anagram");
			} else {
				System.out.println("The given two strings are not anagram");
			}
		}
	}
}
