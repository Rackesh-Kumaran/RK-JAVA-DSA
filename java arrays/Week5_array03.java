package practice_Java_DSA;

import java.util.Scanner;

public class Week5_array03 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean isPalindrome = true;
		
		
		int []arr = new int[n];
		
		for(int i=0;i<n;i++) {
			 arr[i] = scan.nextInt(); 
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i] != arr[n-1-i]) {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
	}

}
