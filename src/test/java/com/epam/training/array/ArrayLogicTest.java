package com.epam.training.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayLogicTest {

	@Test
	public void testExistsElement(){
		int[] firstArray = new int[] {2, 4, 6, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		int element = 8;
		Array array = new Array(firstArray);
		boolean result = arrayLogic.exists(array, element);
		Assert.assertTrue("Expected true", result);
	}
	
	@Test
	public void testNonExistsElement(){
		int[] firstArray = new int[] {2, 4, 6, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		int element = 1000000;
		Array array = new Array(firstArray);
		boolean result = arrayLogic.exists(array, element);
		Assert.assertFalse("Expected false", result);
	}
	
	@Test
	public void testExistsTwoSameElements(){
		int[] firstArray = new int[] {2, 4, 8, 6, 12, 12,  18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		int element = 12;
		Array array = new Array(firstArray);
		boolean result = arrayLogic.exists(array, element);
		Assert.assertTrue("Expected true", result);
	}
	
	@Test
    public void testIsPrimeNumberPositive() {
    	ArrayLogic arrayLogic = new ArrayLogic();
    	boolean result = arrayLogic.isPrimeNumber(3);
    	Assert.assertTrue("Expected true", result);
    }
	
	@Test
    public void testIsPrimeNumberNegative() {
    	ArrayLogic arrayLogic = new ArrayLogic();
    	boolean result = arrayLogic.isPrimeNumber(6);
    	Assert.assertFalse("Expected false", result);
    }

	@Test
    public void testFindPrimeNumbers() {
    	int[] firstArray = new int[] {2, 3, 7, 8, 12, 12, 18, 20, 24, 27, 30};
    	ArrayLogic arrayLogic = new ArrayLogic();
    	Array array = new Array(firstArray);
    	Array resultArray = arrayLogic.findPrimeNumbers(array);
    	int[] expectedArray = {2, 3, 7};
		Assert.assertArrayEquals(expectedArray, resultArray.getItems());
    }
	
	@Test
	public void testSearchMinPositiveNumber () {
		int[] firstArray = new int[] {2, 3, 7, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
    	int resultInt =arrayLogic.searchMin(array);
    	Assert.assertEquals(2, resultInt);
	}
	
	@Test
	public void testSearchMinNegativeNumber () {
		int[] firstArray = new int[] {-2, -3, -7, -8, -12, -12, -18, -20, -24, -27, -30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
    	int resultInt =arrayLogic.searchMin(array);
    	Assert.assertEquals(-30, resultInt);
	}
	
	@Test
	public void testSearchMinInArrayWithSameNumber () {
		int[] firstArray = new int[] {2, 2, 2, 2, 2};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
    	int resultInt =arrayLogic.searchMin(array);
    	Assert.assertEquals(2, resultInt);
	}
	
	@Test
	public void testSearchMaxPositiveNumber () {
		int[] firstArray = new int[] {2, 3, 7, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
    	int result =arrayLogic.searchMax(array);
    	Assert.assertEquals(30, result);
	}
	
	@Test
	public void testSearchMaxNegativeNumber () {
		int[] firstArray = new int[]  {-2, -3, -7, -8, -12, -12, -18, -20, -24, -27, -30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
    	int result =arrayLogic.searchMax(array);
    	Assert.assertEquals(-2, result);
	}
	
	@Test
	public void testSearchMaxInArrayWithSameNumber () {
		int[] firstArray = new int[]  {2, 2, 2, 2, 2};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
    	int result =arrayLogic.searchMax(array);
    	Assert.assertEquals(2, result);
	}
}
