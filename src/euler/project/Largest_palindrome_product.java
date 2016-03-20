package euler.project;

//A palindromic number reads the same both ways. The largest palindrome 
//made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class Largest_palindrome_product {
	public static void main(String[] args){
		
	}
	
	static private int sol(int digit){
		if(digit < 1)
			return -1;
		for(int i = (int) (Math.pow(10, digit) -1); i>= Math.pow(10, digit-1); i -- ){
			for(int j = i; j>= Math.pow(10, digit-1); j -- ){
				if(isPalin(String.valueOf(i * j))){
					return i * j;
				}
			}
		}
		return -1;
	}
	
	static private boolean isPalin(String i){
	    return i.equals(new StringBuilder(i).reverse().toString());
	}
}
