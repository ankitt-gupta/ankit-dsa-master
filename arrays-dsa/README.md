# ankit-dsa-master
All DSA questions solved.

Pre-requisite:
DSA: wht is it and how it can help?
Analysis of Algorihms: O(n) etc.

Start From here:

	1. Mathamatics
	2. Bit Magic
	3. Recursion
	4. Arrays
	5. Searching
	6. Sorting
	7. Matrix
	8. Hashing
	9. String
	10. Linked List
	11. Stack
	12. Queue
	13. Deque
	14. Tree
	15. Binary Search Tree
	16. Heap
	17. Graph
	18. Greedy
	19. Backtracking
	20. Dynamic Programming
	21. Trie
	22. Segment and Binary Indexed  Trees
	23. Disjoint Set


### Arrays

1. Largest Element in an Array:

		//Given:
		int[] a1 = { 10, 5, 20, 10 };
		//Expected: 20

2. Second Largest Element in an Array:

		//Given:
		int[] a2 = { 15, 5, 20, 12, 14, 20, 8 };
		// Expected: 10

3. Check if array is sorted or not (Ascending)

		// Given:
		int[] a3 = { 1,2,3,4,5,6,7,8,9 };
		// Expected: true
		//Given:
		int[] a4 = { 1,8,3,4,5,6,7,8,9 };
		// Expected: false

4. Reverse an Array:

		// Given:
		int[] a5 = { 1, 2, 3, 4, 5 };
		// Expected: [5,4,3,2,1]

5. Remove duplicates from sorted array

		//Given:
		int[] a6 = {10,20,20,30,30,30};
		//Expected: [10,20,30]

6. Move zeros to the end

	   //Given
	   int[] a7 = {1, 0, 0, 2, 3, 5, 0,  9, 0};		
	   //Expected: [1,2,3,5,9,0,0,0,0]

7. Left rotate array by d places

		// Given:
		int[] a8 = { 1, 2, 3, 4, 5 };
		int d = 2;
		// Expected: [3,4,5,2,1]

8. Leaders in an Array problem

  		What is a Leader? 
		An element is a leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. 
		
		Given Input: arr[] = {16, 17, 4, 3, 5, 2}, 
		Expected Output: 17, 5, 2

9. Maximum Difference Problem with Order

		Given an array arr[] of integers, find out the maximum difference between any two elements such that the larger element appears after the smaller number. 
		
		Input : arr = {2, 3, 10, 6, 4, 8, 1}
		Output : 8
		Explanation : The maximum difference is between 10 and 2.
		
		Input : arr = {7, 9, 5, 6, 3, 2}
		Output : 2
		Explanation : The maximum difference is between 9 and 7.

10.  Find the Frequencies in a Sorted Array

			Given a sorted array, arr[] consisting of N integers, the task is to find the frequencies of each array element.
			Input: arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10} 
			Output:       Frequency of 1 is: 3
			              Frequency of 2 is: 1
			              Frequency of 3 is: 2
			              Frequency of 5 is: 2
			              Frequency of 8 is: 3
			              Frequency of 9 is: 2
			              Frequency of 10 is: 1
			Input: arr[] = {2, 2, 6, 6, 7, 7, 7, 11} 
			Output:        Frequency of 2 is: 2
			               Frequency of 6 is: 2
			               Frequency of 7 is: 3
			               Frequency of 11 is: 1


11. Stock Buy and Sell Problem

			The cost of a stock on each day is given in an array. Find the maximum profit that you can make by buying and selling on those days. 
			If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
		
			Examples:
			
			Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
			Output: 865
			Explanation: Buy the stock on day 0 and sell it on day 3 => 310 � 100 = 210
			                       Buy the stock on day 4 and sell it on day 6 => 695 � 40 = 655
			                       Maximum Profit  = 210 + 655 = 865
			Input: arr[] = {4, 2, 2, 2, 4}
			Output: 2
			Explanation: Buy the stock on day 1 and sell it on day 4 => 4 � 2 = 2
			                       Maximum Profit  = 2
 
 
 12. Trapping Rain Water
 
			Given an array of N non-negative integers arr[ ] representing an elevation map where the width of each bar is 1,
			compute how much water it is able to trap after rain.
			
			Note: The array elements represent the height of the bars.
 
			 Examples:  
			
			
			
			Input: arr[]   = {3, 0, 2, 0, 4}
			Output: 7
			Explanation: Structure is like below.
			We can trap �3 units� of water between 3 and 2,
			�1 unit� on top of bar 2 and �3 units� between 2 and 4.

13. Max consecutive 1s

			//Given a binary array, find the count of the maximum number of consecutive 1's present in the array.
			int[] a14 = {1,1,1,0,0,1,1};
			//Expected: 3   {3>2}
			Examples : 
			
			Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
			Output: 4
			
			Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
			Output: 1

14. 
			 
 
 