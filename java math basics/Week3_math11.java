package practice_Java_DSA;

import java.util.Scanner;

import java.lang.Math;

public class Week3_math11 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1;i<=Math.sqrt(N);i++) {
			
			if(N%i==0) {
				
				System.out.println(i);
				
				if(N/i != i) {
					
					System.out.println(N/i);
					
				}
				
			}
			
		}
		
	}

}
