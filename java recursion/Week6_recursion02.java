package practice_Java_DSA;

public class Week6_recursion02 {
	public static void main(String[] args) {

		//o/p = 5,4,3,2,1
		
		int s = 5 ;
		fun(s);
		
		
	}
		
		public static void fun(int n) {
			
			if(n==0) {
				return;
			}
			else {
				System.out.println(n);
				fun(n-1);
			}
		}

}
