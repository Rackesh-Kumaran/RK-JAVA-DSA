package practice_Java_DSA;

import java.util.Scanner;

public class Week3_Contest1 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int count = 0;
		
		for(int i=2;i<=N;i++) {
			int flag =0;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag =1;
				}
			}
			
			if(flag == 0) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
