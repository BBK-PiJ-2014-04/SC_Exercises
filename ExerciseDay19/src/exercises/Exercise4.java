package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4 implements Runnable{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String FinishedTask = "";
	int milliseconds;
	int tasknumber;
	
	public Exercise4(int milliseconds) {
		this.milliseconds = milliseconds;
	}
	
	public synchronized static int getUserInput(int i) {
		boolean isInt = false;
		int returnvalue = 0;
		while(!isInt) {
			try {
				System.out.print("Enter the duration (in ms) of task " + i + ":");
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
		for(int n = 0; n <= 10; n++) {
			Exercise4 responsiveUI = new Exercise4(getUserInput(n));
			responsiveUI.tasknumber = n;
			Thread newThread = new Thread(responsiveUI);
			newThread.start();
			if(FinishedTask != "") {
				System.out.println("Finished Tasks:" + FinishedTask);
				FinishedTask = "";
			}
		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(milliseconds);
			FinishedTask += ((Integer)this.tasknumber).toString() + ", ";
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
