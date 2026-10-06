package plo2;

public class Program2 {
	public static void main(String[] args) {

// PROGRAM 2: 
// WRITE A PROGRAM TO COUNT THE NUMBER OF VOWELS IN A STRING USING THE CHARACTER CLASS.

		System.out.println("*** Program 2 ***\n");

// INPUT STRING
		String inputStr = "Hellow";

// INITIALIZE A COUNTER FOR VOWELS
		int vowelcount = 0;

// CONVERT THE STRING TO LOWERCASE TO HANDLE BOTH UPPERCASE AND LOWERCASE LETTERS;
		inputStr = inputStr.toLowerCase();

// LOOP THROUGH EACH CHARACTER IN THE STRING
		for (int a = 0; a < inputStr.length(); a++) {
			char currChar = inputStr.charAt(a);

// CHECK IF THE CHARACTER IS A VOWEL USING THE CHARACTER CLASS
			if (Character.isLetter(currChar) && isVowel(currChar)) {
				vowelcount++;
			}
		}

// OUTPUT THE RESULT
		System.out.println("Number of vowels in the string: " + vowelcount);
	}

//	CUSTOM METHOD TO CHECK IF A CHARACTER IS A VOWEL;
	private static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
