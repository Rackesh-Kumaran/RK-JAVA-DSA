package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math8 {
	public static void main (String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int rev = 0;
		int x = N;
		
        while(N > 0) {
			
			int l = N%10;
			rev = rev*10 + l;
			N = N/10;
					
		}
		
        if(rev != x) {
        	
        	System.out.println(rev);
			System.out.println("reverse");
		}
		
		else if (rev == x) {
			
			System.out.println(rev);
			System.out.println(" reverse but palindrome");
		}
        
		else {
			System.out.println(rev);
			System.out.println(" Not a reverse ");
		}


	}

}
