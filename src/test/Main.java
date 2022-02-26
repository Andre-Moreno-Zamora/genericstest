package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n First object: \n");
		
		NumberList<Integer, ArrayList> numList = new NumberList<Integer, ArrayList>(5,14,54,20);
		
		numList.addNumber(3);
		numList.addNumber(78);
		numList.addNumber(11);
		numList.addNumber(8);
		numList.addNumber(19);
		numList.addNumber(23);
		numList.addNumber(7);
		
		System.out.println("ArrayList contents: " + numList.getNumbers());
		System.out.println("Product of indexes 0 and 4: " + numList.product(0, 4));
		System.out.println("Sum of indexes 0 and 1: " + numList.sum(0, 1));
		
		System.out.println("Maximum value from the ArrayList: " + numList.maxValue(numList.getNumbers()));
		System.out.println("Minimum value from the ArrayList: " + numList.minValue(numList.getNumbers()));
		
		System.out.println("Factorial of "+ numList.getNumbers().get(0) + ": " + numList.factorial(0));
		
		System.out.println("ArrayList of prime numbers: " + numList.findPrimes(numList.getNumbers()));
		
		System.out.println("\n Second object: \n");
		
		NumberList<Double, ArrayList> numList2 = new NumberList<Double, ArrayList>(1.5,34.3,33.2,97.1);
		
		numList2.addNumber(65.3);
		numList2.addNumber(77.6);
		numList2.addNumber(48.9);
		numList2.addNumber(125.5);
		numList2.addNumber(23.2);
		numList2.addNumber(81.4);
		numList2.addNumber(7.2);
		
		System.out.println("ArrayList contents: " + numList2.getNumbers());
		System.out.println("Product of indexes 5 and 2: " + numList2.product(5, 2));
		System.out.println("Sum of indexes 3 and 6: " + numList2.sum(3, 6));
		
		System.out.println("Maximum value from the ArrayList: " + numList2.maxValue(numList2.getNumbers()));
		System.out.println("Minimum value from the ArrayList: " + numList2.minValue(numList2.getNumbers()));
		
		System.out.println("Factorial of "+ numList2.getNumbers().get(10) + ": " + numList2.factorial(10));
		
		System.out.println("ArrayList of prime numbers: " + numList2.findPrimes(numList2.getNumbers()));
	}
	
	
	
}
