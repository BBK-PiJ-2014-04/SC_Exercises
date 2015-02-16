package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public synchronized int getUserInput(int i) {
		boolean isInt = false;
		int returnvalue = 0;
		while(!isInt) {
			try {
				System.out.print("Enter the duration (in ms) of task" + i + ":");
				returnvalue = Integer.parseInt(br.readLine());
				isInt = true;
			}
			catch(Exception ex)
			{
				System.out.println("Please insert a number!");
			}
		}
		return returnvalue;
	}
	
	public static void main(String args[]) {
		Exercise4 responsiveUI = new Exercise4();
		int i = responsiveUI.getUserInput(1);
	}
}
