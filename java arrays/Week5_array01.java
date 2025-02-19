package practice_Java_DSA;

import java.util.Scanner;

public class Week5_array01 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0;i<n;i++) {
			 arr[i] = scan.nextInt(); 
		}
		
		for(int i=0;i<n;i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
