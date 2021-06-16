/**
 * 
 */
package com.ameyo.java.assignment;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class FibonacciSeries.
 * java program to display a  Fibonacci sequence(1,1,2,3,5,8,13,....) 
 * upto 50 numbers and print the sequence 
 * @author ashish rastogi
 */
public class FibonacciSeries {
	
	/** The number. */
	private int number;
	
	/** The Constant LOGGER. */
	public final static Logger LOGGER = new Log("fibbo.log").getLogger();
	/**
	 * Instantiates a new fibonacci series.
	 *
	 * @param number passing an integer value
	 */
	public FibonacciSeries(int number) {
		LOGGER.config("Entering in Constructor : FibonacciSeries");
		this.number = number;
		LOGGER.info("member variable number is set to "+number);
		LOGGER.config("Exiting Constructor : FibonacciSeries");
	}


	/**
	 * Prints the series upto N via iteration.
	 */
	public void printSeriesUptoNViaIteration() {
		LOGGER.config("Enetering in member funtion: printSeriesUptoNViaIteration");
		System.out.print("Iterative Approch: ");
		System.out.print("0");
		int prev = 0;
		int sum = 1;
		while(sum <= this.number)
		{
			System.out.print(" "+sum);
			sum+=prev;
			prev = sum-prev;
		}
		System.out.println();
		LOGGER.info("Successfully print the fibonacci series with last value "+sum);
		LOGGER.config("Exiting member funtion: printSeriesUptoNViaIteration");
	}
	
	/**
	 * Prints the series upto N via recursion.
	 */
	public void printSeriesUptoNViaRecursion() {
		LOGGER.config("Enetering in member funtion: printSeriesUptoNViaRecursion");
		int prev = 0;
		int sum = 1;
		LOGGER.config("Calling recursive funtion : printFibbo, arguments sum = "+sum+" prev = "+prev);
		System.out.print("Recursive Approch: ");
		System.out.print("0");
		printFibbo(sum,prev);
		LOGGER.config("Exiting member funtion: printSeriesUptoNViaRecursion");
	}
	
	/**
	 * Prints the fibbo series using recursion approch.
	 *
	 * @param sum passing fisrt integer value 
	 * @param prev passing second integer value 
	 * @return void
	 */
	private void printFibbo(int sum, int prev) {
		if(sum <= this.getNumber()) {
			System.out.print(" "+sum);
			sum += prev;
			prev = sum - prev;
			printFibbo(sum, prev);
		}else
		{
			System.out.println();
			LOGGER.info("Successfully print the fibonacci series with last value "+sum);
		}
	}


	/**
	 * Gets the number.
	 *
	 * @return the integer value as number
	 */
	public int getNumber() {
		return number;
	}


	/**
	 * The main method.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		LOGGER.setLevel(Level.CONFIG);
		LOGGER.config("Entering in static member funtion : main");
		FibonacciSeries series = new FibonacciSeries(50);
		series.printSeriesUptoNViaIteration();
		series.printSeriesUptoNViaRecursion();
		LOGGER.config("Exiting static member funtion : main");
	}

}
