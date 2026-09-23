package plo1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// PROGRAM 2:
// PRPOGRAM TO ENCODE CHARACTERS TO THEIR UNICODE REPRESENTATIONS AND DECODE THEM BACK.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Program 2:");

// INPUT A STRING FROM THE USER
		System.out.println("Enter a string:");
		String string = scanner.nextLine();

// CONVERT THE STRING TO UNICODE CODE POINTS
		System.out.println("\nUnicode code points for the input string: " + string);

		for (int x = 0; x < string.length(); x++) {

// GET UNICODE CODE POINT
			int cp = string.codePointAt(x);
			System.out.printf("Character: '%c' -> Unicode: \\u%04X\n", string.charAt(x), cp);
		}

// CONVERT THE STRING TO BYTES USING UTF-8 ENCODING
		byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
		System.out.println("\nString in UTF-8 byte encoding:");

		for (byte b : bytes) {

// PRINT EACH BYTES IN HEXADECIMAL FORMAT
			System.out.printf("%02X ", b);
		}

// DECODE THE BYTES BACK TO THE ORIGINAL STRING
		String decodedStr = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("\n\nDecoded string from UTF-8 Bytes: " + decodedStr);
		scanner.close();
	}
}
