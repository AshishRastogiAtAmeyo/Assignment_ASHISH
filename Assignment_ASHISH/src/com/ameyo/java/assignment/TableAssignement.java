/**
 * 
 */
package com.ameyo.java.assignment;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class TableAssignement.
 * Print the table of a given number. 
 * Output should be in format, for say n = 3
 * 3 x 1 = 3 
 * 3 x 2 = 6 .. and so on
 * 
 * @author ashish rastogi
 */
public class TableAssignement {
	
	/** The Constant LOGGER. */
	public final static Logger LOGGER = new Log("table.log").getLogger();

	/**
	 * Instantiates a new table assignement.
	 */
	public TableAssignement() {
	}

	/**
	 * Prints the table.
	 *
	 * @param n passing the integer value
	 */
	private void printTable(int n) {
		LOGGER.config("Entering in member funtion : printTable");
		System.out.println("--- Table ---");
		for(int i = 1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d\n",n,i,(n*i));
		}
		LOGGER.info("Successfully printed the table !!");
		LOGGER.config("Exiting member funtion : printTable");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments unused
	 */
	public static void main(String[] args) {
		LOGGER.setLevel(Level.CONFIG);
		LOGGER.config("Entering in static member funtion : main");
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter number for table : ");
		try
		{
			int n = scan.nextInt();
			LOGGER.info("table requested for "+n);
			TableAssignement obj= new TableAssignement();
			obj.printTable(n);
			scan.close();
		}catch(Exception e)
		{
			int lineNumber = e.getStackTrace()[e.getStackTrace().length-1].getLineNumber();
			LOGGER.warning("<Line:"+lineNumber+"> Exception :"+e.toString()); 
		}
		LOGGER.config("Exiting static member funtion : main");
	}

}
