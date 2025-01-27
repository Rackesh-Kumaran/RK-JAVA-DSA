package practice_Java_DSA;

import java.util.Scanner;

import java.lang.Math;

public class Week3_math10 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int count = 0;
		
		for(int i=1;i<=Math.sqrt(N);i++) {
			
			if(N%i==0) {
				
				count = count+1;
				
				if(N/i != i) {
					
					count = count+1;
					
				}
				
			}
			
		}
		
		if(count == 2) {
			
			System.out.println("it is prime number");
			
		}
		
		else {
			
			System.out.println("it is not a prime number");
			
		}
		
	}

}
