package practice_Java_DSA;

public class Week6_recursion03 {
	public static void main(String[] args) {
		
		
		// recursion in factorial
		
		
		int num = 5;
		System.out.println(fun(num));
		
	}
	
	public static int fun(int n) {
		if(n==0) {
			return 1;
		}
		else {
			
			 return n*fun(n-1);
		}
	}

}
