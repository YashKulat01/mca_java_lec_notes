package dsa.sorts;

public class Defs {
	public static void main(String[] args) {
		
		System.out.println("Sorting algorithms in java\n");
		System.out.println("1) Bubble Sort:");
		System.out.println("	Bubble sort is a simple sorting algorithm that arranges \n"
				+ "	elements in ascending or descending order by repeatedly\n"
				+ "	comparing the two adjacent elements and swapping the\n"
				+ "	elements if they are in wrong order.");
		
		System.out.println("\n2) Insertion Sort:");
		System.out.println("	Insertion sort is a simple sorting algorithm that takes \n"
				+ "	an one element at a time ad inserting it in the already-\n "
				+ "	sorted portion of the array");
		
		System.out.println("\n3) Selection Sort:");
		System.out.println("	Selection sort is a sorting algorithm that finds the\n"
				+ "	smallest element from an unsorted part of an array\n"
				+ "	and swap it with the first element of an array.");
		
		System.out.println("\n4) Shell Sort:");
		System.out.println("	Shell sort is a sorting algorithm that improves insertion\n"
				+ "	sort by comparing elements that as far apart first and\n"
				+ "	gradually reducing the gap between them until the gap is 1");
		
		System.out.println("\n5) Quick Sort:");
		System.out.println("	Quick sort is a sorting algorithm that uses divide and\n"
				+ "	conqueror technique to sort an array. It selects a pivot\n"
				+ "	element, places smaller elements to left and larger elements\n"
				+ "	to right and then sorts the two parts recursively.");
		
		System.out.println("\n6) Merge Sort:");
		System.out.println("	Merge Sort is a sorting algorithm that uses the Divide and\n"
				+ "	Conquer technique. It divides an array into smaller parts,\n"
				+ "	sorts them, and merges them back together in ascending order.");
	}
}
