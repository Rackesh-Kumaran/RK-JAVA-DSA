package practice_Java_DSA;

import java.util.Scanner;


public class Week3_math3 {
	public static void main(String[] args) {
		System.out.println("enter the inputs : ");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		while(N>0) {
			int R = N%10;
			int Q = N/10;
			
			if(Q==0) {
				System.out.println(R);
			}
			
			N = N/10;
			
		}
	}

}
