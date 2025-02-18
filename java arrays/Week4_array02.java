package practice_Java_DSA;

import java.util.Scanner;

public class Week4_array02 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 int []arr = new int[n];
		 
		 int sum = 0;
		 
		 for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt(); 
		 }
		 
		 for(int i=0;i<n;i++) {
			sum = sum+arr[i];
		 }
		 
		 System.out.println(sum);
	}

}
