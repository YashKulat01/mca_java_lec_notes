package dsa.dsa2;

import java.util.Scanner;

/*
 * Bubble sort is a simple sorting algorithm that arranges elements in 
 * ascending or descending order by repeatedly comparing two adjacent
 * elements and swapping the elements if they are in wrong order.
 * 
 * Time complexity:
 * 					Best: O(n)
 * 					Avg: O(n^2)
 * 					Worst: O(n^2)
 * 
 * Space complexity: O(1)
 * 
 * Adv:
 * 		Easy to undestand and implement;
 * 		Uses constant extra space;
 * 		Stable sorting algorithm;
 * 
 * Disadv:
 * 		Inefficient for large arrays;
 * 		Slower than merge, Quick, and other sorts.
 */

class BubbleSort {

	static void Sort(int[] a, int n) {
		int temp;

		for (int i = 0; i < n - 1; i++) {
//			System.out.println("\ni: " + i);

			for (int j = 0; j < n - 1 - i; j++) {
//				System.out.println("\nj:" + j);
				if (a[j] > a[j + 1]) {
					temp = a[j];
//					System.out.println("Temp: " + temp);
					a[j] = a[j + 1];
//					System.out.println("a[j]: " + temp);
					a[j + 1] = temp;
//					System.out.println("a[j + 1]: " + temp);
//					System.out.println();
				}
				
//				System.out.println("Array After Bubble Sort:");
//				for (int i1 = 0; i1 < n; i1++) {
//					System.out.print(a[i1] + " ");
//				}
			}

		}

		System.out.println("Array After Bubble Sort:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[20];
		int n;

		System.out.println("*** Bubble Sort in java ***\n");
		System.out.println("Enter Array size:");
		n = sc.nextInt();

		if (n < 1 || n > 20) {
			System.out.println("Please enter a size between 1 and 20.");
			sc.close();
			return;
		}

		System.out.println("Enter Array Elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Sort(a, n);

		sc.close();
	}
}
