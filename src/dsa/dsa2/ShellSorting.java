package dsa.dsa2;

import java.util.Scanner;

public class ShellSorting {
	static void Sort(int[] a, int n, int inc[], int numinc) {
		int increment, span, y, j, k, i;
		for (increment = 0; increment < numinc; increment++) {
			span = inc[increment];
			System.out.println();
			System.out.print("span value is " + span);
			for (j = span; j < n; j++) {
				y = a[j];
				for (k = j - span; k >= 0 && y < a[k]; k = k - span) {
					a[k + span] = a[k];
				}
				a[k + span] = y;
			}
			System.out.println("\narray element after span:" + span);
			for (i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.print("\n");
		}
		System.out.println(" Sorted Array: ");
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[30];
		int inc[] = new int[3];
		int i, n, numinc;

		inc[0] = 5;
		inc[1] = 3;
		inc[2] = 1;
		numinc = 3;

		System.out.println("*** Shell Sort in Java\n");
		System.out.println("Enter Array size:");
		n = sc.nextInt();
		System.out.println("Enter Array Elment:");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Sort(a, n, inc, numinc);
		sc.close();
	}
}
