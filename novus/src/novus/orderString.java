package novus;

import java.util.Arrays;
import java.util.Scanner;

public class orderString {
	
	public static void main(String[] args) {
		
		String temp;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of names: ");
		int num = scanner.nextInt();
		String names[] = new String[num];
		
		if(num != 0) {
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Enter names ");
			
			for(int i = 0; i < num; i++) {
				System.out.print("Enter name " + (i+1) + ": ");
				names[i] = scanner2.nextLine();
			}
			
			Arrays.sort(names);
			System.out.println(Arrays.toString(names));
			
//			for(int j = 0; j < num-1; j++) {
//				for(int k = j+1; k < num; k++) {
//					if(names[k-1].compareTo(names[k])>0) {
//						temp = names[k-1];
//						names[k-1] = names[k];
//						names[k] = temp;
//					}
//				}
//			}
//			
//			for(String s:names) {
//				System.out.println(s);
//			}

		} else {
			System.out.println("Length cannot be 0");
		}
		
	}
	
}
