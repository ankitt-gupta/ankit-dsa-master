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

		// Expected:
	}

}
