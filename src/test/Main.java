package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		NumberList<Integer, ArrayList> numList = new NumberList<Integer, ArrayList>(5,14,54,20);
		
		numList.addNumber(3);
		numList.addNumber(78);
		numList.addNumber(8);
		numList.addNumber(19);
		
		System.out.println("ArrayList contents:");
		numList.displayList();
		System.out.println("Product of indexes: " + numList.product(0, 4));
		System.out.println("Sum of indexes: " + numList.sum(0, 1));
		
		System.out.println("Maximum value from the ArrayList: " + numList.maxValue(numList.getNumbers()));
		System.out.println("Minimum value from the ArrayList: " + numList.minValue(numList.getNumbers()));
		
		System.out.println("Factorial of "+ numList.getNumbers().get(0) + ": " + numList.factorial(0));
	}
	
	
	
}
