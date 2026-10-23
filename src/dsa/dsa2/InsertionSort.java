package dsa.dsa2;

import java.util.Scanner;
/*
 * Insertion Sort is a simple sorting algorithm that sorts an array by taking
 * one element at a time and inserting it into its correct position in the 
 * already-sorted portion of the array.
 * 
 */
public class InsertionSort {
	static void Sort(int[] a, int n) {
		int temp, PTR, i;
		for (i = 1; i <= n - 1; i++) {
			temp = a[i];
			PTR = i - 1;
			while (PTR >= 0 && temp < a[PTR]) {
				a[PTR + 1] = a[PTR];
				PTR = PTR - 1;
			}
			a[PTR + 1] = temp;
		}
		System.out.println("Array element after sort:");
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[20];
		int n;

		System.out.println("*** Insetion sort in java \n");
		System.out.println("Enter Array size:");
		n = sc.nextInt();
		int i;
		System.out.println("Enter Array Elment:");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Sort(a, n);
		sc.close();
	}
}
