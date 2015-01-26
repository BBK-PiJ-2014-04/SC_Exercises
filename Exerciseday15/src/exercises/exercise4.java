package exercises;

import java.util.Scanner;

public class exercise4 {
	
	
	
	public static void addPatient() {
		Patient listOfPatients = null;
		String name;
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert Patient Name");
		name = in.nextLine();
		System.out.println("Please insert Patient Age");
		age = Integer.parseInt(in.nextLine());
		if(listOfPatients == null) {
			listOfPatients = new Patient(name,age);
		}
		else {
			listOfPatients.addPatient(new Patient(name,age));
		}
	}
	
	public static void main(String [] args)
	{
		addPatient();
	}
}
