package practice_Java_DSA;

import java.util.Scanner;

public class Week1_Problem6 {
	public static void main(String[] args) {
		System.out.println("Enter the inputs: ");
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		
		int i=1;
		while(i<=10) {
			int m = i*N;
			System.out.println(m);
			i++;
		}
	}

}
