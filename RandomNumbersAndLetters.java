import java.util.Random;

/**
 * Generate random Numbers and Letters in different ways
 * 
 * Created by: Jaiveer Dhanju
 * Last updated on 12/13/2018
 * 
*/
	
public class RandomNumbersAndLetters {

	private static final String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
	private static final String numbers = "123456789";
	private static final int letterLength = lowercaseLetters.length();
	private static final int numberLength = numbers.length();
	private static Random random = new Random();
	
	
	/**
	 * 
	 * @param amountOfNumbers
	 * @return A String with containing random numbers
	 */
	public static String RandomNumbers(int amountOfNumbers) {
		String randomNumbers="";
		
		for(int i=0; i<amountOfNumbers;i++) {
			randomNumbers+=numbers.charAt(random.nextInt(numberLength)); 
		}
		
		return randomNumbers;
	}
	
	
	/**
	 * Generates a certain size of random numbers. If the paramter given is 0 then
	 * -1 will be returned 
	 * 
	 * @param amountOfNumbers
	 * @return random numbers in an Integer form
	 */
	public static int RandomNumbersAsInt(int amountOfNumbers) {
		
		if(amountOfNumbers == 0) {
			return -1;
		}
		
		return Integer.parseInt(RandomNumbers(amountOfNumbers));
	}
	
	/**
	 * 
	 * @param amountOfLetters
	 * @return A String of a random amount of lowercase letters
	 */
	public static String randomLowerCaseLetters(int amountOfLetters) {
		
		if(amountOfLetters < 0 ) {
			return "input must be great than or equal to 0";
		}
		
		String randomLowercaseLetters = "";
		
		for(int i=0; i<amountOfLetters;i++) {
			randomLowercaseLetters += lowercaseLetters.charAt(random.nextInt(letterLength));
		}
		
		return randomLowercaseLetters;
	}
	
	/**
	 * calls the randomLowerCaseLetters method and converts the returned String to
	 * uppercase.
	 * 
	 * @param amountOfLetters
	 * @return
	 */
	public static String randomUpperCaseLetters(int amountOfLetters) {
		
		String temp = RandomNumbersAndLetters.randomLowerCaseLetters(amountOfLetters);
		
		return temp.toUpperCase();
	}
	
	
	/**
	 * Generates a String of random numbers and lower case letters
	 * 
	 * @param amountOfLetters
	 * @return
	 */
	public static String randomNumbersAndLetters(int amountOfLetters) {
		
		if(amountOfLetters < 0) {
			return "Cannot enter a negative number";
		}
		
		String randomNumbersAndLetters = "";
		
		for(int i = 0; i < amountOfLetters; i++) {
			
			switch(random.nextInt(2)) {
				case 0:
						randomNumbersAndLetters += numbers.charAt(random.nextInt(numberLength));
						break;
						
				case 1:
						randomNumbersAndLetters += lowercaseLetters.charAt(random.nextInt(letterLength));
						break;
						
				default:
						randomNumbersAndLetters = "Error";
						break;
					
				 
			}
			
		}
		
		return randomNumbersAndLetters;
	}
	
	
	
	

}
