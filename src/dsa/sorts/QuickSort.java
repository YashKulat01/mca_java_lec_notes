package dsa.sorts;

import java.util.Scanner;
/*
 * Quick sort is a sorting algorithm that uses the Divide and Conquer
 * technique to sort an array.
 * 
 * It selects one element as pivot and places it in its correct position.
 * Then it divides the array into two parts are: 
 * 	Elements smaller than the pivot;
 * 	Elements greater than the pivot;
 * 
 * It repeats this process until the entire array is sorted.
 * 
 * Time Complexity:
 * 				Best: O (n log n)
 * 				Average: O (n log n)
 * 				Worst: O (n^2)
 * 
 * Space complexity:
 * 				Average: O(log n) recursion stack;
 * 				Worst: O(n) recursion stack;
 * 
 * Adv: 
 * 		Fast for large arrays in average cases.
 * 		Uses in-place partitioning.
 * 		Does not require another array.
 * 		Efficient in practice;
 * 
 * Disadv:
 * 		Worst-case time complexity is O(n^2).
 * 		Uses recursion.
 * 		Performance depends on pivot selection.
 * 		It is not a stable sorting algorithm	
 */
public class QuickSort {
	public static int partition(int arr[], int beg, int end) {
		int piv = arr[beg];
		int up = end;
		int down = beg;
		int temp;

		while (down < up) {
			while (down < end && arr[down] <= piv)
				down++;

			while (arr[up] > piv)
				up--;

			if (down < up) {
				temp = arr[down];
				arr[down] = arr[up];
				arr[up] = temp;
			}

		}

		temp = arr[beg];
		arr[beg] = arr[up];
		arr[up] = temp;

		return up;
	}

	public static void quickSort(int arr[], int beg, int end) {
		if (beg < end) {
			int j = partition(arr, beg, end);

			quickSort(arr, beg, j - 1);
			quickSort(arr, j + 1, end);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Quick Sort in java ***\n");
		System.out.println("Enter Array size:");
		int n = sc.nextInt();

		if (n < 1 || n > 20) {
			System.out.println("Please enter a size between 1 and 20.");
			sc.close();
			return;
		}

		int[] a = new int[n];
		int beg = 0;

		int end = a.length - 1;
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		quickSort(a, beg, end);

		System.out.println("Sorted Array:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
