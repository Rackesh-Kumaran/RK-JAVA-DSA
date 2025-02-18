package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math15 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0;i<=n;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
	}

}
