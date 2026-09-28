package plo1;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// PROGRAM 4:
// WRITE A PROGRAM TO SPLIT A PARAGRAPH INTO INDIVIDUAL SENTENCES;

		System.out.println("Program 4:");

		String para = "This is the first sentence. Is this the second sentence? Yes! It is the third one.";

// SPLIT THE PARAGRAPH INTO SENTENCES BASED ON DELIMITERS LIKE '.', '?';
		String[] sentences = para.split("[.?!]");

//		System.out.println("Main Paragraph: " + para);

// PRINT EACH SENTENCE
		System.out.println("\nSeparated Paragraph:");
		for (String str : sentences) {

// TRIM ANY LEADING/TRAILING WHITESPACES
			System.out.println(str.trim());
		}

	}

}
