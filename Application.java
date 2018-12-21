
public class Application {
	public static void main(String [] args) {
		
		//Testing the randomNumbers method
		System.out.println(RandomNumbersAndLetters.RandomNumbers(0));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(1));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(2));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(3));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(4));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(5));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(6));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(7));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(8));
		System.out.println(RandomNumbersAndLetters.RandomNumbers(9));
		
		//Testing the RandomNumberAsInt method
		System.out.println(RandomNumbersAndLetters.RandomNumbersAsInt(0));
		
		//Testing the randomlowerCaseLetters method
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(0));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(1));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(2));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(3));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(4));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(5));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(7));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(8));
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(9));
		
		System.out.println(RandomNumbersAndLetters.randomLowerCaseLetters(-1));
		
		//Testing the randomUpperCaseLetters method
		System.out.println(RandomNumbersAndLetters.randomUpperCaseLetters(5));
		System.out.println(RandomNumbersAndLetters.randomUpperCaseLetters(-1));
		
		
		//Testing the randomNumbersAndLetters method
		System.out.println(RandomNumbersAndLetters.randomNumbersAndLetters(5));
		System.out.println(RandomNumbersAndLetters.randomNumbersAndLetters(20));
		System.out.println(RandomNumbersAndLetters.randomNumbersAndLetters(0));
		System.out.println(RandomNumbersAndLetters.randomNumbersAndLetters(-1));
		
		
	}

}
