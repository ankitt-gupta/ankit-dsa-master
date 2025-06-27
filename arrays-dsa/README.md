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
			Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
			                       Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
			                       Maximum Profit  = 210 + 655 = 865
			Input: arr[] = {4, 2, 2, 2, 4}
			Output: 2
			Explanation: Buy the stock on day 1 and sell it on day 4 => 4 – 2 = 2
			                       Maximum Profit  = 2
 
 
 12. Trapping Rain Water
 
			Given an array of N non-negative integers arr[ ] representing an elevation map where the width of each bar is 1,
			compute how much water it is able to trap after rain.
			
			Note: The array elements represent the height of the bars.
 
			 Examples:  
			
			
			
			Input: arr[]   = {3, 0, 2, 0, 4}
			Output: 7
			Explanation: Structure is like below.
			We can trap “3 units” of water between 3 and 2,
			“1 unit” on top of bar 2 and “3 units” between 2 and 4.

13. Max consecutive 1s

			//Given a binary array, find the count of the maximum number of consecutive 1's present in the array.
			int[] a14 = {1,1,1,0,0,1,1};
			//Expected: 3   {3>2}
			Examples : 
			
			Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
			Output: 4
			
			Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
			Output: 1

14. Maximum subarray sum

			Given an array arr[], the task is to find the elements of a contiguous subarray of numbers that has the largest sum.
			
			Examples:
			
			Input: arr = [-2, -3, 4, -1, -2, 1, 5, -3]
			Output: [4, -1, -2, 1, 5]
			Explanation: 
			In the above input, the maximum contiguous subarray sum is 7 and the elements of the subarray are [4, -1, -2, 1, 5]
			
			Input: arr = [-2, -5, 6, -2, -3, 1, 5, -6] 
			Output: [6, -2, -3, 1, 5] 
			Explanation: 
			In the above input, the maximum contiguous subarray sum is 7 and the elements 
			of the subarray are [6, -2, -3, 1, 5]

15.  Longest Even Odd Subarray 

			Given an array a[ ] of N integers, the task is to find the length of the longest Alternating Even Odd subarray present in the array.
			
			Examples: 
			
			Input: a[] = {1, 2, 3, 4, 5, 7, 9} 
			Output: 5 
			Explanation: 
			The subarray {1, 2, 3, 4, 5} has alternating even and odd elements.
			
			Input: a[] = {1, 3, 5} 
			Output: 1
			Explanation: 
			There are only odd numbers, so we can count any one of them.

16. Maximum Circular Sum Subarray

			Given a circular array of size n, find the maximum subarray sum of the non-empty subarray.
			
			What is a Circular Subarray?
			An array is called circular if we consider the first element as the next of the last element.                    
			Example: arr[ ] ={1, 2, 3} 
			The subarrays of this circular array can be: {1} {2} {3} {1, 2} {2, 3} {3, 1} {1, 2, 3} {2, 3, 1} {3, 1, 2}
			Examples: 
			
			Input: arr[] = {8, -8, 9, -9, 10, -11, 12}
			Output: 22 
			Explanation: Subarray 12, 8, -8, 9, -9, 10 gives the maximum sum, that is 22.
			
			Input: arr[] = {10, -3, -4, 7, 6, 5, -4, -1} 
			Output:  23 
			Explanation: Subarray 7, 6, 5, -4, -1, 10 gives the maximum sum, that is 23.
			
			Input: arr[] = {-1, 40, -14, 7, 6, 5, -4, -1}
			Output: 52 
			Explanation: Subarray 7, 6, 5, -4, -1, -1, 40 gives the maximum sum, that is 52.

17. Majority Element

			Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 
			
			
			What is a majority element?
			A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 
			
			Examples : 
			
			Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
			Output : 4
			Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 
			
			Input : {3, 3, 4, 2, 4, 4, 2, 4}
			Output : No Majority Element
			Explanation: There is no element whose frequency is greater than the half of the size of the array size.

18. Minimum Consecutive Flips

			Given a binary array, we need to convert this array into an array that either contains all 1s or all 0s.  We need to do it using the minimum number of group flips.
			
			Examples : 
			
			Input : arr[] = {1, 1, 0, 0, 0, 1}
			Output :  From 2 to 4
			Explanation : We have two choices, we make all 0s or do all 1s.  We need to do two group flips to make all elements 0 and one group flip to make all elements 1.  Since making all elements 1 takes the least group flips, we do this.
			 
			
			Input : arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 0, 1}
			Output :  
			From 1 to 3
			From 5 to 6
			From 8 to 8
			 
			
			Input : arr[] = {0, 0, 0}
			Output :  
			Explanation : Output is empty, we need not to make any change
			 
			
			Input : arr[] = {1, 1, 1}
			Output :  
			Explanation : Output is empty, we need not to make any change
			 
			
			Input : arr[] = {0, 1}
			Output :   
			From 0 to 0  
			OR
			From 1 to 1
			Explanation :  Here number of flips are same either we make all elements as 1 or all elements as 0.

