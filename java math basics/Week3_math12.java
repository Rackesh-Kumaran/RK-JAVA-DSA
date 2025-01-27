package practice_Java_DSA;

import java.util.Scanner;

import java.lang.Math;

public class Week3_math12 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int sum = 1;
		
		for(int i = 2; i <= Math.sqrt(N); i++) {
			
			if(N%i == 0) {
				
				sum = sum + i;
				
				if(N/i != i) {
					
					sum = sum + N/i;
					
				}
			}
		}
		
		if(sum == N) {
			
			System.out.println( "it is a perfect Number");
			
		}
		
		else {
			
			System.out.println( "it is not  a perfect Number");
			
		}
	}

}
