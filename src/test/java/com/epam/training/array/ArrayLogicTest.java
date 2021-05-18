package com.epam.training.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayLogicTest {

	@Test
	public void testExistsShouldFindNumberWhenDataIsValid(){
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
	public void testExistsShouldNotFindNumberWhenDataNotValid(){
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
	public void testExistsShouldFindNumberWhenDataContainSameElements(){
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
	public void testPrimeNumberShouldFindWhenDataIsValid() {
		//given(pre-conditions)
		ArrayLogic arrayLogic = new ArrayLogic();
		//when
		boolean result = arrayLogic.isPrimeNumber(3);
		//then(post-conditions)
		Assert.assertTrue("Expected true", result);
	}

	@Test
	public void testPrimeNumberShouldNotFindWhenDataIsunvalid() {
		//given(pre-conditions)
		ArrayLogic arrayLogic = new ArrayLogic();
		//when
		boolean result = arrayLogic.isPrimeNumber(6);
		//then(post-conditions)
		Assert.assertFalse("Expected false", result);
	}

	@Test
	public void testPrimeNumberShouldFindWhenDataIsValidWithManyPrimeNumbers() {
		//given(pre-conditions)
		int[] firstArray = new int[] {2, 3, 7, 8, 12, 12, 18, 20, 24, 27, 30};
		ArrayLogic arrayLogic = new ArrayLogic();
		Array array = new Array(firstArray);
		int[] expectedArray = {2, 3, 7};
		//when
		Array resultArray = arrayLogic.findPrimeNumbers(array);
		//then(post-conditions)
		Assert.assertArrayEquals(expectedArray, resultArray.getItems());
	}

	@Test
	public void testMinPositiveNumberSearchWhenDataIsValid () {
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
	public void testMinNegativeNumberSearchWhenDataIsValid () {
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
	public void testMinNumberShouldSerchWhenArrayContainSameNumber () {
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
	public void testMaxNumberShoudSearchWhenArrayContainPositiveNumber () {
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
	public void testMaxNumberShoudSearchWhenArrayContainNegativeNumber () {
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
	public void testMaxNumberShouldSerchWhenArrayContainSameNumber () {
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
