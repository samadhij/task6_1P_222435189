package sit707_week6;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;

public class WeatherAndMathUtilsPartBTest {
	  
	  @Test
	  public void testSumUpToEmpty() {
		  // Verifies the function returns 0 when n is 0.
		  Assert.assertEquals(0, WeatherAndMathUtilsPartB.sumUpTo(0));
	  }
	  
	  @Test
	  public void testSumUpToOne() {
		  // Verifies the function returns 1 when n is 1.
		  Assert.assertEquals(1, WeatherAndMathUtilsPartB.sumUpTo(1));
	  }
	  
	  @Test
	  public void testSumUpToPositive() {
		  // Verifies the function calculates the correct sum for a positive value of n
		  Assert.assertEquals(15, WeatherAndMathUtilsPartB.sumUpTo(5));
	  }
	  
	  @Test
	  public void testSumUpToNegative() {
		  // Verifies the function returns 0 for a negative value of n
		  Assert.assertEquals(0, WeatherAndMathUtilsPartB.sumUpTo(-5));
	  }
	  
	  @Test
	  public void testCountEvenNumbersEmptyArray() {
		  // Verifies the function returns 0 for an empty array.
		  int[] numbers = {};
		  Assert.assertEquals(0, WeatherAndMathUtilsPartB.countEvenNumbers(numbers));
	  }
	  
	  @Test
	  public void testCountEvenNumbersAllEven() {
		  // Verifies the function correctly counts all even numbers in an array.
		  int[] numbers = {2, 4, 6};
		  Assert.assertEquals(3, WeatherAndMathUtilsPartB.countEvenNumbers(numbers));
	  }
	  
	  @Test
	  public void testCountEvenNumbersMixed() {
		  // Verifies the function correctly counts even numbers in an array with both even and odd elements.
		  int[] numbers = {1, 2, 3, 4};
		  Assert.assertEquals(2, WeatherAndMathUtilsPartB.countEvenNumbers(numbers));
	  }
	  
	  @Test
	  public void testCountEvenNumbersAllOdd() {
		  // Verifies the function returns 0 for an all odd numbers array
		  int[] numbers = {1,3,5};
		  Assert.assertEquals(0, WeatherAndMathUtilsPartB.countEvenNumbers(numbers));
	  }
	  
	  @Test
	  public void testCreateInstance() {
	    WeatherAndMathUtilsPartB utils = new WeatherAndMathUtilsPartB();
	    assertNotNull(utils); // Assert that the object is created successfully
	  }
}
