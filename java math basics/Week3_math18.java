package practice_Java_DSA;

import java.util.Scanner;

public class Week3_math18 {
	public static void main(String[] args) {
		System.out.println("enter the inputs:");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0 , i = 1;
		
		while(i*i<n){
            count++;
            i++;
        }
		
		System.out.println(count);
	}

}
