package test;

public interface Operations {

	<T> T product(int index1, int index2);
	<T> T maxValue(T collection);
	<T> T minValue(T collection);
	<T> T sum(int index1, int index2);
	
}
