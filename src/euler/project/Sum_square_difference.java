package euler.project;


//The sum of the squares of the first ten natural numbers is,
//
//12 + 22 + ... + 102 = 385
//The square of the sum of the first ten natural numbers is,
//
//(1 + 2 + ... + 10)2 = 552 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Sum_square_difference {
	public static void main(String[] args){
		System.out.print(sol(100));
	}
	
	static private int sol(int input){
		if(input<2)
			return -1;
		int pre = 1;
		int rt = 0;
		
		for(int i =2; i <= input; i ++){
			rt += 2 * i * (pre);
			pre += i;
		}
		
		return rt;
	}
}
