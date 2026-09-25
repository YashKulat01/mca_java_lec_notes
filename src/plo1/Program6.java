package plo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program6 {
	public static void main(String[] args) {

// PROGRAM 6:
// WRITE A PROGRAM TO CONVERT A DATR OBJECT TO A STRING IN A SPECIFIC FORMAT;

		System.out.println("Program 6:\n");

// CREATE A DATE OBJECT REPRESENTING THE CURRENT DATE AND TIME;
		Date currDate = new Date();

// DEFINE THE DESIRED FORMAT;
		SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

// CONVERT THE DATE OBJECT INTO A STRING IN THE SPECIFIED FORMAT;
		String formattedDate = format.format(currDate);

// PRINT THE FORMATTED DATE;
		System.out.println("Formatted Date: " + formattedDate);
	}
}
