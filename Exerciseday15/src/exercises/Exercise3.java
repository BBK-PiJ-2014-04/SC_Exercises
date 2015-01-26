package exercises;

import java.util.Scanner;

public class Exercise3 {
	
	public static double meanAverage() {
		double sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 10 number to calculate their mean average");
		for(int i = 1; i < 11; i++) {
		    System.out.println("Enter the " + i + " number:");
		    try {
		    	sum += Double.parseDouble(in.nextLine());
		    } catch (Exception ex) {
		    	System.out.println("The last input inserted was not a number. Please try again");
		    	i--;
		    }
		}
		in.close();
		return sum/10;
	}
	
	public static void main(String [] args)
	{
		System.out.println(meanAverage());
	}
}
