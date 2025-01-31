package practice_Java_DSA;

import java.util.Scanner;

public class Week3_Contest2 {
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
		System.out.println(gcd + "this is gcd of given numbers");
		
		int lcm = (a*b)/gcd;   // lcm => formula => n1*n2/gcd(a,b) 
		System.out.println(lcm + "this is lcm of given numbers");
		
		
		
	}

}
