package practice_Java_DSA;

import java.util.Scanner;


public class week3_math13 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int gcd = 1;
		
		for(int i=2;i<=a;i++) { 
			
			if(a%i==0 && b%i==0) {
				
				gcd = i;
				
			}
		}
		System.out.println( gcd + " this is gcd ");
	}

}
