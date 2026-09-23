package plo1;

public class Program1 {
	public static void main(String[] args) {

// PROGRAM 1:
// WRITE A PROGRAM THAT COMPARES TWO STRINGS AND CHECKS FOR SUBSTRING PRESENCE.

		String str = "Hellow World !!";
		String str1 = new String("Hellow World !!");
		String str2 = "HELLOW WORLD !!";
		String subStr = "World !!";

		System.out.println("*** Program 1: ***\n");

// USING equals() METHOD (CASE SENSITIVE COMPARISON)
		if (str.equals(str1)) {
			System.out.println("Str & str1 are equal using equals()");
		} else {
			System.out.println("Str & str1 are not equal using equals()");
		}
//----------------------------------------------------------------------------

// USING equalIgnoreCase() METHOD (CASE INSENSITIVE COMPARISION)
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("str & str2 are equal using equalIgnoreCase()");
		} else {
			System.out.println("str & str2 are not equal using equalIgnoreCase()");
		}
// ----------------------------------------------------------------------------

// USING == OPERATOR
		if (str == str1) {
			System.out.println("str & str1 object are equal using == ");
		} else {
			System.out.println("str & str1 object are not equal using == ");
		}
// ----------------------------------------------------------------------------

// USING compareTo() method (LEXICOGRAPHICAL COMPARISON)
		int result = str.compareTo(str1);

		if (result == 0) {
			System.out.println("str and str1 are equal using compareTo()");
		} else if (result > 0) {
			System.out.println("str is lexicographically greater than str1 using compareTo()");
		} else {
			System.out.println("str is lexicographically smaller than str1 using compareTo()");
		}
// ----------------------------------------------------------------------------

// CHECK SUBSTRING IS PRESENT OR NOT
		if (str.contains(subStr)) {
			System.out.println("The subStr is substring of the first string.");
		} else {
			System.out.println("The subStr is not substring of the first string.");
		}
// ----------------------------------------------------------------------------

	}
}
