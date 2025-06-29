package com.ankit.dsa.master.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class HashingDsaMain {

	public static void main(String[] args) {
		System.out.println("Hello! Hashing DSA");

// 1. Count Distinct Elements.

		// In this particular problem, we are presented with an array of integers, and
		// our objective is to determine the number of unique elements within the array.

		// Given:
		int[] a1 = { 15, 12, 13, 12, 13, 13, 18 };

		// Expected: 4

		HashSet<Integer> h1 = new HashSet<>();

		for (int i : a1) {
			h1.add(i);
		}

		System.out.println("Count Distinct Elements: " + h1.size());

// 2. Frequencies of array elements.

		// In this particular problem, we are presented with an array of integers, and
		// our objective is to determine the frequency of the array elements ie. the
		// number of times each element occurs in the array. To accomplish this, we will
		// explore two distinct approaches: a Naive approach utilizing nested loops, and
		// an Efficient solution employing Hashing (Maps).

		// Given:
		int[] a2 = { 10, 12, 10, 15, 10, 20, 12, 12 };
		// Expected:
		// 10: 3
		// 12: 3
		// 15: 1
		// 20: 1

		HashMap<Integer, Integer> h2 = new HashMap<Integer, Integer>();

		for (int i : a2) {
			h2.put(i, h2.getOrDefault(i, 0) + 1); // set the value as 0 of if present then add 1
		}
		System.out.println("Frequencies of array elements.: " + h2);

// 3. Intersection of two unsorted arrays

		// In this particular problem, we are presented with an array of unique
		// integers, and our objective is to find the intersection of the arrays and
		// print the elements according to the order of occurrence in the first array.
		// To accomplish this, we will explore two distinct approaches: a Naive approach
		// utilizing nested loops, and an Efficient solution employing Hashing .

		// Given:
		int[] a3 = { 10, 15, 20, 25, 30, 50 };
		int[] aa3 = { 30, 5, 15, 80 };
		// Expected: 15,30

	}

}
