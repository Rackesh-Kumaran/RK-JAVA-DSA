package practice_Java_DSA;

import java.util.Scanner;

public class Week1_Problem7 {
	public static void main(String[] args) {
		System.out.println("Enter the inputs : ");
		
		Scanner scan = new Scanner(System.in);
		
		String L1 = scan.next();
		String L2 = scan.next();
		int N = scan.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println(L1+L2);
		}
		
		
		
	}

}
