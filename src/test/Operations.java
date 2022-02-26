package test;

import java.util.ArrayList;

public interface Operations<T extends Number, E extends ArrayList> {

	T product(int index1, int index2);
	T maxValue(E collection);
	T minValue(E collection);
	T sum(int index1, int index2);
	
}
