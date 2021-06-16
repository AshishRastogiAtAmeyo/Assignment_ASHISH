package com.ameyo.java.assignment;

/**
 * The Class Pattern.
 * 
 * @author ashish rastogi
 */
public class Pattern {
	
	/**
	 * The main method.
	 *
	 * @param args unused
	 * 
	 */
	public static void main(String[] args)  {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			printPalindromeNumber(i);
			System.out.println();
		}
	}

	/**
	 * Prints the palindrome numbers.
	 *
	 * @param number is passed as i
	 * @return nothing
	 */
	private static void printPalindromeNumber(int i) {
		// TODO Auto-generated method stub
		if (i == 0)
			System.out.print(0);
		else {
			System.out.print(i+" ");
			printPalindromeNumber(i - 1);
			System.out.print(" "+ i );
		}
	}
}
