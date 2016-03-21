package euler.project;

import java.util.List;
import java.util.ArrayList;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Smallest_multiple {
	public static void main(String[] args){
		System.out.print(sol(10));
	}
	
	static public int sol(int input){
		List<Integer> bag = new ArrayList<Integer>();
		int rt = 1;
		for(int i = 2; i<=input; i++){
			int tmp = i;
			for(int j : bag){
				if(tmp % j == 0)
					tmp /= j;
			}
			bag.add(tmp);
		}
		for(int j : bag){
			rt *=j;
		}
		return rt;
	}
}
