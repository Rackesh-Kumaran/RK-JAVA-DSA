package practice_Java_DSA;

import java.io.*;
import java.util.Scanner;

public class Week2_Contest1 {
	
	public static void main(String[] args) {
		
		System.out.println("enter the inputs : ");
		
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        int n = 1;
        
        for(int i=1;i<=N;i++){
        	
            for(int j=1;j<=N;j++){
            	
                System.out.print(n);
                n++;
            }
            
            System.out.println("");
        }
        
	}
	
}
