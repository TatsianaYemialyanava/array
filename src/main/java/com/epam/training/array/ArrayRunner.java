package com.epam.training.array;

public class ArrayRunner {
	public static void main(String[] args) {
		int[] cradle = new int[] {-2, -3, -7, -8, -12, -12, -18, -20, -24, -27, -30};		
		ArraySorter array = new ArraySorter();
		Array array1 = new Array(cradle);
		System.out.println(array1.toString());
		Array array2 = array.sort(array1);
		ArrayLogic arrayLogic = new ArrayLogic();
		int max = arrayLogic.searchMax(array1);
		System.out.println("max - " + max);
	}
}
