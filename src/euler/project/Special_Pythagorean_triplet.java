package euler.project;


//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a2 + b2 = c2
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
public class Special_Pythagorean_triplet {
	public static void main(String[] args){
		System.out.print(sol());
	}
	
	private static int sol(){
		int x,y;
		for(x =1; x<500; x++){
			for(y=500; y>0; y--){
				if(x*x + y*y == (1000 - x - y) * (1000 - x - y)){
					System.out.print("x:"+x +" y:"+y +" z:"+(1000-x-y) +" ");
					return x*y*(1000-x-y);
				}	
			}
		}
		return -1;
	}
}




