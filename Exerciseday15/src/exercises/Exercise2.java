package exercises;

import java.awt.List;

public class Exercise2 {
	
	
	
	public static void wrongExHandler(){
		List list = new List(); 
		String newElement = "test";
		try {
			// more code here
			list.add(newElement);
			// more code here
			} catch (Exception ex) {
				ex.printStackTrace();
				
			} /*catch (NullPointerException ex) { 
				ex.printStackTrace();
			}*/
			//this shouldn't be here, as it is unreachable (I've commented it out to make the code compilable). The first catch block will catch all the exceptions.
	}
	
	public static void CorrectExHandler(){
		List list = new List(); 
		String newElement = "test";
		try {
			list.add(newElement);
			list = null;
			list.add(newElement);
			int f = 1/0;
			} catch (NullPointerException ex) {
				System.out.println("Methods have been called on Null Objects");
				ex.printStackTrace();
			} catch (Exception ex) {
				System.out.println("A generic exception has been thrown");
				ex.printStackTrace();
			} 
	}
	
	public static void main(String [] args)
	{
		CorrectExHandler();
	}
	
}
