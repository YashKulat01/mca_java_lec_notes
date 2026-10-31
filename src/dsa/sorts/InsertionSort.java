package dsa.sorts;

import java.util.Scanner;

/*
 * Insertion Sort is a simple sorting algorithm that sorts an array by taking
 * one element at a time and inserting it into its correct position in the 
 * already-sorted portion of the array.
 * 
 * Time complexity: 
 * 					Best: O(n)
 * 					Avg: O(n^2)
 * 					Worst: O(n^2)
 * 
 * Space complexity: 
 * 					O(1)
 * 
 * Adv: 
 * 		Easy to understand and implement.
 * 		Uses constant extra space.
 * 		Efficient for small or nearly sorted arrays.
 * 		Stable sorting algorithm
 * 
 * Disadv:
 * 		Slow for large, randomly ordered arrays.
 * 		Requires many shifts in worst case.
 * 		Less efficient than merge, quick sort for large datasets.
 */

public class InsertionSort {
	static void Sort(int[] a, int n) {
		int i;
		for (i = 1; i < a.length; i++) {

//			System.out.println("\ni: " + i);
			int temp = a[i];
//			System.out.println("temp: " + temp);
			int j = i - 1;
//			System.out.println("j: " + j);
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
//				System.out.println("a[j + 1]: " + a[j + 1]);
				j--;
//				System.out.println("j:" + j);
			}
			a[j + 1] = temp;
//			System.out.println("a[j + 1]: " + a[j + 1]);
		}
		System.out.println("Array element after sort:");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("*** Insetion sort in java \n");
		System.out.println("Enter Array size:");
		n = sc.nextInt();
		int i;

		int[] a = new int[n];

		System.out.println("Enter Array Elment:");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();

		Sort(a, n);

		sc.close();
	}
}
