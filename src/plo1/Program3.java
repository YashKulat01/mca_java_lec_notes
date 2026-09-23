package plo1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
	
//	PROGRAM 3:
// 	WRITE A PROGRAM THAT TAKES USER INPUT FOR MULTIPLE STRINGS AND APPENDS THEM
//	USING STRINGBUILDER.
		
	System.out.println("Program 3:");

	Scanner scanner = new Scanner(System.in);
	
	StringBuilder sb = new StringBuilder();
	
	System.out.println("Enter strings to concatenate (Type exit to stop):");
	
	while (true) {
		String string = scanner.nextLine();
		
		if (string.equalsIgnoreCase("exit")) {
			break;
		}
		sb.append(string.trim()).append(" ");
	}
	
	System.out.println("Concatenated result: "+ sb.toString().trim());
	scanner.close();
	}
}
