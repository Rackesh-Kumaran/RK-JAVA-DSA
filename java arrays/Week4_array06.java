package practice_Java_DSA;

import java.util.Scanner;

public class Week4_array06 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt(); 
		}
		
		int min = arr[0];
		
		for(int i=1;i<n;i++) {
			
			if(arr[i]<arr[0]) {
				min = arr[i];
			}
			
		}
		System.out.println(min);
	}

}
