package practice_Java_DSA;

public class Week6_recursion01 {
	public static void main (String[] args) {

		// o/p = 1,2,3
		
		int num = 0;
		 fun(num);
		
		
	}

	private static void fun(int a) {
		
		
		if(a==3) {
			return;
		}
		a++;
		System.out.println(a);
		fun(a);
		
	}
	

}
