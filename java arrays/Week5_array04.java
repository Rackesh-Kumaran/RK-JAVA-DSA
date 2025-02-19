package practice_Java_DSA;

import java.util.Scanner;

public class Week5_array04 {
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		 
		 // Get size of first array
	        System.out.print("Enter the size of first array: ");
	        int n1 = sc.nextInt();
	        int[] arr1 = new int[n1];
	        
	    // Input elements for first array
	        
	        System.out.println("Enter elements of first array:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }
	        
	        
	     // Get size of second array
	        System.out.print("Enter the size of second array: ");
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];
	        
	        
	        
	        // Input elements for second array
	        System.out.println("Enter elements of second array:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }
	        
	        
	        
	        // Find max in arr1
	        int max1 = arr1[0];
	        for (int i = 1; i < n1; i++) {
	            if (arr1[i] > max1) {
	                max1 = arr1[i];
	            }
	        }
	        
	        
	     // Find min in arr2
	        int min2 = arr2[0];
	        for (int i = 1; i < n2; i++) {
	            if (arr2[i] < min2) {
	                min2 = arr2[i];
	            }
	        }
	        
	        
	     // Calculate the product
	        int product = max1 * min2;

	        // Output the result
	        System.out.println("Maximum in first array: " + max1);
	        System.out.println("Minimum in second array: " + min2);
	        System.out.println("Product: " + product);

	        sc.close();
		
	}

}
