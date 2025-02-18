package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math16 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0 , SeriesTerms = 0;
		
		for(int i=1;i<=n;i++) {
			sum = sum + i;
			SeriesTerms += sum;
		}
		System.out.println(SeriesTerms);
		
	}

}
