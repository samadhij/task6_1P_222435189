package sit707_week6;

public class WeatherAndMathUtilsPartB {
	
	 public static int sumUpTo(int n) {
	        int sum = 0;
	        if (n < 1) {
	            return 0;  // Handle negative and zero inputs by returning 0
	          }
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    public static int countEvenNumbers(int[] numbers) {
	        int count = 0;
	        int i = 0;
	        while (i < numbers.length) {
	            if (numbers[i] % 2 == 0) {
	                count++;
	            }
	            i++;
	        }
	        return count;
	    }


}
