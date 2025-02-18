package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math17 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 long sum =0,x=0;
		 
		 for(long i=1;i<=(2*n-1);i=i+2){
	            x = x+i;
	            sum = sum+x;
	        }
		 System.out.println(sum);
	}

}
