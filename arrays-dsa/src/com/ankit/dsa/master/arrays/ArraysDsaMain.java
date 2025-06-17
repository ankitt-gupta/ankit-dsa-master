package com.ankit.dsa.master.arrays;

import java.util.Iterator;

public class ArraysDsaMain {

	public static void main(String[] args) {
		System.out.println("Hello! Arrays in DSA");

//1. Largest Element in an Array:

		//Given: 
		int[] a1 = { 10, 5, 20, 10 };
		//Expected: 20

		int largestElement = 0;
		for (int i = 0; i < a1.length; i++) {
			if (largestElement < a1[i]) {
				largestElement = a1[i];
			}
		}
		System.out.println("largestElement: "+ largestElement);

//2. Second Largest Element in an Array:

		// Given:
		int[] a2 = { 15, 5, 20, 12, 14, 20, 8 };
		// Expected: 10

		int largestElement2 = -1;
		int SecondLargestrElement = -1;

		for (int i = 0; i < a2.length; i++) {
			if (largestElement2 < a2[i]) {
				SecondLargestrElement = largestElement2;
				largestElement2 = a2[i];
			} else if (a2[i] != largestElement2) {
				if (a2[i] > SecondLargestrElement) {
					SecondLargestrElement = a2[i];
				}
			}
		}

		System.out.println("SecondLargestrElement: " + SecondLargestrElement);
		
//3. Check if array is sorted or not (Ascending):

		// Given:
		int[] a3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// Expected: true
		// Given:
		int[] a4 = { 1, 8, 3, 4, 5, 6, 7, 8, 9 };
		// Expected: false

		boolean res = false;
		for (int i = 1; i < a4.length; i++) {
			if (a4[i - 1] < a4[i]) {
				res = true;
			} else {
				res = false;
				break;
			}
		}
		System.out.println("Sorted? : " + res);

//4. 
	}

}
