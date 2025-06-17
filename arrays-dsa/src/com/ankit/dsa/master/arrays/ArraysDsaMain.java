package com.ankit.dsa.master.arrays;

/**
 * The Class ArraysDsaMain.
 * 
 * All question related to Arrays.
 * 
 * @author Ankit Gupta
 *
 */
public class ArraysDsaMain {

	public static void main(String[] args) {
		System.out.println("Hello! Arrays in DSA");
		int size = 0;

//1. Largest Element in an Array:

		// Given:
		int[] a1 = { 10, 5, 20, 10 };
		// Expected: 20

		int largestElement = 0;
		for (int i = 0; i < a1.length; i++) {
			if (largestElement < a1[i]) {
				largestElement = a1[i];
			}
		}
		System.out.println("largestElement: " + largestElement);

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
		// int[] a3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
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

//4. Reverse an Array:

		// Given:
		int[] a5 = { 1, 2, 3, 4, 5 };
		// Expected: [5,4,3,2,1]
		int a5Length = a5.length;
		for (int i = 0; i < a5Length / 2; i++) {
			swapInt(a5, i, a5Length - 1 - i);
		}
		size = a5.length;
		outPutIntArray(a5, size, "Reverse An Array: ");

//5. Remove duplicates from sorted array

		// Given:
		int[] a6 = { 10, 20, 20, 30, 30, 30, 40 };
		// Expected: [10,20,30]

		int j = 0;
		for (int i = 1; i < a6.length; i++) {
			if( i >= 0 && j < a6.length - 1 
				&& a6[i] != a6[j]) {
				j++;
				swapInt(a6, i, j);
			}
		}
		size = j+1;
		outPutIntArray(a6, size, "Removed Duplicates: ");

//6. 
		
  }


	/**
	 * The method for output Intger Array.
	 * 
	 * @param a       : Array we need to output
	 * @param message : Output Message
	 */
	private static void outPutIntArray(int[] a, int size, String message) {
		// Iterate an Array and give output
		System.out.println(message);
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}

	/**
	 * The method swaping of an Integer Array.
	 * 
	 * @param arr : Array in which we need to perform swap
	 * @param i   : Index
	 * @param j   : Index to swap with
	 */
	private static void swapInt(int[] arr, int i, int j) {
		int a = arr[i];
		arr[i] = arr[j];
		arr[j] = a;
	}

}
