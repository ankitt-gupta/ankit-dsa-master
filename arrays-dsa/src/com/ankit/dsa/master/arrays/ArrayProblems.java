package com.ankit.dsa.master.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Class Array problems.
 * 
 * Problems related to Arrays.
 * 
 * @author Ankit Gupta
 */
public class ArrayProblems {

	public static void main(String[] args) {

//1. Maximum Index

		// Input: {34, 8, 10, 3, 2, 80, 30, 33, 1}
		// Expected: 6

		int[] a = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };

		int lMin[] = new int[a.length];
		int rMax[] = new int[a.length];
		if (a.length == 1) {
			System.out.println("Max Difference : " + 0);
		}
		lMin[0] = a[0];
		rMax[a.length - 1] = a[a.length - 1];

		for (int i = 1; i < a.length; i++) {
			lMin[i] = Math.min(lMin[i - 1], a[i]);
		}

		for (int i = a.length - 2; i >= 0; i--) {
			rMax[i] = Math.max(rMax[i + 1], a[i]);
		}

		int maxDiff = -1;
		int i1 = 0;
		int j1 = 0;
		while ((i1 < a.length) && (j1 < a.length)) {
			if (lMin[i1] <= rMax[j1]) {
				maxDiff = Math.max(maxDiff, j1 - i1);
				j1++;
			} else {
				i1++;
			}
		}
		System.out.println("Max difference : " + maxDiff);

//2. Max and Second Max

		// Input: {1,2,3,4,5}
		// Expected: 5 4
		int[] a2 = { 1, 2, 3, 4, 5 };
		int sizeOfArray = a2.length;
		int secondMax = -1;
		int max = a2[0];
		if (sizeOfArray == 1) {
			System.out.println("Max and Second Max : " + Arrays.asList(a2[0], -1));
		}
		for (int i = 1; i < sizeOfArray; i++) {
			if (a2[i] > max) {
				secondMax = max;
				max = a2[i];
			} else if (secondMax < a2[i] && max != a2[i]) {
				secondMax = a2[i];
			}
		}

		System.out.println("Max and Second Max : " + Arrays.asList(max, secondMax));

//3. Mean And Median of Array 

		// Input: {1, 2, 19, 28, 5}
		// Mean Expected: 11
		// Median Expected: 5

		int[] a3 = { 1, 2, 19, 28, 5 };

		// Mean:
		int sum3 = 0;
		for (int i = 0; i < a3.length; i++) {
			sum3 += a3[i];
		}
		System.out.println("Mean or Average : " + sum3 / a3.length);

		// Median:
		Arrays.sort(a3);
		int n = a3.length;
		if (n % 2 == 0) {
			System.out.println("Median : " + (a3[n / 2 - 1] + a3[n / 2]) / 2);
		} else {
			System.out.println("Median : " + a3[n / 2]);
		}

//4. Rotate Array

		int[] a4 = { 1, 2, 3, 4, 5 };
		int d = 2;
		// Expected: {3, 4, 5, 1, 2}
		// Explain: when rotated by 2 elements, it becomes 3 4 5 1 2.

		if (d > a4.length) {
			d = d % a4.length;
		}
		reverse(a4, 0, d);
		reverse(a4, d, a4.length);
		reverse(a4, 0, a4.length);

		System.out.print("Expeted Rotate Array: ");
		for (int i = 0; i < a4.length; i++) {
			System.out.print(a4[i] + " ");
		}

		System.out.println("  ");
//5. Print Pattern

		int N = 0;
		int a5 = N;
		List<Integer> list = new ArrayList<>();
		if (N == 0) {
			list.add(N);
			System.out.println("Empty : " + list);
		}

		if (N < 0) {
			list.add(N);
			System.out.println("< 0 : " + list);
		}
		list.add(N);
		while (a5 > 0) {
			a5 = a5 - 5;
			list.add(a5);
		}
		while (a5 <= 0 || a5 < N) {
			a5 = a5 + 5;
			list.add(a5);
		}

		System.out.println("List : " + list);

//6. Check if array is sorted and rotated

		int[] a6 = { 2, 1, 4, 3 }; // true
//			{ 4, 3, 2, 1 };         // False
//				{ 4, 1, 2, 3 };     // true
//			{ 3, 4, 1, 2 };         // true
		int s = a6.length;
		if (s <= 1) {
			System.out.println("Not A or D: " + false);
		}
		int countA = 0;
		int countD = 0;

		for (int i = 0; i < a6.length - 1; i++) {
			if (a6[i] > a6[i + 1]) {
				countA++;
			} else {
				countD++;
			}
		}

		System.out.println("CountA: " + countA + " CountD : " + countD);

		if (a[a6.length - 1] <= a6[0] && countA == 1) {
			System.out.println("Is A: " + true);
		} else if (a6[s - 1] >= a6[0] && countD == 1) {
			System.out.println("IS D: " + true);
		} else {
			System.out.println("Not D or A: " + false);
		}

//7. 1 10 10 2 4 10 3 7 10 1 Given    0 + 2 
//	 10 1 2 10 10 4 7 3 1 10 Expected
//		2  Given

		
		
	}

	/**
	 * The Method Reverse.
	 * 
	 * Reverse an Array.
	 * 
	 * @param a
	 * @param from
	 * @param to
	 */
	private static void reverse(int[] a, int from, int to) {
		while (from < to - 1) {
			int temp = a[from];
			a[from] = a[to - 1];
			a[to - 1] = temp;
			from++;
			to--;
		}
	}

}
