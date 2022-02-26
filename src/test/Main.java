package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// FIRST OBJECT
		System.out.println("\n First object: \n");
		
		// Constructor must declare the first 4 elements in the ArrayList
		NumberList<Integer, ArrayList> numList = new NumberList<Integer, ArrayList>(5,14,54,20);
		
		// Add elements to ArrayList
		numList.addNumber(3);
		numList.addNumber(78);
		numList.addNumber(11);
		numList.addNumber(8);
		numList.addNumber(19);
		numList.addNumber(23);
		numList.addNumber(7);
		
		// Print ArrayList
		System.out.println("ArrayList contents: " + numList.getNumbers());
		// Multiply elements
		System.out.println("Product of indexes 0 and 4: " + numList.product(0, 4));
		// Sum elements
		System.out.println("Sum of indexes 0 and 1: " + numList.sum(0, 1));
		
		// Maximum value from ArrayList
		System.out.println("Maximum value from the ArrayList: " + numList.maxValue(numList.getNumbers()));
		// Minimum value from ArrayList
		System.out.println("Minimum value from the ArrayList: " + numList.minValue(numList.getNumbers()));
		
		// Get factorial
		System.out.println("Factorial of "+ numList.getNumbers().get(0) + ": " + numList.factorial(0));
		// List prime numbers
		System.out.println("ArrayList of prime numbers: " + numList.findPrimes(numList.getNumbers()));
		
		// SECOND OBJECT
		System.out.println("\n Second object: \n");
		
		// Constructor must declare the first 4 elements in the ArrayList
		NumberList<Double, ArrayList> numList2 = new NumberList<Double, ArrayList>(1.5,34.3,33.2,97.1);
		
		// Add elements to ArrayList
		numList2.addNumber(65.3);
		numList2.addNumber(77.6);
		numList2.addNumber(48.9);
		numList2.addNumber(125.5);
		numList2.addNumber(23.2);
		numList2.addNumber(81.4);
		numList2.addNumber(7.2);
		
		// Print ArrayList
		System.out.println("ArrayList contents: " + numList2.getNumbers());
		// Multiply elements
		System.out.println("Product of indexes 5 and 2: " + numList2.product(5, 2));
		// Sum elements
		System.out.println("Sum of indexes 3 and 6: " + numList2.sum(3, 6));

		// Maximum value from ArrayList
		System.out.println("Maximum value from the ArrayList: " + numList2.maxValue(numList2.getNumbers()));
		// Minimum value from ArrayList
		System.out.println("Minimum value from the ArrayList: " + numList2.minValue(numList2.getNumbers()));
		
		// Get factorial
		System.out.println("Factorial of "+ numList2.getNumbers().get(10) + ": " + numList2.factorial(10));
		// List prime numbers
		System.out.println("ArrayList of prime numbers: " + numList2.findPrimes(numList2.getNumbers()));
	}
	
	
	
}
