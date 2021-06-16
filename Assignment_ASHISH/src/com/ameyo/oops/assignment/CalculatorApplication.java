package com.ameyo.oops.assignment;

import java.util.Vector;

/**
 * The Class CalculatorApplication.
 * 
 * @author ashish rastogi
 */
public class CalculatorApplication {
	
	/** The sum obj. */
	Sum sumObj;
	
	/** The subtract obj. */
	Subtract subtractObj;

	/**
	 * Instantiates a new calculator application.
	 */
	public CalculatorApplication() {
		sumObj = new Sum();
		subtractObj = new Subtract();
	}

	/**
	 * Start app.
	 */
	public void startApp() {
		Calculator.takeInput(10, 20);
		sumObj.calcultation();
		sumObj.displayResult();
		Calculator.clearInput();

		Calculator.takeInput(10, 20, 30);
		sumObj.calcultation();
		sumObj.displayResult();
		Calculator.clearInput();

		Calculator.takeInput(10, 20);
		subtractObj.calcultation();
		subtractObj.displayResult();
		Calculator.clearInput();

		Calculator.takeInput(100, 20, 30);
		subtractObj.calcultation();
		subtractObj.displayResult();
		Calculator.clearInput();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		CalculatorApplication app = new CalculatorApplication();
		app.startApp();
	}
}

/**
 * The Abstract Class Calculator. provide calculator funtionalities
 * 
 */
abstract class Calculator {
	static Vector<Integer> inputs = new Vector<Integer>();
	static int result;

	/**
	 * Take 2 inputs.
	 *
	 * @param input1 the input 1
	 * @param input2 the input 2
	 */
	public static void takeInput(int input1, int input2) {
		inputs.add(input1);
		inputs.add(input2);
	}

	/**
	 * Take 3 inputs.
	 *
	 * @param input1 the input 1
	 * @param input2 the input 2
	 * @param input3 the input 3
	 */
	public static void takeInput(int input1, int input2, int input3) {
		inputs.add(input1);
		inputs.add(input2);
		inputs.add(input3);
	}

	/**
	 * Clear inputs.
	 */
	public static void clearInput() {
		inputs.clear();
	}

	/**
	 * Calcultation.
	 */
	public abstract void calcultation();

	/**
	 * Display result.
	 */
	public abstract void displayResult();
}

/**
 * The Class Sum.
 */
class Sum extends Calculator {

	/* 
	 * sum all the inputs and store value in result
	 */
	@Override
	public void calcultation() {
		Calculator.inputs.forEach((number) -> Calculator.result += number);
	}

	@Override
	public void displayResult() {
		System.out.println(" Sum of " + Calculator.inputs + " is " + Calculator.result);
	}

}

/**
 * The Class Subtract.
 */
class Subtract extends Calculator {

	/* 
	 * subtract all the inputs and store value in result
	 */
	@Override
	public void calcultation() {
		result = 2 * Calculator.inputs.firstElement();
		Calculator.inputs.forEach((number) -> Calculator.result -= number);
	}

	@Override
	public void displayResult() {
		System.out.println(" Subtraction of " + Calculator.inputs + " is " + Calculator.result);
	}

}

