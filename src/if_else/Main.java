package if_else;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// data
		int number;
		
		System.out.printf("Write a number: ");
		number = sc.nextInt();
		
		// compare
		if (number < 0) {
			System.out.println("Your number is negative.");
		}
		
		else {
			System.out.println("Your number is positive.");
		}

	}

}
