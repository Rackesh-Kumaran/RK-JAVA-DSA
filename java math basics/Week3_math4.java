package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math4 {
	public static void main (String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int count = 0;
		
		while(N>0){
//            int ld = N%10;
            count = count + 1;
            N=N/10;
        }
        System.out.println(count);
	}

}
