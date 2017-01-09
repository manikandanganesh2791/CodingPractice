
public class Memoization {
	static int fib(int n){
		int[] lookup = new int[n];
		for(int i=0; i<lookup.length; i++){
			lookup[i] = 0;
		}
		if(lookup[n] == 0){
			if(n<=1)
				lookup[n] = n;
			else
				lookup[n] = fib(n-1) + fib(n-2);
		}
		return lookup[n];
	}
	
	public static void main(String[] args){
		Integer fibval = fib(5);
	}
}
