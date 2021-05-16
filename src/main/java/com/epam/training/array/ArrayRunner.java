package com.epam.training.array;

public class ArrayRunner {
	public static void main(String[] args) {
		int[] cradle = new int[] {-2, -3, -7, -8, -12, -12, -18, -20, -24, -27, -30};
		//int element = 8;
		
		ArraySorter array = new ArraySorter();
		Array array1 = new Array(cradle);
		System.out.println(array1.toString());
		
		Array array2 = array.sort(array1);
		
		ArrayLogic arrayLogic = new ArrayLogic();
		
		
		//boolean elementExistInArray = arrayLogic.exists(array2, element);
		//int min = arrayLogic.searchMin(array1);
		int max = arrayLogic.searchMax(array1);
		
		//Array primeNumberArray = arrayLogic.findPrimeNumbers(array1);
		
		
		//System.out.println(array.equals(array));
		//System.out.println("1 " + array1.toString());
	//	System.out.println(array2.toString());
		//System.out.println(elementExistInArray + " " + element);
	//System.out.println("min - " + min);
		System.out.println("max - " + max);
		//System.out.println(primeNumberArray.toString() + " ");
	}
	

}
