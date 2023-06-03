/*
 * Written By Ty West
 */

import java.util.Scanner;
public class ValidDate{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a date in the format MM/DD/YYYY");
	// This is used to separate the month day and year.
	String input = keyboard.nextLine();
	String copyInput = input;
	int workingIndex = copyInput.indexOf("/");
	int month = Integer.parseInt(copyInput.substring(0,workingIndex));
	copyInput =copyInput.substring(workingIndex+1);
	int day = Integer.parseInt(copyInput.substring(0,workingIndex));
	copyInput =copyInput.substring(workingIndex+1);
	int year = Integer.parseInt(copyInput.substring(0,4));
	boolean dayCheck = false;
	boolean monthCheck = false;
	// This is to check if the month is a valid month
	if (month <= 12 && month > 020) {
	 monthCheck = true;
	}
	if ( month > 12) {
		System.out.println(""+input+" is not a valid date. There are only 12 months in a year.");
	}
	if (day <= 30 && day > 0) {
	dayCheck = true;
	//This is to check for leap year	
	if (day >= 29) {
		if (month == 2) {
			if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
			dayCheck = false;
			System.out.println(""+input+" is not a valid date. It is not a leap year, febuary only has 28 days!");
			}
		}
	}
		if (day >= 30 && month == 2) {
			dayCheck = false;
			System.out.println(""+input+" is not a valid date. It is not a leap year, febuary only has 28 days!");
		}
	}
	// This is for all the months with 31 days
	if (day == 31) {
		if (month == 3 || month == 1) {
			dayCheck = true;
			if (month == 5 || month == 7) {
				dayCheck = true;
				if (month == 8 || month == 10) {
					if (month == 12) {
						dayCheck = true;
					}
				}
			}
		}
		System.out.println(""+input+" is not a valid date, only certain months have 31 days");
	}
	// This is the final check to make sure that the date is valid
	if (dayCheck == true && monthCheck == true) {
		System.out.println(""+input+" is a valid date.");
	}
	}
}
