package com.epam.training.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

	public boolean exists(Array array, int element) {
		boolean result = false;
		int[] arraySortable = array.getItems();
		int firstIndex = 0;
		int lastIndex = arraySortable.length - 1;
		while(firstIndex <= lastIndex) {
			int middleIndex = (firstIndex + lastIndex) / 2;
			if(arraySortable[middleIndex] == element) {
				result = true;
				return result;
			}
			if(arraySortable[middleIndex] < element) {
				firstIndex = middleIndex + 1;
			}
			if (arraySortable[middleIndex] > element) {
				lastIndex = middleIndex - 1;
			}
		}
		return result;
	}

	public Array findPrimeNumbers(Array array) {
		int[] arraySerched = array.getItems();

		List<Integer> primeArray = new ArrayList<>();
		for(int i = 0; i <arraySerched.length; i++) {
			boolean isPrime = isPrimeNumber(arraySerched[i]);
			if(isPrime) {
				primeArray.add(arraySerched[i]);
			}
		}
		int[] resultArray = new int[primeArray.size()];
		for (int i=0 ;i < primeArray.size() ;i++) {
			resultArray[i] = primeArray.get(i);
		}
		return new Array(resultArray);
	}
	
	public boolean isPrimeNumber(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		} 
		return true;
	}

	public int searchMin (Array array) {
		int [] arraySerched = array.getItems();
		int min = arraySerched[0];
		for(int i = 0; i < arraySerched.length; i++) {
			if (arraySerched[i] < min) {
				min = arraySerched[i];
			}
		}
		return min;
	}
	
	public int searchMax (Array array) {
		int [] arraySerched = array.getItems();
		int max = arraySerched[0];
		for(int i = 0; i < arraySerched.length; i++) {
			if (arraySerched[i] > max) {
				max = arraySerched[i];
			}
		}
		return max;
	}
}




