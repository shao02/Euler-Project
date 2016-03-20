package euler.project;
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
public class Largest_prime_factor {
	public static void main(String[] args){
		double a = 600851475143.0;
		System.out.print(maxPrime(a));
	}
	
	private static double maxPrime(double input){
		double limit = Math.sqrt(input);
		for(int i =3; i< limit; i= i +2){
			if(input%i==0){
				double next = input/i;
				return maxPrime(next);
			}
		}
		return input;
	}
}
