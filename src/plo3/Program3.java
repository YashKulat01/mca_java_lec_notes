package plo3;

import java.util.TreeSet;

public class Program3 {
	public static void main(String[] args) {

// PROGRAM 3: 
// 			WRITE A JAVA PROGRAM USING SET INTERFACE CONTAINING LIST OF ITEMS
//			AND PERFORM THE FOLLOWING OPERATIONS:
//				A) ADD ITEMS IN THE SET.
//				B) INSERT ITEMS OF ONE SET INTO ANOTHER SET.
//				C) REMOVE ITEMS FROM THE SET.
//				D) SEARCH THE SPECIFIED ITEM IN THE SET.

		System.out.println("*** Program 4 ***\n");

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

//		A) ADD ITEMS IN THE SET.
		treeSet.add(0);
		treeSet.add(1);
		treeSet.add(2);

		System.out.println("Items in 1st Set are: " + treeSet);

		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();

		treeSet1.add(3);
		treeSet1.add(4);

		System.out.println("\nItems in 2nd set are: " + treeSet1);

//		B) INSERT ITEMS OF ONE SET INTO ANOTHER SET.
		System.out.println("\nInserting items of 1st set into another: ");
		treeSet.addAll(treeSet1);
		System.out.println(treeSet);

//		C) REMOVE ITEMS FROM THE SET.
		if (treeSet.contains(3)) {
			treeSet.remove(3);
		}

		System.out.println("\nAfter deletion of item in set:");
		System.out.println(treeSet);

//		D) SEARCH THE SPECIFIED ITEM IN THE SET.
		if (treeSet.contains(0)) {
			System.out.println("\n" + 0 + " is present in the set.");
		} else {
			System.out.println("\n" + 0 + " is not present in the set.");
		}

	}
}
