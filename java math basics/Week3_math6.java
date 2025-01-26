package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math6 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int k = 1;
		
		long power = (long)Math.pow(A, B);
		long i = 1;
		
		while(power > 0) {
			long ans = power%10;
			
			if(k==i) {
				System.out.println(ans);
			}
			
			i++;
			power = power/10;
			
		}
		
	}

}
