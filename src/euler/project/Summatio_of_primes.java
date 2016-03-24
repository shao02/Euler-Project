package euler.project;

import java.util.ArrayList;
import java.util.List;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.
public class Summatio_of_primes {
	public static void main(String[] args){
		System.out.print(sol(2000000));
	}
	private static int sol(int input){
		int cur = 1;
		int sum = 2;
		List<Integer> bag = new ArrayList<Integer>();
		bag.add(2);
		while(true){
			cur += 2;
			if(cur > input)
				return sum;
			if(isPrime(cur,bag)){
				bag.add(cur);
				System.out.println(cur);
				sum += cur;
			}
		}
		
	}
	
	static private boolean isPrime(int cur, List<Integer> bag){
		for(int i: bag)
			if(cur %i == 0)
				return false;
		return true;
	}
	
}
