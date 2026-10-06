package plo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program1 {
	public static void main(String[] args) {

// PROGRAM 1: 
// WRITE A PROGRAM TO FIND ALL OCCURRENCES OF A PATTERN IN A STRING USING PATTERN AND MATCHER.

		System.out.println("*** Program 1: ***\n");
// DEFINE THE PATTERN (REGEX) TO SEARCH FOR
		String pattern = "ab";

// DEFINE THE STRING IN WHICH THE PATTERN WILL BE SEARCHED
		String inputStr = "abcabcabcabababba";

// COMPILE THE PATTERN
		Pattern compiledPattern = Pattern.compile(pattern);

// CREATE A MATCHER OBJECT TO SEARCH THE PATTEN IN THE INPUT STRING.
		Matcher matcher = compiledPattern.matcher(inputStr);

// FIND THE OCCURENCES OF THE PATTERN
		System.out.println("Pattern found at the following positions:");
		while (matcher.find()) {
			System.out.println("Start index: " + matcher.start() + ", End index: " + matcher.end());
		}
	}
}
