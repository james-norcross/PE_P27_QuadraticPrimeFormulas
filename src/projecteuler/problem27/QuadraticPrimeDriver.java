package projecteuler.problem27;

public class QuadraticPrimeDriver {

	/**
	 * Author: James Norcross
	 * Date: 12/8/14
	 * Purpose: Project Euler Problem 27
	 * Description:  Examines quadratic expressions of form n^2 + an + b, where |a|<1000 and |b|<1000.  Finds product a*b for expression
	 * that generates the longest series of prime numbers for n>=0
	 */
	public static void main(String[] args) {

		// generate a prime number array with maximum value 1000
		PrimeNumberArray primeArray = new PrimeNumberArray(1000);
		
		int[] primes = primeArray.getPrimeArray();
		
		for(int i = 0; i < primes.length; i++)
			System.out.println(primes[i]);
	}

}
