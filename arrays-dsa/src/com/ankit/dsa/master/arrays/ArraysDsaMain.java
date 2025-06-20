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

		// Given 0 1 2 3 4 5 6 7 8
		int[] a7 = { 1, 0, 0, 2, 3, 5, 0, 9, 0 };
		// Expected: [1,2,3,5,9,0,0,0,0]

		int swapingIndex = 0;
		for (int currentIndex = 0; currentIndex < a7.length; currentIndex++) {
			if (a7[currentIndex] != 0) {
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

		// Dry Run
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
		System.out.println(" ");

//9. Maximum Difference Problem with Order
		// Given an array arr[] of integers,
		// find out the maximum difference between any two elements such that the larger
		// element appears after the smaller number.

		// Given Input :
		int[] a10 = { 2, 3, 10, 6, 4, 8, 1 };
		// Expected Output : 8

		// maxNum=10 from right to left
		// minNum=2 from left to right [such that the larger element appears after the
		// smaller number]
		// output both difference

		int minIndex = 0;
		int maxIndex = 0;

		for (int i = a10.length - 1; i >= 0; i--) {
			if (a10[i] > a10[maxIndex]) {
				maxIndex = i;
			}
		}

		for (int i = 0; i < a10.length; i++) {
			if ((a10[i] < a10[minIndex]) && i < maxIndex) {
				minIndex = i;
			}
		}

		System.out.println(
				"Max Difference:  " + a10[maxIndex] + " - " + a10[minIndex] + ": " + (a10[maxIndex] - a10[minIndex]));

//10. Find the Frequencies in a Sorted Array

		// Given:
		int[] a11 = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };
		// Expected: Output: Frequency of 1 is: 3
		// Frequency of 2 is: 1
		// Frequency of 3 is: 2
		// Frequency of 5 is: 2
		// Frequency of 8 is: 3
		// Frequency of 9 is: 2
		// Frequency of 10 is: 1

		int count = 1;

		for (int i = 1; i < a11.length; i++) {
			if (a11[i - 1] == a11[i]) {
				count++;
			} else {
				System.out.println("Frequency of " + a11[i - 1] + " is: " + count);
				count = 1;
				if (i == a11.length - 1) {
					System.out.println("Frequency of " + a11[i] + " is: " + count);
				}
			}
		}

//11. Stock Buy and Sell Problem

//		The cost of a stock on each day is given in an array. Find the maximum profit that you can make by buying and selling on those days. 
//		If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
		// Given:
		int[] a12 = { 100, 180, 260, 310, 40, 535, 695 };

		int maxProfit = 0;
		for (int i = 1; i < a12.length; i++) {
			if (a12[i] > a12[i - 1]) {
				maxProfit = maxProfit + (a12[i] - a12[i - 1]);
			}
		}

		System.out.println("Stock Buy and Sell Max Profit : " + maxProfit);

//12. Trapping Rain Water
		// Given an array of N non-negative integers arr[ ] representing an elevation
		// map where the width of each bar is 1,
		// compute how much water it is able to trap after rain.
		// Note: The array elements represent the height of the bars.
		// Input: arr[] = {1, 0, 3, 0, 2, 0, 4, 0, 1}
		// Output: 9

		int[] a13 = { 1, 0, 3, 0, 2, 0, 4, 0, 1 };

		// If the array has less than 3 elements, no water can be trapped.
		// (A bar needs walls on both sides to trap water)
		if (a13.length <= 2) {
			System.out.println("The total trapped water : " + 0);
		}

		int ress = 0; // Initialize total trapped water

		// Declare and initialize lMax and rMax arrays
		// These will store the maximum height encountered from the left and right,
		// respectively.
		int[] lMax = new int[a13.length];
		int[] rMax = new int[a13.length];

		// Fill lMax array:
		// lMax[i] stores the maximum height from index 0 to i (inclusive).
		lMax[0] = a13[0]; // The first element's left max is itself
		for (int i = 1; i < a13.length; i++) {
			lMax[i] = Math.max(a13[i], lMax[i - 1]);
		}

		// Fill rMax array:
		// rMax[i] stores the maximum height from index i to n-1 (inclusive).
		rMax[a13.length - 1] = a13[a13.length - 1]; // The last element's right max is itself
		for (int i = a13.length - 2; i >= 0; i--) { // Loop from second last element down to first
			rMax[i] = Math.max(a13[i], rMax[i + 1]);
		}

		// Calculate total trapped water:
		// Iterate from the second element (index 1) up to the second last element
		// (index n-2).
		// The first and last elements cannot trap water.
		for (int i = 1; i < a13.length - 1; i++) {
			// The water level above arr[i] is determined by the minimum of the
			// max height to its left and the max height to its right.
			// Subtract arr[i] itself to get the trapped water *above* this bar.
			ress = ress + (Math.min(lMax[i], rMax[i]) - a13[i]);
		}

		System.out.println("The total trapped water : " + ress);

//13. Max consecutive 1s

		//Given a binary array, find the count of the maximum number of consecutive 1's present in the array.
		int[] a14 = {1,1,1,0,0,1,1};
		//Expected: 3   {3>2}
		int cur = 0;
		int ones = 0;
		for (int i = 0; i < a14.length; i++) {
			if(a14[i] == 0) {
				cur = 0;
			} else {
				cur++;
			ones =	Math.max(ones,cur);
			}
		}

		System.out.println("Max 1s : " + ones);
		
		
		
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
