package novus;

import java.util.Scanner;

public class bigInt {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three digits: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a);
		} else if (b>a && b>c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
