package euler.project;

import java.util.ArrayList;
import java.util.List;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?
public class Nst_prime {
	public static void main(String[] args){
		System.out.print(sol(10001));
	}
	
	private static int sol(int input){
		if(input == 1)
			return 2;
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int i = 1;
		while(true){
			i = i+2;
			if(!isPrime(i, primes)){
				primes.add(i);
				if(primes.size() == input)
					return primes.get(input - 1);		
			}
		}
	}
	
	private static boolean isPrime(int input, List<Integer> primes){
		for(int i : primes){
			if(input % i == 0)
				return true;
		}
		return false;
	}
}
