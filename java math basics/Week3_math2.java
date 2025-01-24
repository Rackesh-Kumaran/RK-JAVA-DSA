package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math2 {
	public static void main (String[] args) {
		
		System.out.println("enter the inputs: ");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n>0) {
			int ld = n%10;
			System.out.println(ld);
			
			n = n/10;
		}
		

		
	}

}
