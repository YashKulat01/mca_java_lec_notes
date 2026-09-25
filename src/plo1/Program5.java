package plo1;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// PROGRAM 5:
// WRITE A PROGRAM TO INSERT A SUBSTRING INTO A STRING AT A SPECIFIC 
// POSITION USING STRINGBULIDER;

		System.out.println("Program 5:\n");
		String s = "Hellow World !!";
		String s1 = "Yash ";

		StringBuilder sb = new StringBuilder(s);
		sb.insert(7, s1);

		System.out.println("String after insertion: " + sb.toString());

	}

}
