package projecteuler.problem27;

import java.util.ArrayList;
import java.util.Arrays;

public class QuadraticPrimeExpression {
	/*
	 * Class to evaluate quadratic expressions of form n^2 + an + b with n>=0 used to generate prime numbers.
	 */
	
	private int a;
	private int b;
	private int[] primesTable;
	private ArrayList<Integer> primesList;
	int nMax;
	
	public QuadraticPrimeExpression(int a, int b, int[] primesTable) {
		this.a = a;
		this.b = b;
		this.primesTable = primesTable;
		this.primesList = new ArrayList<Integer>();
		determinePrimesList();
	}
	
	
	public ArrayList<Integer> getPrimesList() {
		return primesList;
	}

	public int getnMax() {
		return nMax;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setPrimesTable(int[] primesTable) {
		this.primesTable = primesTable;
	}

	public void determinePrimesList() {
		
		int candidate = b;
		int n = 0;
		
		// check whether candidate result of expression is prime
		while(Arrays.binarySearch(primesTable, candidate) >= 0) {
			primesList.add(candidate);
			n++;
			candidate = (n*n) + (a*n) + b;
		}
		
		nMax = n - 1;		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("The quadratic expression n^2 + " + a + "n + " + b + " generates " + (nMax+1) + " primes\n");
		for(int prime : primesList)
			sb.append(prime + "\n");
		return sb.toString();
	}

}
