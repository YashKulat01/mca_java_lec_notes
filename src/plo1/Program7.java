package plo1;

import java.util.ArrayList;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// PROGRAM 7:
// WRITE A PROGRAM TO REMOVE NULL VALUES FROM AN ARRAY OF STRINGS.

		System.out.println("Program 7:\n");

// ORIGINAL ARRAY WITH SOME NULL VALUES;
		String mainArray[] = { "A", null, "B", "C", null, "D" };

// CREATE AN ARRAYLIST TO STORE NON-NULL VALUES;
		ArrayList<String> notNullList = new ArrayList<>();

// LOOP THROUGH THE ORIGINAL ARRAY;
		for (String s : mainArray) {
			if (s == null) {
				notNullList.remove(s);
			} else {
				notNullList.add(s);
			}
		}

// CONVERT THE ARRAYLIST BACK TO AN ARRAY;
		String[] notNullArray = notNullList.toArray(new String[0]);
		
// PRINT THE NEW ARRAY WITHOUT NULL VALUES;
		System.out.println("Array after removing null values:");
		for (String s : notNullArray) {
			System.out.println(s);
		}

	}

}
