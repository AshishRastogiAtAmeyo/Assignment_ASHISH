package com.ameyo.java.assignment;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class ArrayAssignment. 
 * Instantiate an int array of size 100. Populate it
 * with random values. Iterate and print the array using for i = 0 style of loop
 * Iterate and print the array using for each style of loop
 * 
 * @author ashish rastogi
 * @version 1.0
 */
public class ArrayAssignment {
	public final static Logger LOGGER = new Log("arrayAssignment.log").getLogger();

	/**
	 * The printArrayUsingforeachloop method.
	 * Prints the array using foreach loop.
	 *
	 * @param arr passing the integer array 
	 */
	private void printArrayUsingforeachloop(int[] arr) {
		LOGGER.config("Entering member funtion : printArrayUsingforeachloop");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		LOGGER.info("printed array upto length " + arr.length + " using for each loop");
		LOGGER.config("Exiting member funtion : printArrayUsingforeachloop");
	}

	/**
	 * The printArrayUsingforLoop method.
	 * Prints the array using for loop.
	 *
	 * @param arr passing the integer array
	 */
	private void printArrayUsingforLoop(int[] arr) {
		LOGGER.config("Entering member funtion : printArrayUsingforLoop");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		LOGGER.info("printed array upto length " + arr.length + " using for loop");
		LOGGER.config("Exiting member funtion : printArrayUsingforLoop");
	}

	/**
	 * The main method.
	 *
	 * @param args unused
	 * @throws Exception the exception
	 */

	public static void main(String[] args) throws Exception {
		LOGGER.setLevel(Level.CONFIG);
		LOGGER.config("Entering static member function : main");
		ArrayAssignment obj = new ArrayAssignment();
		Random random = new Random();
		int arr[] = random.ints(100, 1, 100).toArray();
		LOGGER.info("Created array of size " + arr.length + " and populated it with random values");
		obj.printArrayUsingforLoop(arr);
		obj.printArrayUsingforeachloop(arr);
		LOGGER.config("Exiting static member function : main");
	}

}
