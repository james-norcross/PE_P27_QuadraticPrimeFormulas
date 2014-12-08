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
		PrimeNumberArray primesTable = new PrimeNumberArray(1000000);
		PrimeNumberArray bArray = new PrimeNumberArray(1000);
		
		int[] primes = primesTable.getPrimeArray();
		int[] b = bArray.getPrimeArray();
		
		QuadraticPrimeExpression qpe = new QuadraticPrimeExpression(0, 0, primes);
		
		int nmax = 0;
		int amax = 0;
		int bmax = 0;
		
		for (int i = 0; i < b.length; i++) {
			for (int a = -1000; a<=1000; a++) {
				qpe.setA(a);
				qpe.setB(b[i]);
				qpe.determinePrimesList();
				if(qpe.getnMax() > nmax) {
					nmax = qpe.getnMax();
					amax = a;
					bmax = b[i];
				}
				qpe.setB(-b[i]);
				qpe.determinePrimesList();
				if(qpe.getnMax() > nmax) {
					nmax = qpe.getnMax();
					amax = a;
					bmax = -b[i];
				}
			}
		}
		
		QuadraticPrimeExpression mostPrimes = new QuadraticPrimeExpression(amax, bmax, primes);
		
		System.out.println(mostPrimes);

	}

}
