package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the inputs: ");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
		
	}

}
