package org.wcci.interview;

public final class StringUtil {
	public static String reverse(String stringToReverse){
		private String reversed = "";
		for (char character : stringToReverse.toCharArray()) {
			reversed = character + reversed;
		}
		return reversed;
	}
// TODO: Use Java Stream API to reverse string if you really want to impress your potential employer.

// Another Challenge TODO: Count all A's, B's, C's, etc. in a string and print the count out in an alphabetically ordered list of pairs.

// Yet another challenge: TODO: learn about SQUASHING!!!
}
