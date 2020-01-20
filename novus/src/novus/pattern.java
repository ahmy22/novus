package novus;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a digit: ");
		int a = scanner.nextInt();
		
		for (int i = 1; i <= a; i++) {
			for (int b = 1; b > 0; b--) {
				//System.out.print(b + " ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		for (int x = a; x > 0; x--) {
			for (int y = 1; y < x; y++) {
				System.out.print(y + " ");
			}
			System.out.println("");
			
		}
	}

}
