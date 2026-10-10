package dsa.dsa1;

import java.util.Scanner;

public class LinearSearch {

	public static void linearSrch(int[] arr, int n, int key) {

		for (int x = 0; x < n; x++) {
			if (arr[x] == key) {
				System.out.println(" Element found at " + x + " index");
				return;
			}
		}

		System.out.println(" Element not found !!");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(" *** Linear Search in Java ***\n");
		System.out.print(" Enter array size: ");
		int n = scanner.nextInt();

		int arr[] = new int[n];

		System.out.print(" Enter array elements: ");
		for (int x = 0; x < n; x++) {
			arr[x] = scanner.nextInt();
		}

		System.out.print(" Enter element to search: ");
		int key = scanner.nextInt();

		linearSrch(arr, n, key);

		scanner.close();
	}
}
