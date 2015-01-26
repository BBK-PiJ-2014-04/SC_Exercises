package exercises;

import java.util.Scanner;

public class Exercise3 {
	
	public static double meanAverage(int numberOfNumbers) {
		double sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter " + numberOfNumbers + " number to calculate their mean average");
		for(int i = 1; i < numberOfNumbers+1; i++) {
		    System.out.println("Enter the " + i + " number:");
		    try {
		    	sum += Double.parseDouble(in.nextLine());
		    } catch (Exception ex) {
		    	System.out.println("The last input inserted was not a number. Please try again");
		    	i--;
		    }
		}
		in.close();
		return sum/numberOfNumbers;
	}
	
	public static double improvedMeanAverage() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of numbers you want to insert");
		return meanAverage(Integer.parseInt(in.nextLine()));
	}
	
	public static void main(String [] args)
	{
		//System.out.println(meanAverage(10)); //Test for part a
		System.out.println(improvedMeanAverage()); //Test for part b
	}
}
