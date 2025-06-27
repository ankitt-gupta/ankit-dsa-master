package com.ankit.dsa.master.arrays;

import java.util.ArrayList;
import java.util.Arrays;

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

		// Input:
		// Expected:
		int a2[] = {};
		int sizeOfArray = a2.length;
		int secondMax = -1;
		int max = a2[0];
		if (sizeOfArray == 1) {
			System.out.println(" Max and Second Max : " + new ArrayList<>(Arrays.asList(a[0], -1)));
		}
		for (int i = 1; i < sizeOfArray; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (secondMax < a[i] && max != a[i]) {
				secondMax = a[i];
			}
		}

		System.out.println(" Max and Second Max : " + new ArrayList<>(Arrays.asList(max, secondMax)));

	}

}
