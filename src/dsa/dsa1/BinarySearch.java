package dsa.dsa1;

import java.util.Scanner;

public class BinarySearch {

	public static void binarySrch(int a[], int low, int high, int key) {
		
		high = a.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key) {
				System.out.println(" Element found at: " + mid + " index.");
				return;
			} else if (a[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println(" Element not found !!");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(" *** Binary Search in Java ***\n");
		System.out.print(" Enter array size: ");
		int n = scanner.nextInt();

		int arr[] = new int[n];

		System.out.print(" Enter array elements: ");
		for (int x = 0; x < n; x++) {
			arr[x] = scanner.nextInt();
		}

		System.out.print(" Enter element to search: ");
		int key = scanner.nextInt();

		binarySrch(arr, 0, n, key);

		scanner.close();
	}
}
