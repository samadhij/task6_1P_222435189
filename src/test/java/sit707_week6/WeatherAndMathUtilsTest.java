package sit707_week6;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WeatherAndMathUtilsTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s222435189";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Samadhi Jayasinghe";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse("Number is even", WeatherAndMathUtils.isEven(5));
	}
	
	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue("Number is not even", WeatherAndMathUtils.isEven(6));
	}
	
	@Test
	public void testIsPrimeForOne() {
	    Assert.assertFalse("1 should not be prime", WeatherAndMathUtils.isPrime(1));
	}
	
	@Test
	public void testPrimeNumber() {
		Assert.assertTrue("Number is not prime", WeatherAndMathUtils.isPrime(7));
	}
	
	@Test
	public void testNonPrimeNumber() {
		Assert.assertFalse("Number is prime", WeatherAndMathUtils.isPrime(6));
	}
	
    @Test
    public void testCancelWeatherAdviceWithHighWindSpeed() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testCancelWeatherAdviceWithHighPrecipitation() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
    }
    
    @Test
    public void testCancelWeatherAdviceWithBothHighWindSpeedAndPrecipitation() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 6.1));
    }
    
    @Test
    public void testWarnWeatherAdviceWithConcerningWindSpeed() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 0.0));
    }
    
    @Test
    public void testWarnWeatherAdviceWithConcerningPrecipitation() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 4.1));
    }
    
    @Test
    public void testCancelAdviceConcerningWindSpeedAndPrecipitation() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(45.1, 4.1));
    }
    
    @Test
    public void testAllClearWeatherAdvice() {
    	Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 3.0));
    }
    
    @Test
    public void testNegativeWindSpeedExceptionRules() {
    	thrown.expect(IllegalArgumentException.class);
    	WeatherAndMathUtils.weatherAdvice(-10.0, 5.0);
    }
    
    @Test
    public void testNegativePrecipitationExceptionRules() {
    	thrown.expect(IllegalArgumentException.class);
    	WeatherAndMathUtils.weatherAdvice(10.0, -5.0);
    }
   
}
