package Utilities;
import java.util.Random;

public class Utilities {
  
    /**
	 * Get a random Double between two values.
	 * 
	 * @param min
	 * @param max
	 * @return A random Double
	 */
	public static Double getRandomDouble(Double min, Double max) {
		return min + new Random().nextDouble() * (max - min);
	}
    
    
}
