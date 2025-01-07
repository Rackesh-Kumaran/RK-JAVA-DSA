package practice_Java_DSA;

import java.util.Scanner;


public class Week1_Problem5 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		for(int i=1;i<=y;i++) {
			System.out.println(x);
		}
	}

}
