package practice_Java_DSA;
import java.util.Scanner;
public class Week1_Problem2 {
	public static void main(String[] args) {
		
		System.out.println("Enter the inputs:");
		Scanner scan1 = new Scanner(System.in);
		
		int N1 = scan1.nextInt();
		int N2 = scan1.nextInt();
		int N3 = scan1.nextInt();
		
		int Sum = N1+N2+N3;
		
		
		if(Sum==180) {
			System.out.println("Triangle can be formed");
		}
		else {
			System.out.println("Triangle can't be formed");
		}
	}

}
