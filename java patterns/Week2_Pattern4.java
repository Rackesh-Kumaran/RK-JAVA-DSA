package practice_Java_DSA;

import java.util.Scanner;

public class Week2_Pattern4 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
	}

}
