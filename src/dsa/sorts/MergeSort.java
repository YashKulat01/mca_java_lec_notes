
package dsa.sorts;

import java.util.Scanner;
/*
 * Merge sort is an algorithm that uses the Divide and Conquer technique.
 * It divides an array into smaller parts, sorts them, and merge them 
 * back together in ascending order.
 * 
 * Time Complexity:
 * 				Best: O(n log n)
 * 				Avg: O(n log n)
 * 				worst: O(n log n)
 * 
 * Space Complexity: O(n)
 */

public class MergeSort {

	public static void merge(int arr[], int low, int mid, int high) {

		int h = low, i = low, j = mid + 1;
		int[] b = new int[arr.length];

		while (h <= mid && j <= high) {

			if (arr[h] <= arr[j]) {
				b[i] = arr[h];
				h++;
			} else {
				b[i] = arr[j];
				j++;
			}

			i++;
		}

		if (h > mid) {
			while (j <= high) {
				b[i++] = arr[j++];
			}
		} else {
			while (h <= mid) {
				b[i++] = arr[h++];
			}
		}

		for (int k = low; k <= high; k++) {
			arr[k] = b[k];
		}
	}

	public static void mergSrt(int arr[], int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;

			mergSrt(arr, low, mid);
			mergSrt(arr, mid + 1, high);

			merge(arr, low, mid, high);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Merge Sort in Java ***\n");

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		if (n < 1 || n > 20) {
			System.out.println("Please enter a size between 1 and 20.");
			sc.close();
			return;
		}

		int low = 0;
		int high = n - 1;

		int a[] = new int[n];

		System.out.println("Enter Array Elements:");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		mergSrt(a, low, high);

		System.out.println("Sorted Array:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		sc.close();
	}
}
