package oe;

public class OrderEntry {
	public static void main(
			String[] args) { /*
								 * // Declare and initialize two variables
								 * double item1; // Declare one variable double
								 * item2; // Declare another variable
								 * 
								 * item1 = 2.95; // Assign value to item1 item2
								 * = 3.50; // Assign value to item2
								 * 
								 * // These 4 statements could be combined into
								 * a single // statement as follows: // float
								 * item1 = 2.95, item2 = 3.50;
								 * 
								 * 
								 * int line = 1, numOfDays = 2; // other
								 * variables used // throughout the program
								 * boolean tooExpensive; double itemTotal,
								 * total, taxRate = 1.0825;
								 * 
								 * 
								 * 
								 * // Display the cost of the two items
								 * System.out.println(item1);
								 * System.out.println(item2);
								 * 
								 * // Display more meaningful messages
								 * System.out.println( "Item " + line++ +" is "
								 * + item1 + " * " + numOfDays + " days = "
								 * +(item1 * numOfDays)); System.out.println(
								 * "Item " + line++ +" is " + item2 + " * " +
								 * numOfDays + " days = " +(item2 * numOfDays));
								 * 
								 * System.out.println("Order Entry Application"
								 * );
								 * 
								 * // Calculate and display the total of the
								 * items itemTotal = ((item1 * numOfDays) +
								 * (item2 * numOfDays));
								 * System.out.println("Item Total: " +
								 * itemTotal);
								 */

		int day = 29, month = 8, year = 2001;
		System.out.println(day + "/" + month + "/" + year);

		int numberOfDays;
		switch (month) {
		case 2:
			numberOfDays = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDays = 30;

		default:
			numberOfDays = 31;
			break;
		}
		
		if(day>numberOfDays) {
			System.out.println("This day is not valid");
			return;
		}
		System.out.println(numberOfDays + " Days in the month");
		for (int i = day, j = 0; j < 10 && i <= numberOfDays; j++, i++) {
			System.out.println(i + "/" + month + "/" + year);
		}

		if (year % 4 == 0 && year % 100 != 0)
			System.out.println("This is a Leap year");

		int dueDay, dueMonth=month, dueYear=year;
		int rentalDays = 3;
		dueDay = day + rentalDays;
		if (dueDay > numberOfDays) {
			dueDay = dueDay-numberOfDays;
			dueMonth = month + 1;
			if (dueMonth > 12) {
				dueMonth = 1;
				dueYear = year;
			}

		}
		System.out.println("Date Due Back:"+dueDay+"/"+dueMonth+"/"+dueYear);
	}
}
