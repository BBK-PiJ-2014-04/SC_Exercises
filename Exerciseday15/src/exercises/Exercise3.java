package exercises;

import java.util.Scanner;

public class Exercise3 {
	
	public static double meanAverage() {
		double avg = 0;
		double num = 0;
		double sum = 0;
		System.out.println("Please enter 10 number to calculate their mean average");
		for(int i = 0; i < 10; i++) {
			Scanner in = new Scanner(System.in);
		    System.out.println("Enter the " + i + " number");
		    try {
		    	num = Double.parseDouble(in.nextLine());
		    	sum += num;
		    } catch (Exception ex) {
		    	System.out.println("The last input inserted was not a number");
		    } finally {
		    	i--;
		    }
		}
		return avg;
	}
	
	public static void main(String [] args)
	{
		meanAverage();
	}
}
