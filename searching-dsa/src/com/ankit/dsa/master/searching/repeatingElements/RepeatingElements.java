/**
 * 
 */
package com.ankit.dsa.master.searching.repeatingElements;

/**
 * The Class Repeating Elements.
 * 
 * @author Ankit Gupta
 */
public class RepeatingElements {

  public static void main(String[] args) {
	  int a[] = {1, 3, 2, 4, 6, 5, 7, 3};
    System.out.println("Repeated Element:" + repeatedElement(a));
  }

  private static int repeatedElement(int[] a) {
	int slow = a[0];
	int fast = a[0];
	
	do {
		slow = a[slow];
		fast = a[a[fast]];
	} while (slow != fast);
	
	slow = a[0];
	
	while (slow != fast) {
		slow = a[slow];
		fast = a[fast];
	}
	
	return slow;
  }

}