19. Sliding Window Technique

			Given an array of integers of size 'n'. Our aim is to calculate the maximum sum of 'k' consecutive elements in the array.
			
			Examples : 
			
			Input  : arr[] = {100, 200, 300, 400}
			         k = 2
			Output : 700
			
			Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
			         k = 4 
			Output : 39
			We get maximum sum by adding subarray {4, 2, 10, 23}
			of size 4.
			
			Input  : arr[] = {2, 3}
			         k = 3
			Output : Invalid
			There is no subarray of size 3 as size of whole
			array is 2.

20. Subarray with Given Sum

			Given an array arr[ ] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
			Examples: 
			
			Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
			Output: Sum found between indexes 2 and 4
			Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
			
			Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
			Output: Sum found between indexes 1 and 4
			Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
			
			Input: arr[] = {1, 4}, sum = 0
			Output: No subarray found
			Explanation: There is no subarray with 0 sum		

21. Prefix Sum

			Given an array arr[] of size n, its prefix sum array is another array prefixSum[ ] of the same size, such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] … arr[i]. 
			
			We need to create the prefix Array so that getsum() queries can be resolved in O(1) time.
			
			Examples : 
			
			Input  : arr[] = {10, 20, 10, 5, 15}
			Output : prefixSum[] = {10, 30, 40, 45, 60}
			Explanation : While traversing the array, update the element by adding it with its previous element.
			prefixSum[0] = 10, 
			prefixSum[1] = prefixSum[0] + arr[1] = 30, 
			prefixSum[2] = prefixSum[1] + arr[2] = 40 and so on.
			
			To fill the prefix sum array, we run through index 1 to last and keep on adding the present element with the previous value in the prefix sum array.
			
			Time Complexity: O(n)
			Auxiliary Space: O(n)

22. Equilibrium Point

			Given a sequence arr[ ] of size n, Write a function int equilibrium(int[] arr, int n) that returns an equilibrium index (if any) or -1 if no equilibrium index exists. 
			
			What is an Equilibrium Point?
			The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. 
			
			
			 
			Examples: 
			
			Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
			Output: 3 //index of 2
			3 is an equilibrium index, because: 
			A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
			
			 
			
			Input: A[] = {1, 2, 3} 
			Output: -1 

23. Maximum Appearing Element

			Given two arrays L[ ] and R[ ] of size N where L[i] and R[i] (0 ? L[i], R[i] < 106) denotes a range of numbers, the task is to find the maximum occurred integer in all the ranges. If more than one such integer exists, print the smallest one.
			
			Examples: 
			
			Input: L[ ] = {1, 4, 3, 1}, R[ ] = {15, 8, 5, 4}
			Output: 4
			
			Explanation: Overall ranges are: {1,2,3,4,5,6,7,8,9,10,11,12,13,14 15}, {4,5,6,7,8}, {3,4,5}, {1,2,3,4}. 
			
			In all these ranges, 4 appears the most times.
			
			Input: L[ ] = {1, 5, 9, 13, 21}, R[ ] = {15, 8, 12, 20, 24}
			Output: 5
			Explanation: Overall Ranges are: {1,2,3,4,5,6,7,8,9,10,11,12,13,14 15}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16,17,18,19,20},{21,22,23,24}
			In these ranges, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 all appear 2 times. The smallest number among all are 5.

24. We are given an Array of n integers, We are given q queries having indices l and r . We have to find out sum between the given range of indices.

			Input
			 [4, 5, 3, 2, 5]
			 3
			 0 3
			 2 4
			 1 3
			 Output
			 14 (4+5+3+2)
			 10 (3+2+5)
			 10 (5+3+2)

# Array Practice problems

1. Maximum Index

			Difficulty: MediumAccuracy: 24.5%Submissions: 276K+Points: 4
			Given an array arr of positive integers. The task is to return the maximum of j - i subjected to the constraint of arr[i] < arr[j] and i < j.
			
			Examples:
			
			Input: arr[] = [1, 10]
			Output: 1
			Explanation: arr[0] < arr[1] so (j-i) is 1-0 = 1.
			Input: arr[] = [34, 8, 10, 3, 2, 80, 30, 33, 1]
			Output: 6
			Explanation: In the given array arr[1] < arr[7] satisfying the required condition(arr[i] < arr[j]) thus giving the maximum difference of j - i which is 6(7-1).
			Expected Time Complexity: O(n)
			Expected Auxiliary Space: O(n)
			
			Constraints:
			1 ≤ arr.size ≤ 106
			0 ≤ arr[i] ≤ 109

2. 


 
 