package euler.project;

//The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
//
//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//
//Let us list the factors of the first seven triangle numbers:
//
// 1: 1
// 3: 1,3
// 6: 1,2,3,6
//10: 1,2,5,10
//15: 1,3,5,15
//21: 1,3,7,21
//28: 1,2,4,7,14,28
//We can see that 28 is the first triangle number to have over five divisors.
//
//What is the value of the first triangle number to have over five hundred divisors?

public class Highly_divisible_triangular_number {
	
	public static void main(String[] args){
		//System.out.print(convertStringToInt("22"));
		System.out.print(checkSum(28));
	}
	
	
	private static int highlyDivisible(int input){
		int index = 1;
		int sum = 0;
		while(true){
			sum += index;
			if(checkSum(sum) > 500){
				
			}
			index++;
			return -1;
		}
	}
	
	private static int checkSum(int sum){
		int count = 0;
		int pre = 1;
		for(int i=1; i<sum; i++){
			if(sum % i == 0 && sum / i == pre)
				break;
			if(sum % i == 0){
				pre = i;
				count += 2;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
