package dsa.dsa2;

import java.util.Scanner;

class BubbleSort {

	static void Sort(int[] a, int n) {
		int temp;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
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
