package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math5 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
	
		int ld = N%10;
		
		int fd = N;
		while(fd>=10) {
			fd = fd/10;	
		}
		
		System.out.println(ld+fd);
				
	}

}
