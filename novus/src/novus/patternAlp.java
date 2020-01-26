package novus;

import java.util.Scanner;

public class patternAlp {
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		
		String letter = scanner.nextLine().toUpperCase();
		String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int position = alph.indexOf(letter);

        for (int i = 0; i <= position; i++) {
            
        	int alphabet = 65;
            for (int j = position; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            
            System.out.println();
        }
        
        for (int i = 0; i <= position; i++) {
        	
            int alphabet = 65;
            for (int j = -1; j <= i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= (position-1) - i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            
            System.out.println();
        }
    }
}