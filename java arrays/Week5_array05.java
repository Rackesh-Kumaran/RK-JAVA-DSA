package practice_Java_DSA;

import java.util.Scanner;
import java.math.*;

public class Week5_array05 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the array range :");
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 
		// Input elements for  array
	       
	        System.out.println("Enter elements of  array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        
	        // make all the values in array as 1;
	        for(int i=0;i<n;i++) {
	        	 arr[i] = 1;
	        }
	        
	        // Sieve of Eratosthenes to find prime numbers:
	        
	        for(int i=2;i<=Math.sqrt(n);i++) {
	        	if(arr[i]==1) {
	        		for(int j=i*2;j<n;j=j+i) {
	        			arr[j] = 0;
	        		}
	        	}
	        }
	        
	        System.out.println("print prime number from 10 to 20");
	        int Sum = 0;
	        for(int i=10;i<n;i++) {
	        	if(arr[i]==1) {
	        		System.out.println(i);
	        		Sum = Sum + i;
	        	}
	        }
	        
	        System.out.println("sum of all prime numbers " + Sum);
	        
	        
	}

}
