package practice_Java_DSA;

import java.util.Scanner;

public class Week1_Problem4 {
	public static void main(String[] args) {
		System.out.println("Enter the inputs :");
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		switch(size) {
		case 29:
			System.out.println("Small");
			break;
		case 30:
			System.out.println("Medium");
			break;
		case 38:
			System.out.println("Large");
			break;
		case 42:
			System.out.println("XLarge");
		default:
			System.out.println("Invalid Size");
			break;
		}
		
	}

}
