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
			if (i >= 0 && j < a6.length - 1 && a6[i] != a6[j]) {
				j++;
				swapInt(a6, i, j);
			}
		}
		size = j + 1;
		outPutIntArray(a6, size, "Removed Duplicates: ");

//6. Move zeros to the end
		
		//Given     0  1  2  3  4  5  6  7  8
		int[] a7 = {1, 0, 0, 2, 3, 5, 0, 9, 0};		
		//Expected: [1,2,3,5,9,0,0,0,0]
	
		int swapingIndex = 0;
		for (int currentIndex = 0; currentIndex < a7.length; currentIndex++) {
			if(a7[currentIndex] != 0) {
				swapInt(a7, currentIndex, swapingIndex);    
			    swapingIndex++;                             
			}
		}
		outPutIntArray(a7, a7.length, "Move Zeros to the End :");
		
//		Dry Run:
//      1, 2, 0, 0, 3, 5, 0, 9, 0  //0,0 -> swap  1,1 -> skip  2,1 -> skip  3,1 -> swap(3,1)   
//		1, 2, 3, 0, 0, 5, 0, 9, 0  //4,2 -> swap(4,2)  
//		1, 2, 3, 5, 0, 0, 0, 9, 0  //5,3 -> swap(5,3) 5,4 -> skip  
//      1, 2, 3, 5, 9, 0, 0, 0, 0  //6,4 -> swap(6, 4) skip for 7,8 as we will not find any non-zero value

//7. Left rotate array by d places

		// Given:
		int[] a8 = { 1, 2, 3, 4, 5 };
		int d = 2;
		// Expected: [3,4,5,2,1]

		reverse(a8, 0, d);
		reverse(a8, d, a8.length);
		reverse(a8, 0, a8.length);

		outPutIntArray(a8, a8.length, "Left rotate array by d places :  ");

		//Dry Run
		// Given: [1,2,3,4,5]
		// [2,1,3,4,5] (first reverse d places)
		// [2,1,5,4,3] (second reverse n-d places)
		// [3,4,5,1,2] (third reverse n places)

//8.  Leaders in an Array problem
		// Given Input:
		int[] a9 = { 16, 17, 4, 3, 5, 2 };
		// Expected Output: 17, 5, 2

		int leader = a9[a9.length - 1];
		System.out.print("Leaders in this array: " + leader);
		for (int i = a9.length - 1; i > 0; i--) {
			if (a9[i] > leader) {
				System.out.print(", " + a9[i]);
				leader = a9[i];
			}
		}

		
	}

	/**
	 * The Method Reverse array by d places.
	 * 
	 * @param a8   array to be reversed
	 * @param from range to start with
	 * @param to   range to end with
	 */
	private static void reverse(int[] a8, int from, int to) {
		while (from < to - 1) {
			swapInt(a8, from, to - 1);
			from++;
			to--;
		}
	}


	/**
	 * The method for output Integer Array.
	 * 
	 * @param a       : Array we need to output
	 * @param message : Output Message
	 */
	private static void outPutIntArray(int[] a, int size, String message) {
		// Iterate an Array and give output
		System.out.print(message);
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(" ");
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
