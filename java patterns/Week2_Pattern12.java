package practice_Java_DSA;

import java.util.Scanner;

public class Week2_Pattern12 {
	public static void main(String[] args) {
		System.out.println("enter the inputs: ");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1;i<=N-1;i++) {
			for(int j=1;j<=N-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
			
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*N)-(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
