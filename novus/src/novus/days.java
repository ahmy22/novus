package novus;

import java.util.Scanner;

public class days {
	
	public static void main(String args[]) {
		
		int days = 0;
		String monthName = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a month number between 1 and 12: ");
		int month = scanner.nextInt();
		
		System.out.println("Please enter a year: ");
		int year = scanner.nextInt();
		
		switch(month) {
			case 1:
				monthName = "Jan";
				days = 31;
				break;
			case 2:
				monthName = "Feb";
				if ((year % 4 == 0) || (year % 100 != 0) || (year % 400 == 0)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 3:
				monthName = "March";
				days = 31;
				break;
			case 4:
				monthName = "April";
				days = 30;
				break;
			case 5:
				monthName = "May";
				days = 31;
				break;
			case 6:
				monthName = "June";
				days = 30;
				break;
			case 7:
				monthName = "July";
				days = 31;
				break;
			case 8:
				monthName = "Aug";
				days = 31;
				break;
			case 9:
				monthName = "Sept";
				days = 30;
				break;
			case 10:
				monthName = "Oct";
				days = 31;
				break;
			case 11:
				monthName = "Nov";
				days = 30;
				break;
			case 12:
				monthName = "Dec";
				days = 31;
				break;			
		}
		
		System.out.printf("Number of days in " + monthName + " in year " + year + " is: " + days);
		
	}
	
}
