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
		int[] a2 = { 10, 5, 20, 10 };
		// Expected: 10

		int largestElement2 = -1;
		int SecondLargestrElement = -1;

		for (int i = 0; i < a2.length; i++) {
			if (largestElement2 < a2[i]) {
				SecondLargestrElement = largestElement2;
				largestElement2 = a2[i];
			}
		}

		System.out.println("SecondLargestrElement: " + SecondLargestrElement);

	}

}
