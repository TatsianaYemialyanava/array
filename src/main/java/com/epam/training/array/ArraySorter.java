package com.epam.training.array;

public class ArraySorter {

	public Array sort(Array array) {
		int[] arrayForSorted = array.getItems();
		for(int i = 0; i < arrayForSorted.length; i++) {
			int minIndex = i;
			for(int j = i; j < arrayForSorted.length; j++) {
				if(arrayForSorted[minIndex] > arrayForSorted[j]) {
					minIndex = j;
				}
			}
			int temporary = arrayForSorted[i];
			arrayForSorted[i] = arrayForSorted[minIndex];
			arrayForSorted[minIndex] = temporary;
		}
		return new Array (arrayForSorted); 
	}
}



