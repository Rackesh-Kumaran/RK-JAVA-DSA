package practice_Java_DSA;

import java.util.Scanner;

public class Week3_Contest3 {
	public static void main(String[] args) {
		
		System.out.println("enter the inputs:");
		
		Scanner scanner = new Scanner(System.in);
		
        int n = scanner.nextInt();
      
        
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  
            n /= 10;        
        }

       
        System.out.println(sum);
	}

}
