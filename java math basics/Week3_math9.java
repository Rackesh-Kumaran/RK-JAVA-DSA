package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math9 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int  fact = 1 ;
		
		for(int i=1;i<=N;i++) {
			fact = fact * i;
		}
		System.out.println(fact + " is  factorial number");
	}

}
