package euler.project;

//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class EvenFibonacci {
	public static void main(String[] args){
		int end = 4000000;
		int first = 1;
		int sec = 2;
		int sum = 0;
		while(sec <= end){
			if(sec % 2 == 0)
				sum += sec;
			int tmp = first + sec;
			first = sec;
			sec = tmp;
		}
		System.out.print(sum);
	}
}
