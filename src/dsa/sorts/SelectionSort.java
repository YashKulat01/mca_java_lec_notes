package dsa.sorts;

import java.util.Scanner;

/*
 * Selection Sort is a sorting algorithm that repeatedly finds the 
 * smallest element from the unsorted part of an array and swaps it 
 * with the first element of that unsorted part.
 * 
 * Time Complexity:
 * 					Best: O(n^2);
 * 					Avg: O(^2);
 * 					Worst: O(n^2);
 * 
 * Space complexity: O(1);
 */
class SelectionSort {

	static void Sort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.println("\ni:" + i);

			int min = i;
			System.out.println("Min:" + min);

			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
					System.out.println("a[j]: "+ a[j]);
					System.out.println("a[min]:" + a[min]);
					System.out.println("j:"+ j);
					System.out.println("min:" + min);
				}
			}

			int temp = a[min];
			System.out.println("Temp: "+ temp);
			
			a[min] = a[i];
			System.out.println("a[min]:" + a[min]);
			
			a[i] = temp;
			System.out.println("a[i]: "+ a[i]);
		}

		System.out.println("Array After Selection Sort:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[20];
		int n;

		System.out.println("*** Selection sort in java ***\n");
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
