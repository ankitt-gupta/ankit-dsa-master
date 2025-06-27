package com.ankit.dsa.master.arrays;

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

		//Input: {34, 8, 10, 3, 2, 80, 30, 33, 1}
		//Expected: 6
		
		int[] a = {34, 8, 10, 3, 2, 80, 30, 33, 1} ;
		
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
		int i = 0;
		int j = 0;
		while ((i < a.length) && (j < a.length)) {
			if (lMin[i] <= rMax[j]) {
				maxDiff = Math.max(maxDiff, j - i);
				j++;
			} else {
				i++;
			}
		}
		System.out.println("Max difference : " + maxDiff);

	}

}
