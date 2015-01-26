package exercises;

import java.util.Scanner;

public class Exercise3 {
	
	public static double meanAverage() {
		double avg = 0;
		double num = 0;
		double sum = 0;
		System.out.println("Please enter 10 number to calculate their mean average");
		for(int i = 1; i < 11; i++) {
			Scanner in = new Scanner(System.in);
		    System.out.println("Enter the " + i + " number:");
		    try {
		    	num = Double.parseDouble(in.nextLine());
		    	sum += num;
		    } catch (Exception ex) {
		    	System.out.println("The last input inserted was not a number. Please try again");
		    	i--;
		    } 
		}
		return sum/10;
	}
	
	public static void main(String [] args)
	{
		System.out.println(meanAverage());
	}
}
