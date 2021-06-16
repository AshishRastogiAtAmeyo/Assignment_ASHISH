package com.ameyo.java.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Class StringAssignment.
 * @author ashish rastogi
 */
public class StringAssignment {

	/**
	 * Manipulate string.
	 *
	 * @param str passing string
	 */
	public void manipulateString(String str) {
		String result = "";
		List<Character> list = new ArrayList<Character>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (list.contains(str.charAt(i)) == false) {
				result += str.charAt(i);
				list.add(str.charAt(i));
			} 
		}
		displayString(result);
	}

	/**
	 * Display string.
	 *
	 * @param str the str
	 */
	public void displayString(String str) {
		System.out.println("Output String : "+str);
	}

	/**
	 * The main method.
	 *
	 * @param args unused
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringAssignment obj = new StringAssignment();
		System.out.print("Input String : ");
		String input = scan.nextLine();
		obj.manipulateString(input);
		scan.close();
	}
}
