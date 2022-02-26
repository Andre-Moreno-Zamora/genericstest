package test;

import java.util.ArrayList;

public class NumberList<T extends Number> implements Operations<T> {
	
	/* Store numbers ArrayList */
	private ArrayList<T> numbers;
	
	/* Constructor */
	public NumberList(T number1, T number2, T number3, T number4) {
		//
		try {
			// Create a new ArrayList and store it in numbers attribute
			this.numbers = new ArrayList<T>();
			// Insert numbers received from the constructor into the ArrayList
			numbers.add(number1);
			numbers.add(number2);
			numbers.add(number3);
			numbers.add(number4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/*Setters and Getters*/
	public ArrayList<T> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<T> numbers) {
		this.numbers = numbers;
	}

	@Override
	public T product(int index1, int index2) {
		/*
		   * After instantiating an object of NumberList with the numbers that will constitute the ArrayList, access this method by writing the name of the object, 
		   * plus a dot, and the name of this method while passing in as parameters the desired indexes from the ArrayList that you want to multiply.
		   * This should return the result of that multiplication.
		   *
		   * @param index1 - You have to pass in an integer to retrieve the first number that you want to multiply from the ArrayList. 
		   * 		index2 - You have to pass in an integer to retrieve the second number that you want to multiply from the ArrayList.
		   * @return You return a Generic object which value is the result from the multiplication performed in this method.
		   * @throws RuntimeException
		 */
		
		// Store numbers that were passed in as the arguments for this method
		T number1 = numbers.get(index1);
		T number2 = numbers.get(index2);
		
		// Get both values from these number1 and number2 objects, perform mathematical operation and store the result in a double type variable
		double result = number1.doubleValue() * number2.doubleValue();
		
		// Create a new Double object which stores the value of the result variable
		Double resultObj = Double.valueOf(result);
		
		// Cast the resultObj object as a Generic object
		return (T) resultObj;
	}

	@Override
	public T maxValue(T collection) {
		
		
		
		return null;
	}

	@Override
	public T minValue(T collection) {
		
		
		
		return null;
	}

	@Override
	public T sum(int index1, int index2) {
		/*
		   * After instantiating an object of NumberList with the numbers that will constitute the ArrayList, access this method by writing the name of the object, 
		   * plus a dot, and the name of this method while passing in as parameters the desired indexes from the ArrayList that you want to sum.
		   * This should return the result of that addition.
		   *
		   * @param index1 - You have to pass in an integer to retrieve the first number that you want to sum from the ArrayList. 
		   * 		index2 - You have to pass in an integer to retrieve the second number that you want to sum from the ArrayList.
		   * @return You return a Generic object which value is the result from the sum performed in this method.
		   * @throws RuntimeException
		 */
		
		// Store numbers that were passed in as the arguments for this method
		T number1 = numbers.get(index1);
		T number2 = numbers.get(index2);
		
		// Get both values from these number1 and number2 objects, perform mathematical operation and store the result in a double type variable
		double result = number1.doubleValue() + number2.doubleValue();
		
		// Create a new Double object which stores the value of the result variable
		Double resultObj = Double.valueOf(result);
		
		// Cast the resultObj object as a Generic object
		return (T) resultObj;
	}
	
	public void addNumber(T number) {
		/*
		   * After instantiating an object of NumberList with the numbers that will constitute the ArrayList, access this method by writing the name of the object, 
		   * plus a dot, and the name of this method while passing in as an argument, the desired value that you want to store in the ArrayList.
		   *
		   * @param number - You have to pass in a number to store it into the ArrayList. 
		   * @throws RuntimeException
		 */
		try {
			numbers.add(number);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void displayList() {
		
		/*
		   * After instantiating an object of NumberList with the numbers that will constitute the ArrayList, access this method by writing the name of the object, 
		   * plus a dot, and the name of this method. This will print in the console all of the contents from the ArrayList.
		   *
		   * @throws RuntimeException
		 */
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

}
