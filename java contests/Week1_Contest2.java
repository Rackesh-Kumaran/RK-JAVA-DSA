package practice_Java_DSA;

import java.util.Scanner;

public class Week1_Contest2 {
	public static void main(String[] args) {
		System.out.println("enter the inputs: ");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
			
	}

}
