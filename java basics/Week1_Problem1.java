package practice_Java_DSA;
import java.util.Scanner;

public class Week1_Problem1 {
	public static void main(String[] args) {
		System.out.println("enter the inputs: ");
		Scanner scan1 = new Scanner(System.in);
		
		int Number = scan1.nextInt();
		char letter = scan1.next().charAt(0);
		String word = scan1.next();
		
		System.out.println(Number);
		System.out.println(letter);
		System.out.println(word);
		
		
	}

}
