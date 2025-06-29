package com.ankit.dsa.master.hashing;

import java.util.HashMap;

public class HashingDsaMain {

	public static void main(String[] args) {
		System.out.println("Hello! Hashing DSA");

// 1. Count Distinct Elements.

		// In this particular problem, we are presented with an array of integers, and
		// our objective is to determine the number of unique elements within the array.

		// Given:
		int[] a1 = { 15, 12, 13, 12, 13, 13, 18 };

		// Expected: 4
		
		HashMap<Integer, Integer> h1 = new HashMap<>();
		
		for (int i : a1) {
			h1.put(i, i);
		}
		
		System.out.println("Count Distinct Elements: " + h1.size());
	}

}
