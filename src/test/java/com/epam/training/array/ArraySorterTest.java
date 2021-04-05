package com.epam.training.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArraySorterTest {

    @Test
    public void testSortShouldSortWhenPositiveNumbers(){
    	int[] firstArray = new int[] {8, 43, 27, 68, 112, 7612, 18, 320, 224, 27, 130};
    	ArraySorter arraySorter = new ArraySorter();
    	Array arrayForSort = new Array(firstArray);
    	Array resultArray = arraySorter.sort(arrayForSort);
    	int[] expectedArray = {8, 18, 27, 27, 43, 68, 112, 130, 224, 320, 7612};
    	Assert.assertArrayEquals(expectedArray, resultArray.getItems());

    }
    
    @Test
    public void testSortShouldSortWhenNegativeNumbers(){
    	int[] firstArray = new int[] {-8, -43, -27, -68, -112, -7612, -18, -320, -224, -27, -130};
    	ArraySorter arraySorter = new ArraySorter();
    	Array arrayForSort = new Array(firstArray);
    	Array resultArray = arraySorter.sort(arrayForSort);
    	int[] expectedArray = {-7612, -320, -224, -130, -112, -68, -43, -27, -27, -18, -8};
    	Assert.assertArrayEquals(expectedArray, resultArray.getItems());
    }
    
    @Test
    public void testSortShouldSortWhenSameNumbers(){
    	int[] firstArray = new int[] {8, 8, 8, 8, 8};
    	ArraySorter arraySorter = new ArraySorter();
    	Array arrayForSort = new Array(firstArray);
    	Array resultArray = arraySorter.sort(arrayForSort);
    	int[] expectedArray = {8, 8, 8, 8, 8};
    	Assert.assertArrayEquals(expectedArray, resultArray.getItems());
    }
    
    @Test
    public void testSortShouldSortWhenEmptyArrays(){
    	int[] firstArray = new int[] {};
    	ArraySorter arraySorter = new ArraySorter();
    	Array arrayForSort = new Array(firstArray);
    	Array resultArray = arraySorter.sort(arrayForSort);
    	int[] expectedArray = {};
    	Assert.assertArrayEquals(expectedArray, resultArray.getItems());
    }

    

}





