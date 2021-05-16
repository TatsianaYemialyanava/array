package com.epam.training.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayLogicTest {

	@Test
	public void testExistsElement(){
		//given(pre-conditions)
		int[] firstArray = new int[] {2, 4, 6, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		int element = 8;
		Array array = new Array(firstArray);
		//when
		boolean result = arrayLogic.exists(array, element);
		//then(post-conditions)
		Assert.assertTrue("Expected true", result);
	}
	
	@Test
	public void testNonExistsElement(){
		//given(pre-conditions)
		int[] firstArray = new int[] {2, 4, 6, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		int element = 1000000;
		Array array = new Array(firstArray);
		//when
		boolean result = arrayLogic.exists(array, element);
		//then(post-conditions)
		Assert.assertFalse("Expected false", result);
	}
	
	@Test
	public void testExistsTwoSameElements(){
		//given(pre-conditions)
		int[] firstArray = new int[] {2, 4, 8, 6, 12, 12,  18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		int element = 12;
		Array array = new Array(firstArray);
		//when
		boolean result = arrayLogic.exists(array, element);
		//then(post-conditions)
		Assert.assertTrue("Expected true", result);
	}
	
	@Test
    public void testIsPrimeNumberPositive() {
		//given(pre-conditions)
    	ArrayLogic arrayLogic = new ArrayLogic();
    	//when
    	boolean result = arrayLogic.isPrimeNumber(3);
    	//then(post-conditions)
    	Assert.assertTrue("Expected true", result);
    }
	
	@Test
    public void testIsPrimeNumberNegative() {
		//given(pre-conditions)
    	ArrayLogic arrayLogic = new ArrayLogic();
    	//when
    	boolean result = arrayLogic.isPrimeNumber(6);
    	//then(post-conditions)
    	Assert.assertFalse("Expected false", result);
    }

	@Test
    public void testFindPrimeNumbers() {
		//given(pre-conditions)
    	int[] firstArray = new int[] {2, 3, 7, 8, 12, 12, 18, 20, 24, 27, 30};
    	ArrayLogic arrayLogic = new ArrayLogic();
    	Array array = new Array(firstArray);
    	//when
    	Array resultArray = arrayLogic.findPrimeNumbers(array);
    	int[] expectedArray = {2, 3, 7};
    	//then(post-conditions)
		Assert.assertArrayEquals(expectedArray, resultArray.getItems());
    }
	
	@Test
	public void testSearchMinPositiveNumber () {
		//given(pre-conditions)
		int[] firstArray = new int[] {2, 3, 7, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
		//when
    	int resultInt =arrayLogic.searchMin(array);
    	//then(post-conditions)
    	Assert.assertEquals(2, resultInt);
	}
	
	@Test
	public void testSearchMinNegativeNumber () {
		//given(pre-conditions)
		int[] firstArray = new int[] {-2, -3, -7, -8, -12, -12, -18, -20, -24, -27, -30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
		//when
    	int resultInt =arrayLogic.searchMin(array);
    	//then(post-conditions)
    	Assert.assertEquals(-30, resultInt);
	}
	
	@Test
	public void testSearchMinInArrayWithSameNumber () {
		//given(pre-conditions)
		int[] firstArray = new int[] {2, 2, 2, 2, 2};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
		//when
    	int resultInt =arrayLogic.searchMin(array);
    	//then(post-conditions)
    	Assert.assertEquals(2, resultInt);
	}
	
	@Test
	public void testSearchMaxPositiveNumber () {
		//given(pre-conditions)
		int[] firstArray = new int[] {2, 3, 7, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
		//when
    	int result =arrayLogic.searchMax(array);
    	//then(post-conditions)
    	Assert.assertEquals(30, result);
	}
	
	@Test
	public void testSearchMaxNegativeNumber () {
		//given(pre-conditions)
		int[] firstArray = new int[]  {-2, -3, -7, -8, -12, -12, -18, -20, -24, -27, -30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
		//when
    	int result =arrayLogic.searchMax(array);
    	//then(post-conditions)
    	Assert.assertEquals(-2, result);
	}
	
	@Test
	public void testSearchMaxInArrayWithSameNumber () {
		//given(pre-conditions)
		int[] firstArray = new int[]  {2, 2, 2, 2, 2};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
		//when
    	int result =arrayLogic.searchMax(array);
    	//then(post-conditions)
    	Assert.assertEquals(2, result);
	}
}
