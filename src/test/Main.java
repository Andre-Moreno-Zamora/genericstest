package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		NumberList<Integer> numList = new NumberList<Integer>(5,14,54,20);
		
		numList.addNumber(3);
		numList.addNumber(4);
		numList.addNumber(8);
		numList.addNumber(19);
		
		System.out.println("ArrayList contents:");
		numList.displayList();
		System.out.println("Product of indexes: " + numList.product(0, 4));
		System.out.println("Sum of indexes: " + numList.sum(0, 1));
	}
	
	
	
}
