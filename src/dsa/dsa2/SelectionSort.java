package dsa.dsa2;

import java.util.Scanner;

class SelectionSort {

	static void Sort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}

			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
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
