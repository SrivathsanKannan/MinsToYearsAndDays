package MinsToYearsAndDays;

import java.util.Scanner;

class MinsToYrsDays {
	public static void main (String[] args) {
	  int mins;
	  Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of minutes to be converted: ");
		mins = s.nextInt();
		int year = mins / 525600;
		int remainingMins = mins % 525600;
		int day = remainingMins / 1440;
		System.out.println(mins + " minutes is approximately" + year + " years and " + day + " days");
	}
}
