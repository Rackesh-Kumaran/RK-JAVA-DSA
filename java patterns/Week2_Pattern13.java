package practice_Java_DSA;

import java.util.Scanner;

public class Week2_Pattern13 {
	public static void main(String[] args) {
		System.out.println("Enter the inputs: ");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int count = 1;
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println("");
			
		}
		
	}

}
