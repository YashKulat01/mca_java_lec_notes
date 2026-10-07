package plo2;

public class Program3 {
	public static void main(String[] args) {

// PROGRAM 3: 
// WRITE A PROGRAM TO CHECK WHETHER A GIVEN STRING IS A PALINDROME OR NOT BY USING:
// A) STRINGBUFFER CLASS
// B) STRING CLASS

		System.out.println("*** Program 3 ***\n");

		String inputString = "madam";
		StringBuffer stringBuffer = new StringBuffer(inputString);
		StringBuffer reversedString = stringBuffer.reverse();

		if (inputString.equals(reversedString.toString())) {
			System.out.println(inputString + " is a palindrome.");
		} else {
			System.out.println(inputString + " is not a palindrome.");
		}

// USING STRING CLASS

		String inputStr = "madam";
		String reversedStr = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reversedStr += inputStr.charAt(i);
		}
		if (inputString.equals(reversedStr)) {
			System.out.println(inputStr + " is a palindrome.");
		} else {
			System.out.println(inputStr + " is not a palindrome.");
		}

	}
}
