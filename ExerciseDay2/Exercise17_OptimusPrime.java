import java.util.Scanner;
public class Exercise17_OptimusPrime
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print("Please write your number here to find their closest prime number:"); 
String input = System.console().readLine();
boolean prime = true;
int inputvalue = Integer.parseInt(input);
int stepDecreasing = 0;
int stepIncreasing = 0;
int ClosestDecreasing = 0;
int ClosestIncreasing = 0;
boolean isPrimeGoingDecreasing = true;
boolean isPrimeGoingIncreasing = true;
if(inputvalue > 0) {
	int enquiredInt = inputvalue;

	while(isPrimeGoingDecreasing) {
		prime = true;
		if(enquiredInt > 2) {
			for(int i = 2; i < enquiredInt; i++) {
				if(enquiredInt % i == 0) {
					prime = false;
					break;
				}
			}
		}
		if(prime || enquiredInt < 3) {
			ClosestDecreasing = enquiredInt;		
			isPrimeGoingDecreasing = false;
		}
		else {
			enquiredInt--;
			stepDecreasing++;
		}
	}
	enquiredInt = inputvalue;
	if(ClosestDecreasing != enquiredInt) {
		while(isPrimeGoingIncreasing) {		
			prime = true;
			if(enquiredInt > 2) {
				for(int i = 2; i < enquiredInt; i++) {
					if(enquiredInt % i == 0) {
						prime = false;
						break;
					}
				}
			}
			if(prime || enquiredInt < 3) {				
				ClosestIncreasing = enquiredInt;			
				isPrimeGoingIncreasing = false;
			}
			else {
				enquiredInt++;
				stepIncreasing++;
			}
			if(stepIncreasing > stepDecreasing) {
				break;
			}

		}
	}
	if(stepIncreasing > stepDecreasing || stepDecreasing == 0) {
		System.out.println("The Closest prime is " + ClosestDecreasing);
	}
	else if(stepIncreasing < stepDecreasing) {
		System.out.println("The Closest prime is " + ClosestIncreasing);
	}
	else {
		System.out.println("The Closest prime are " + ClosestDecreasing + " and " + ClosestIncreasing);
	}
}
else
{
	System.out.println("The input is invalid. Please do not insert strings or numbers lower than 1");
}
}}

